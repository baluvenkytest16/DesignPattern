package com.bala.designpatterns.factory;

public class USPizzaStore extends PizzaStore {

	Pizza pizza;
	@Override
	public Pizza createPizzaStore(String pizzaType) {
		switch (pizzaType) {
		case "cheese":
			pizza = new USCheesePizza();
			break;
		case "thick":
			pizza = new USThickPizza();
			break;
		case "thin":
			pizza = new USThinPizza();
			break;
		}
		return null;
	}

}
