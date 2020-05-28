package datastructs;

public interface Stack {

	void push (Object x);
	void pop();
	Object peep();
	Object peepAndPop();
	
	boolean isEmpty();
	void makeEmpty();
	
}
