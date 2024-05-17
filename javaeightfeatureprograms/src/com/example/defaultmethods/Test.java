package com.example.defaultmethods;

public interface Test {
	
	void display();  // by default this method is public abstract

	default void show() { // using default keyword we can define a method in interface, from java 1.8
		System.out.println("new feature in java 8....."); 
	}
	
	default void printMessage() { // using default keyword we can define a method in interface, from java 1.8
		System.out.println("testing new feature....");
	}
}
