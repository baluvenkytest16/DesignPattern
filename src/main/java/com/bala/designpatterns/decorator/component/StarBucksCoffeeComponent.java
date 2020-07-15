package com.bala.designpatterns.decorator.component;

public class StarBucksCoffeeComponent extends CoffeeComponent {
	
	public StarBucksCoffeeComponent() {
		System.out.println("StarBuck Coffee creating....");
	}
	@Override
	public double cost() {
		return 10;
	}
	@Override
	public String getDescription() {
		return "StarBuck Coffee";
	}
}
