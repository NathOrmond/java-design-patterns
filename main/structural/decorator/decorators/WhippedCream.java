package structural.decorator.decorators;

import structural.decorator.IBeverage;

public class WhippedCream extends AbstractDecorator {

	private int price = 2;
	
	public WhippedCream(IBeverage wrappedInstance) {
		super(wrappedInstance);
	}

	public int cost() {
		return getWrappedInstance().cost() + this.price;
	}

}
