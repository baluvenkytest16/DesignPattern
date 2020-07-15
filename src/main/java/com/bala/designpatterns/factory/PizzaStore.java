package com.bala.designpatterns.factory;

public abstract class PizzaStore {

	public abstract Pizza createPizzaStore(String store);

	public Pizza orderPizza(String pizzaType) {
		Pizza pizza = createPizzaStore(pizzaType);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
