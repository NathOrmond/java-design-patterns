package structural.decorator.beverages;

import structural.decorator.IBeverage;

public class DarkRoast implements IBeverage {
	
	private int cost = 5;

	public int cost() {
		return this.cost;
	}

}
