package com.class_object.demo;

public class JavaStaticMethodsDemo {

	public static void main(String[] args) {
//static methods can be called inside main() without creating class objects
		displayEmpName();
		displayEmpName("Mike Tyson");
		System.out.println(getEmpSalary());
	}

	// Declare a method with void return type and no Params
	public static void displayEmpName() {
		System.out.println("John Legend");
	}

	// Declare a method with void return type and with one Param
	public static void displayEmpName(String empName) {
		System.out.println(empName);
	}

	// Declare a method with int return type and with no params
	public static int getEmpSalary() {
		return 4000;
	}

	// Declare a method with void return type and with one param
	public static void isEmpMarried(boolean marStatus) { // true
		if (marStatus)
			System.out.println("Married");
		else
			System.out.println("UnMarried");
	}

	// Declare a method with String return type and with two params
	public static String getEmpFullName(String firstName, String lastName) { // Tom Cruise
		String fullName = firstName + "-" + lastName;
		return fullName;
	}
}
