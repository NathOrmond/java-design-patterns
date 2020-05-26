package creational.singleton;

public class Singleton {
	
	private static Singleton INSTANCE = null;
	
	private Singleton() {
		System.out.println("constructor called ...");
	}
	
	public Singleton getInstance() { 
		if(Singleton.INSTANCE == null) { 
			Singleton.INSTANCE = new Singleton();
		}
		return Singleton.INSTANCE;
	}

}
