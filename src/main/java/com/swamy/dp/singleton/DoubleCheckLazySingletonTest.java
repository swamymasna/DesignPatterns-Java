package com.swamy.dp.singleton;

public class DoubleCheckLazySingletonTest {

	public static void main(String[] args) {
		DoubleCheckLazySingleton instance1 = DoubleCheckLazySingleton.getInstance();
		instance1.displayMsg();

		DoubleCheckLazySingleton instance2 = DoubleCheckLazySingleton.getInstance();
		instance2.displayMsg();
		
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}
}
