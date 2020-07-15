package com.bala.designpatterns.decorator.component;

public class StarBuckCoffeeSoyaAddOns extends CoffeeAddOns {
	CoffeeComponent starCoffeeComponent;

	public StarBuckCoffeeSoyaAddOns(CoffeeComponent coffeeComponent) {
		this.starCoffeeComponent = coffeeComponent;
	}

	@Override
	public String getDescription() {
		return this.starCoffeeComponent.getDescription() + ", Soya";
	}

	public double cost() {
		return starCoffeeComponent.cost() + 0.15;
	}
}
