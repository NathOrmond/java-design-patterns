package structural.adaptor;

public class Adapter implements ITarget {
	
	private Adaptee wrapped_instance;
	
	public Adapter(Adaptee wrapped_instance) {
		this.wrapped_instance = wrapped_instance;
	}

	public void request() {
		this.wrapped_instance.specificRequest();
	}

}
