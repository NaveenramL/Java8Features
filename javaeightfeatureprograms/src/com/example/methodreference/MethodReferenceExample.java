package com.example.methodreference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {
	
	static void doubleValues(int i) { // this method is used to display input values multiplied by 2
		System.out.println("Printing the input values multiplied by 2 : "+i*2);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		list.forEach(System.out::println); // example for method reference where printing the values in the list
		
		list.forEach(i -> MethodReferenceExample.doubleValues(i)); // example for method reference with my custom method

	}

}
