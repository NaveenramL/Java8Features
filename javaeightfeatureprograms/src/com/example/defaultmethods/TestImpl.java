package com.example.defaultmethods;

public class TestImpl implements Test {

	//	public void show() { // if we want we can override the default methods here
	//	System.out.println("overriding the message in interface Test ....");
	//}

	@Override
	public void display() {
		System.out.println("in display method ....");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestImpl obj = new TestImpl();
		obj.show();
		obj.display();
	}

}
