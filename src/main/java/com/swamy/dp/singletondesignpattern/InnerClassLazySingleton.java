package com.swamy.dp.singletondesignpattern;

public class InnerClassLazySingleton {

	private InnerClassLazySingleton() {
	}
	
	private static class SingletonHelper{
		private static InnerClassLazySingleton instance = new InnerClassLazySingleton();
	}

	public static InnerClassLazySingleton getInstance() {
		return SingletonHelper.instance;
	}
	
	public void showMessage() {
		System.out.println("Lazy Inner Class Singleton Design Pattern..!");
	}
}

