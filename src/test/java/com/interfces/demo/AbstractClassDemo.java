package com.interfces.demo;

public abstract class AbstractClassDemo {

	public static void main(String[] args) {
		

	}
	
	//Created abstract method below.. method with signature but withoutmethod body or logic
	public abstract void displayName();
	
	//Created non-abstract method.. emthod with both signature and method bidy
	public void displayCompanyName() {
		System.out.println("Google Corp");
	}

}
