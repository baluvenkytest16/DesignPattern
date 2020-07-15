package com.bala.designpatterns.observer.subject;

import java.util.ArrayList;
import java.util.List;

import com.bala.designpatterns.observer.observer.TestObserver;


public class SimpleSubject implements Subject {

	List<TestObserver> testObserverList;

	private String testValue = "Bala";

	public SimpleSubject() {
		testObserverList = new ArrayList<TestObserver>();
	}

	@Override
	public void registerTestObserver(TestObserver observer) {
		testObserverList.add(observer);
	}

	@Override
	public void removeTestObserver(TestObserver observer) {
		testObserverList.remove(observer);

	}

	@Override
	public void notifyTestObserver() {
		testObserverList.forEach(observer -> {
			observer.update(this.testValue);
		});

	}

	public void setTestValue(String testValue) {
		this.testValue = testValue;
		this.notifyTestObserver();
	}

	public String getTestValue() {
		return testValue;
	}

}
