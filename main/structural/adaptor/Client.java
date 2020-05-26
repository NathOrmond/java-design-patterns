package structural.adaptor;

public class Client {
	
	ITarget target;
	
	public Client() {
		target = new Adapter(new Adaptee());
	}

	
	public void invokeTarget() { 
		target.request();
	}
}
