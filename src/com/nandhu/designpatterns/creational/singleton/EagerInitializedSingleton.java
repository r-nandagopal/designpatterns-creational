package com.nandhu.designpatterns.creational.singleton;

public class EagerInitializedSingleton {
	
	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
	
	//private constructor to avoid clients to create instance 
	private EagerInitializedSingleton() {
		
	}
	
	public static EagerInitializedSingleton getInstance() {
		return instance;
	}

}
