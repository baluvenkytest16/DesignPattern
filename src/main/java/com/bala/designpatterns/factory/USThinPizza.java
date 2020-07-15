package com.bala.designpatterns.factory;

public class USThinPizza extends PizzaImpl {

	@Override
	public void prepare() {
		System.out.println("USThinPizza Preparing");

	}

	@Override
	public void bake() {
		System.out.println("USThinPizza baking");

	}

	@Override
	public void cut() {
		System.out.println("USThinPizza cutting");

	}

	@Override
	public void box() {
		System.out.println("USThinPizza boxing");

	}

}
