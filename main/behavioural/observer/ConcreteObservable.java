package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteObservable implements IObservable{

	private List<IObserver> observers;
	private String state;
	
	public ConcreteObservable() {
		observers = new ArrayList<IObserver>();
	}
	
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
	
	@SuppressWarnings("unchecked")
	public String getState() { 
		return state;
	}
	
	public void setState(String newState) { 
		this.state = newState;
		notifyObserservers();
	}

	public <String> void setState(String newState) {
		this.state = (java.lang.String) newState;
		notifyObserservers();
	}

}
