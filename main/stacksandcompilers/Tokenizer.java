package stacksandcompilers;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.Reader;

public class Tokenizer {

	public static final int SLASH_SLASH = 0;
	public static final int SLASH_STAR = -1;

	private PushbackReader in;
	private char ch;
	private int currentline, errors;

	public Tokenizer(Reader inStream) {
		in = new PushbackReader(inStream);
		errors = 0;
		ch = '\0';
		currentline = 1;
	}

	public int getLineNumber() {
		return currentline;
	}

	public int getErrorCount() {
		return errors;
	}

	public char getNextOpenClose() {
		
		while(nextChar()) { 
			if(ch == '/') { 
				processSlash();
			} else if(ch == '\'' || ch == '"') { 
				skipQuote(ch);
			} else if (ch == '{' || ch == '[' || ch == '(' || ch == ')' || ch == ']' || ch == '}') { 
				return ch;
			}
		}
		
		return '\0';
	}

	public char getNextID() {
		return '\0';
	}

	private boolean nextChar() {
		try {
			int readVal = in.read();
			if (readVal == -1) {
				return false;
			}
			ch = (char) readVal;
			if (ch == '\n') {
				currentline++;
			}
			return true;
		} catch (IOException e) {
			return false;
		}
	}

	private void putBackChar() {

	}

	private void skipComment(int start) {
		if (start == SLASH_SLASH) {
			while (nextChar() && (ch != '\n')) {
				;
			}
			return;
		}

		boolean state = false;

		while (nextChar()) {
			if (state && (ch == '\n')) {
				return;
			}
			state = (ch == '*');
		}
		errors++;
		System.out.println("Unterminated Comment");

	}

	private void skipQuote(char quoteType) {

		while (nextChar()) {
			if (ch == quoteType) {
				return;
			}

			if (ch == '\n') {
				errors++;
				System.out.println(String.format("Missing closed quote at line: %d", currentline));
				return;
			} else if (ch == '\\') {
				nextChar();
			}

		}

	}

	private void processSlash() {
		if(nextChar()) { 
			if(ch == '*') { 
				
				if(nextChar() && ch != '*') { 
					putBackChar();
				}
				skipComment(SLASH_STAR);
				
			} else if (ch == '/') { 
				skipComment(SLASH_SLASH);
			} else if(ch != '\n') { 
				putBackChar();
			}
		}
	}

	private static final boolean isIdChar(char ch) {
		return false;
	}

	private String getRemainingString() {
		return null;
	}

}
