package com.bala.designpatterns.factory;

public interface Pizza {

	void prepare();

	void bake();

	void cut();

	void box();

	boolean isPizzaDone();
}
