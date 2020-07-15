package com.bala.designpatterns.application;

import com.bala.designpatterns.observer.observer.MyTest1Observer;
import com.bala.designpatterns.observer.observer.MyTest2Observer;
import com.bala.designpatterns.observer.observer.MyTest3Observer;
import com.bala.designpatterns.observer.observer.TestObserver;
import com.bala.designpatterns.observer.subject.SimpleSubject;


public class ObserverTestApplication {

	public static void main(String[] args) {
		
		SimpleSubject subject = new SimpleSubject();
		
		System.out.println(subject.getTestValue());
		
		TestObserver observer1 = new MyTest1Observer(subject);
		TestObserver observer2 = new MyTest2Observer(subject);
		TestObserver observer3 = new MyTest3Observer(subject);
		
		System.out.println("Before setting the value");
		
				
		System.out.println(observer1.getCurrentValue());
		System.out.println(observer2.getCurrentValue());
		System.out.println(observer3.getCurrentValue());

		subject.setTestValue("Venkat");
		System.out.println("after setting the value : " + subject.getTestValue());
				
		System.out.println(observer1.getCurrentValue());
		System.out.println(observer2.getCurrentValue());
		System.out.println(observer3.getCurrentValue());
		
		subject.setTestValue("Bala Venkat");
		System.out.println("after setting the value : " + subject.getTestValue());
				
		System.out.println(observer1.getCurrentValue());
		System.out.println(observer2.getCurrentValue());
		System.out.println(observer3.getCurrentValue());
		
		subject.removeTestObserver(observer3);

		subject.setTestValue("Balasasdasdfasd Venkat");
		System.out.println("after setting the value : " + subject.getTestValue());
				
		System.out.println(observer1.getCurrentValue());
		System.out.println(observer2.getCurrentValue());
		System.out.println(observer3.getCurrentValue());

		
	}

}
