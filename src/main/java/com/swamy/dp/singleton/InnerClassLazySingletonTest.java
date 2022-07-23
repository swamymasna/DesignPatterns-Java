package com.swamy.dp.singleton;

public class InnerClassLazySingletonTest {

	public static void main(String[] args) {
		
		InnerClassLazySingleton instance1 = InnerClassLazySingleton.getInstance();
		instance1.showMessage();

		InnerClassLazySingleton instance2 = InnerClassLazySingleton.getInstance();
		instance2.showMessage();
		
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}
}

