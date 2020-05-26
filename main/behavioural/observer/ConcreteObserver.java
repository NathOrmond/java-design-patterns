package behavioural.observer;

public class ConcreteObserver implements IObserver{
	
	private ConcreteObservable observable;
	
	public ConcreteObserver(ConcreteObservable observable) {
		this.observable = observable;
	}

	public void update() {
		this.observable.getState();
	}

}
