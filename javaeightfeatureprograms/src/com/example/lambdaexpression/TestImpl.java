package com.example.lambdaexpression;

public class TestImpl implements Test {
	
	public int add(int i, int j) {
		return i+j;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TestImpl testImpl = new TestImpl();
//		int output = testImpl.add(50, 50);
//		System.out.println("Printing the output : "+output);
		
		Test obj; // creating a reference for interface Test
		obj = (i,j)->  i+j; // example of lambda expression
		int result = obj.add(10, 20); // assigning the result of lambda expression to a variable
		System.out.println("Printing the result : "+result); // printing the output
	}

}
