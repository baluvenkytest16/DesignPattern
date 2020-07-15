package com.bala.designpatterns.application;

import com.bala.designpatterns.factory.FactoryPizzaStore;
import com.bala.designpatterns.factory.Pizza;
import com.bala.designpatterns.factory.PizzaStore;

public class FactoryTestApplication {

	public static void main(String[] args) {
		
		PizzaStore pizzaStore = new FactoryPizzaStore().createPizzaStore("indian");
		
		Pizza pizza = pizzaStore.orderPizza("thick");
		
		System.out.println(pizza.isPizzaDone());
	}
}