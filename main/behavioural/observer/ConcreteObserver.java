package behavioural.observer;

public class ConcreteObserver implements IObserver{
	
	private IObservable observable;
	
	public ConcreteObserver(IObservable observable) {
		this.observable = observable;
	}

	public void update() {
		System.out.print(String.format("Observer state changed to: %s", this.observable.getState()));
	}

}
