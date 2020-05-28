package datastructs;

public interface PriorityQueue {

	Position insert(Comparable x);
	Comparable findMin();
	Comparable deleteMin();
	boolean isEmpty();
	void makeEmpty();
	int size();
	void decreaseKey(Position p, Comparable newVal);
	
	
	public interface Position{ 
		Comparable getValue();
	}
	
}
