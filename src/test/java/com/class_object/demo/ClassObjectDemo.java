package com.class_object.demo;

public class ClassObjectDemo {

	// A method in java will have the method body Or business logic

	public static void main(String[] args) {
		ClassObjectDemo obj = new ClassObjectDemo(); // Creating a class object
		int empSalary = obj.getSalary(); //calling a method using the object obj created above
		System.out.println(empSalary);
	}
	
	//Declare a method which returns an Integer number - Custom method
	public int getSalary() {
		int empAge = 25;
		if(empAge > 30) { // 25 > 30
			return 4000;
		}
		else {
			return 3000;
		}
	}

}
