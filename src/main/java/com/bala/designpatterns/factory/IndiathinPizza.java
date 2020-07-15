package com.bala.designpatterns.factory;

public class IndiathinPizza extends PizzaImpl {

	@Override
	public void prepare() {
		System.out.println("IndiathinPizza Preparing");

	}

	@Override
	public void bake() {
		System.out.println("IndiathinPizza baking");

	}

	@Override
	public void cut() {
		System.out.println("IndiathinPizza cutting");

	}

	@Override
	public void box() {
		System.out.println("IndiathinPizza boxing");

	}

}
