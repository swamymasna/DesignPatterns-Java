package com.swamy.dp.singletondesignpattern;

public class EagerSingletonTest {

	public static void main(String[] args) {
		EagerSingleton instance1 = EagerSingleton.getInstance();
		instance1.displayMsg();

		EagerSingleton instance2 = EagerSingleton.getInstance();
		instance2.displayMsg();

		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		
	}
}


