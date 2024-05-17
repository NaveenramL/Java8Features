package com.feature.staticmethods;

public interface Test {
	
	static void success() { // from java 1.8 we can have static methods in interface
		System.out.println("Transaction success.....");
	}
}
