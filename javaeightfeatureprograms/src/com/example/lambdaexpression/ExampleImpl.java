package com.example.lambdaexpression;

public class ExampleImpl implements Example {
	
	public void show() {
		System.out.println("This is an example of Lambda Expression.........");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ExampleImpl obj = new ExampleImpl();
//		obj.show();
		
		Example iObj;
//		iObj= new Example() {
//
//			public void show() {
//				System.out.println("This is an example of lambda expression 2....");
//			}
//
//		};
//		
//		iObj.show();
		
		iObj = ()-> System.out.println("This is an example of lambda expression 3....");
		iObj.show();

	}

}
