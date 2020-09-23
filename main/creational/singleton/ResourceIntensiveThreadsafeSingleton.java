package creational.singleton;

public class ResourceIntensiveThreadsafeSingleton {
	
	private static ResourceIntensiveThreadsafeSingleton INSTANCE = null;
	
	private ResourceIntensiveThreadsafeSingleton() {
		System.out.println("constructor called ...");
	}
	
	public synchronized ResourceIntensiveThreadsafeSingleton getInstance() { 
		if(ResourceIntensiveThreadsafeSingleton.INSTANCE == null) { 
			ResourceIntensiveThreadsafeSingleton.INSTANCE = new ResourceIntensiveThreadsafeSingleton();
		}
		return ResourceIntensiveThreadsafeSingleton.INSTANCE;
	}

}
