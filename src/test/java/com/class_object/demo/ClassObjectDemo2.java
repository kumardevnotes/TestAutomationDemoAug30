package com.class_object.demo;

public class ClassObjectDemo2 {

	// A method in java will have the method body Or business logic

	public static void main(String[] args) {
		ClassObjectDemo2 obj = new ClassObjectDemo2(); // Creating a class object
		
		int empSalary = obj.getSalary(40);
		System.out.println(empSalary);// calling a method using the object obj created above
		
		empSalary = obj.getSalary(25);
		System.out.println(empSalary);
		
		empSalary = obj.getSalary(55);
		System.out.println(empSalary);
	}

	// Declare a method with int Parameter which returns an Integer number - Custom method
	public int getSalary(int empAge) { 
		if (empAge > 30) { // 55 > 30
			return 4000;
		} else {
			return 3000;
		}
	}

}
