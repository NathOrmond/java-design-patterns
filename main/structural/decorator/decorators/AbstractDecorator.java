package structural.decorator.decorators;

import structural.decorator.IBeverage;

public abstract class AbstractDecorator implements IBeverage {
	
	private IBeverage wrappedInstance;
	
	public AbstractDecorator(IBeverage wrappedInstance) { 
		this.wrappedInstance = wrappedInstance;
	}
	
	public IBeverage getWrappedInstance() {
		return wrappedInstance;
	}

}
