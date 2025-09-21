package com.class_object.demo;

import java.sql.Driver;

public class JavaMethodsDemo1 {

	public static void main(String[] args) {
		JavaMethodsDemo1 obj = new JavaMethodsDemo1(); // created an object

		obj.displayEmpName();

		obj.displayEmpName("Mike Tyson");

		int empsal = obj.getEmpSalary();
		System.out.println(empsal);

		obj.isEmpMarried(true);
		obj.isEmpMarried(false);
		obj.isEmpMarried(true);
		
		String empFulLName  = obj.getEmpFullName("Tom", "Cruise");
		System.out.println(empFulLName);
		
		
	}

	// Declare a method with void return type and no Params
	public void displayEmpName() {
		System.out.println("John Legend");
	}

	// Declare a method with void return type and with one Param
	public void displayEmpName(String empName) {
		System.out.println(empName);
	}

	// Declare a method with int return type and with no params
	public int getEmpSalary() {
		return 4000;
	}

	// Declare a method with void return type and with one param
	public void isEmpMarried(boolean marStatus) { //true
		if (marStatus)
			System.out.println("Married");
		else
			System.out.println("UnMarried");
	}

	// Declare a method with String return type and with two params
	public String getEmpFullName(String firstName, String lastName) { // Tom Cruise
		String fullName = firstName + "-" + lastName;
		return fullName;
	}
}
