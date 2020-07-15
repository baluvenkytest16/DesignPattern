package com.bala.designpatterns.decorator.component;

public abstract class CoffeeComponent {
	
	private String description = "Unknow coffee";

	public abstract double cost();

	public String getDescription() {
		
		return this.description;
	}

}
