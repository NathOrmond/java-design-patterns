package datastructs;

public interface Queue {

	void enqueue(Object x);
	Object getFront();
	Object dequeue(Object x);
	
	boolean isEmpty();
	void makeEmpty();
	
}
