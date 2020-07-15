package com.bala.designpatterns.decorator.component;

public class StarBuckCoffeeMochaAddOns extends CoffeeAddOns {

	CoffeeComponent starCoffeeComponent;

	public StarBuckCoffeeMochaAddOns(CoffeeComponent coffeeComponent) {
		this.starCoffeeComponent = coffeeComponent;
	}

	@Override
	public String getDescription() {
		return this.starCoffeeComponent.getDescription() + ", Mocha";
	}
	
	public double cost() {
		return starCoffeeComponent.cost() + 0.10;
	}

}
