package com.bala.designpatterns.factory;

public class USCheesePizza extends PizzaImpl {

	
	@Override
	public void prepare() {
		System.out.println("USCheesePizza Preparing");

	}

	@Override
	public void bake() {
		System.out.println("USCheesePizza baking");

	}

	@Override
	public void cut() {
		System.out.println("USCheesePizza cutting");

	}

	@Override
	public void box() {
		System.out.println("USCheesePizza boxing");

	}

}
