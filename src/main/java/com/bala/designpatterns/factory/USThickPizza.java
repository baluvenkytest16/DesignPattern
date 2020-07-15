package com.bala.designpatterns.factory;

public class USThickPizza extends PizzaImpl {

	@Override
	public void prepare() {
		System.out.println("USThickPizza Preparing");

	}

	@Override
	public void bake() {
		System.out.println("USThickPizza baking");

	}

	@Override
	public void cut() {
		System.out.println("USThickPizza cutting");

	}

	@Override
	public void box() {
		System.out.println("USThickPizza boxing");

	}

}
