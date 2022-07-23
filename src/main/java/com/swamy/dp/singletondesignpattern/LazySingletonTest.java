package com.swamy.dp.singletondesignpattern;

public class LazySingletonTest {

	public static void main(String[] args) {
		LazySingleton instance1 = LazySingleton.getInstance();
		instance1.showMessage();

		LazySingleton instance2 = LazySingleton.getInstance();
		instance2.showMessage();
		
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}
}

