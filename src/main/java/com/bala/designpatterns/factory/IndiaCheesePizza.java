package com.bala.designpatterns.factory;

public class IndiaCheesePizza extends PizzaImpl {

	@Override
	public void prepare() {
		System.out.println("IndiaCheesePizza Preparing");

	}

	@Override
	public void bake() {
		System.out.println("IndiaCheesePizza baking");

	}

	@Override
	public void cut() {
		System.out.println("IndiaCheesePizza cutting");

	}

	@Override
	public void box() {
		System.out.println("IndiaCheesePizza boxing");

	}

}
