package com.nandhu.designpatterns.creational.singleton;

public class StaticBlockSingleton {
	private static StaticBlockSingleton instance;
	
	private StaticBlockSingleton () {
		
	}
	
	static {
		try {
			instance= new StaticBlockSingleton ();
		}catch(Exception e) {
			throw new RuntimeException("Exception occur while creating singleton class");
		}
	}
	
	public static StaticBlockSingleton getInstance() {
		return instance;
	}
}
