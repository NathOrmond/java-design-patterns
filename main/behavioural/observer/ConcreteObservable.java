package behavioural.observer;

import java.util.List;

public class ConcreteObservable implements IObservable{

	private List<IObserver> observers;
	private String state;
	
	public void registerObserver(IObserver observer) {
		observers.add(observer);
	}

	public void removeObserver(IObserver observer) {
		observers.remove(observer);
	}

	public void notifyObserservers() {
		for(IObserver observer : observers) { 
			observer.update();
		}
	}
	
	public void getState() { 
		System.out.println(state);
	}

}
