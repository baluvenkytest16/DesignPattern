package com.bala.designpatterns.application;

import com.bala.designpatterns.decorator.component.CoffeeComponent;
import com.bala.designpatterns.decorator.component.StarBuckCoffeeMochaAddOns;
import com.bala.designpatterns.decorator.component.StarBuckCoffeeSoyaAddOns;
import com.bala.designpatterns.decorator.component.StarBuckCoffeeWhipAddOns;
import com.bala.designpatterns.decorator.component.StarBucksCoffeeComponent;

public class DecoratorTestApplication {
	
	public static void main(String[] args) {
		
		CoffeeComponent startBucks = new StarBucksCoffeeComponent(); // 10/-
		
		startBucks = new StarBuckCoffeeMochaAddOns(startBucks); // 0.10/-

		startBucks = new StarBuckCoffeeSoyaAddOns(startBucks); //0.15

		startBucks = new StarBuckCoffeeWhipAddOns(startBucks); // 0.20
		
		startBucks = new StarBuckCoffeeSoyaAddOns(startBucks); //0.15
		
		startBucks = new StarBuckCoffeeWhipAddOns(startBucks); // 0.20
		
		startBucks = new StarBuckCoffeeWhipAddOns(startBucks); // 0.20
		startBucks = new StarBuckCoffeeWhipAddOns(startBucks); // 0.20
		
		
		System.out.println("Cofee Ordered:: "+ startBucks.getDescription());
		System.out.println("cost:: " + startBucks.cost());
		
	}

}
