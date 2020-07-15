package com.bala.designpatterns.observer.subject;

import com.bala.designpatterns.observer.observer.TestObserver;

public interface Subject {
	
	public void registerTestObserver(TestObserver observer);

	public void removeTestObserver(TestObserver observer);

	public void notifyTestObserver();

}
