package structural.adaptor.duckturkey;

public class DuckTurkeyAdapter implements IDuck {
	
	private ITurkey wrappedInstance;
	
	public DuckTurkeyAdapter(ITurkey wrappedInstance) {
		this.wrappedInstance = wrappedInstance;
	}

	public void fly() {
		wrappedInstance.run();
	}

	public void quack() {
		wrappedInstance.gobble();
	}
	
	

}
