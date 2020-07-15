package com.bala.designpatterns.factory;

public class IndiaPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizzaStore(String pizzaType) {
		switch (pizzaType) {
		case "cheese":
			return new IndiaCheesePizza();
			
		case "thick":
			return new IndiaThickPizza();
		case "thin":
			return new IndiathinPizza();
		}
		return null;
	}

}
