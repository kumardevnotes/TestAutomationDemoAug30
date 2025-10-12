package com.java.inheritance;

public class MethodOverLoadingDemo {

	public static void main(String[] args) {
		MethodOverLoadingDemo obj = new MethodOverLoadingDemo();
		
		obj.displayEmpName();
		obj.displayEmpName();
		
		obj.displayEmpName("Tom Cruise");
		obj.displayEmpName("Kumar Th");
		
		obj.displayEmpName("Mike", "Tyson");
		obj.displayEmpName("Ramesh", "Json");
	}

	//Method overloading means same method with different param list
	//In Method overloading the logic will also change
	public void displayEmpName() {
		System.out.println("John Legend");
	}

	public void displayEmpName(String empName) {
		System.out.println("Given employee name is " + empName);
	}

	public void displayEmpName(String firstName, String lastName) {
		System.out.println("Given employee full name is " + firstName + lastName);
	}

}
