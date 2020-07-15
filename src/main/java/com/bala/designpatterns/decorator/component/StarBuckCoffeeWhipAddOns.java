package com.bala.designpatterns.decorator.component;

public class StarBuckCoffeeWhipAddOns extends CoffeeAddOns {
	CoffeeComponent starCoffeeComponent;

	public StarBuckCoffeeWhipAddOns(CoffeeComponent coffeeComponent) {
		this.starCoffeeComponent = coffeeComponent;
	}

	@Override
	public String getDescription() {
		return this.starCoffeeComponent.getDescription() + ", Whip";
	}

	public double cost() {
		return starCoffeeComponent.cost() + 0.20;
	}
}
