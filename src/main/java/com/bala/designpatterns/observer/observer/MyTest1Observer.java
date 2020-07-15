package com.bala.designpatterns.observer.observer;

import com.bala.designpatterns.observer.subject.Subject;

public class MyTest1Observer implements TestObserver {
	private String testValue;
	private Subject subject;

	public MyTest1Observer(Subject subject) {
		this.subject = subject;
		this.subject.registerTestObserver(this);
	}

	@Override
	public void update(String testValue) {
		this.setTestValue(testValue);
	}

	@Override
	public String getCurrentValue() {
		return this.getTestValue();
	}

	public String getTestValue() {
		return testValue;
	}

	public void setTestValue(String testValue) {
		this.testValue = testValue;
	}

}
