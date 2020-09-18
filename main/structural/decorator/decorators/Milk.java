package structural.decorator.decorators;

import structural.decorator.IBeverage;

public class Milk extends AbstractDecorator {
	
	private int cost = 1;

	public Milk(IBeverage wrappedInstance) {
		super(wrappedInstance);
	}

	public int cost() {
		return getWrappedInstance().cost() + this.cost;
	}

}
