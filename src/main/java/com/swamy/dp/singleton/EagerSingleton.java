package com.swamy.dp.singleton;

public class EagerSingleton {

	private static EagerSingleton instance = new EagerSingleton();
	
	private EagerSingleton() {
	}
	
	public static EagerSingleton getInstance() {
		return instance;
	}
	
	public void displayMsg() {
		System.out.println("Eager Singleton Design Pattern..!");
	}
}
