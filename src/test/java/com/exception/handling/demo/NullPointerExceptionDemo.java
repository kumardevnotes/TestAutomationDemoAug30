package com.exception.handling.demo;

public class NullPointerExceptionDemo {

	public static void main(String[] args) {
		//NullPointerExceptionDemo object = new NullPointerExceptionDemo();
		NullPointerExceptionDemo object = null;
		object.displayName(); //calling a method
	}
	
	//Declaring a method
	public void displayName() {
		System.out.println("John Legened");
	}

}
