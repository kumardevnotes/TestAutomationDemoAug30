package com.java.inheritance;

//Inheritance in Java
public class ChildClass extends ParentClass{

	// this and super
	
	public static void main(String[] args) {
		//Create a child class object to access both child class and parent class methods
		ChildClass obj = new ChildClass();
		 obj.displayEmpID();
		 obj.displayEmpName();
		 
		 System.out.println();
		 
		 int updatedSalary  = obj.getUpdatedSalary(200);
		 System.out.println(updatedSalary);
		 
		 final int empId = 100;
		 System.out.println("empId is --> "+ empId);
	}

	//non-static java method below
	public void displayEmpID() {
		System.out.println(112233);
	}
	
	public void displayEmpName() {
		System.out.println("Tom Cruise from  Child class");
	}
	
	//Method overriding.. you are overriding the original method which is given by the parent
	public int getUpdatedSalary(int incentive) {
		int salary = 1000;
		return salary + 2 * incentive;
	}
}
