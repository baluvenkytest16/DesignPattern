package com.bala.designpatterns.factory;

public abstract class PizzaImpl implements Pizza {

	public boolean isPizzaDone() {
		System.out.println("Pizza is done....");
		return true;
	}

}
