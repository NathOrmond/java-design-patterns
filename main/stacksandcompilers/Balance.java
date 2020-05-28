package stacksandcompilers;

import java.io.Reader;
import java.util.Stack;

public class Balance {

	private int errors;
	private Tokenizer tok;

	public Balance(Reader inStream) {
		errors = 0;
		tok = new Tokenizer(inStream);
	}

	private int checkBalance() {
		char ch;
		Symbol match = null;
		Stack pendingTokens = new Stack();
		while ((ch = tok.getNextOpenClose()) != '\0') {
			Symbol lastSymbol = new Symbol(ch, tok.getLineNumber());
			switch (ch) {
			case '(':
			case '[':
			case '{':
				pendingTokens.push(lastSymbol);
				break;
			case ')':
			case ']':
			case '}':
				if (pendingTokens.isEmpty()) {
					errors++;
				} else {
					match = (Symbol) pendingTokens.pop();
					checkMatch(match, lastSymbol);
				}
				break;
			default:
				break;
			}
		}
		while (!pendingTokens.isEmpty()) {
			match = (Symbol) pendingTokens.pop();
			System.out.println(String.format("Unmatched %c at line %d", match.token, match.theLine));
			errors++;
		}
		return errors + tok.getErrorCount();
	}

	private static class Symbol {
		public char token;
		public int theLine;

		public Symbol(char token, int line) {
			this.token = token;
			this.theLine = line;
		}
	}

	private void checkMatch(Symbol opSym, Symbol clSym) {
		if(opSym.token == '(' && clSym.token != ')' ||
		   opSym.token == '[' && clSym.token != ']' ||
		   opSym.token == '{' && clSym.token != '}' ) { 
			errors++;
		}
	}

}
