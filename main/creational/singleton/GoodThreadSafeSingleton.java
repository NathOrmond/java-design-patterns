package creational.singleton;

public class GoodThreadSafeSingleton {
	
	private static volatile GoodThreadSafeSingleton INSTANCE = null;
	
	private GoodThreadSafeSingleton() {
		System.out.println("constructor called ...");
	}
	
	public synchronized GoodThreadSafeSingleton getInstance() { 
		if(GoodThreadSafeSingleton.INSTANCE == null) { 
			synchronized(this) {
				if(GoodThreadSafeSingleton.INSTANCE == null) { 
					GoodThreadSafeSingleton.INSTANCE = new GoodThreadSafeSingleton();
				}
			}
		}
		return GoodThreadSafeSingleton.INSTANCE;
	}

}
