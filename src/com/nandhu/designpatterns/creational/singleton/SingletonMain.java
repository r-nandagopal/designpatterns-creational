package com.nandhu.designpatterns.creational.singleton;



public class SingletonMain {

	public static void main(String[] args) {
		
		// We can create a instance using new keyword for singleton class. because we mad the default constructor to private
		//EagerInitializedSingleton instance = new EarlyReadEliminationPhase();

		//We haveto use getInstance method to get the singleton class.
		
		EagerInitializedSingleton instance=EagerInitializedSingleton.getInstance();
		System.out.println(instance);
		
		EagerInitializedSingleton instance2= EagerInitializedSingleton.getInstance();
		System.out.println(instance2);
		
		if (instance.equals(instance2)) {
			System.out.println("Both are same");
		}else {
			System.out.println("Both are different");
		}
		
		//Static Example
		StaticBlockSingleton staticInstance=StaticBlockSingleton.getInstance();
		System.out.println(staticInstance);
		
		StaticBlockSingleton staticInstance2= StaticBlockSingleton.getInstance();
		System.out.println(staticInstance2);
		
		if (staticInstance.equals(staticInstance2)) {
			System.out.println("Both are same");
		}else {
			System.out.println("Both are different");
		}
	}

}
