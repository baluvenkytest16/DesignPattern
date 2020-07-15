package com.bala.designpatterns.factory;

public class IndiaThickPizza extends PizzaImpl {

	@Override
	public void prepare() {
		System.out.println("IndiaThickPizza Preparing");

	}

	@Override
	public void bake() {
		System.out.println("IndiaThickPizza baking");

	}

	@Override
	public void cut() {
		System.out.println("IndiaThickPizza cutting");

	}

	@Override
	public void box() {
		System.out.println("IndiaThickPizza boxing");

	}

}
