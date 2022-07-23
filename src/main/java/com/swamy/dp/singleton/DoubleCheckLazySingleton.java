package com.swamy.dp.singleton;

public class DoubleCheckLazySingleton {

	private static DoubleCheckLazySingleton instance;
	
	private DoubleCheckLazySingleton() {
	}

	public static DoubleCheckLazySingleton getInstance() {
		
		if(instance == null) {
			synchronized (DoubleCheckLazySingleton.class) {
				if(instance == null) {
					instance = new DoubleCheckLazySingleton();
				}
			}
		}
		return instance;
	}
	
	public void displayMsg() {
		System.out.println("Double Check Singleton DesginPattern....!");
	}
}
