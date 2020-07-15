package com.bala.designpatterns.factory;

public class FactoryPizzaStore {

	public PizzaStore createPizzaStore(String storeType) {
		switch (storeType) {
		case "indian":
			return new IndiaPizzaStore();
		case "US":
			return new USPizzaStore();
		}

		return null;
	}

}
