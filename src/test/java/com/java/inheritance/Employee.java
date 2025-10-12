package com.java.inheritance;

public class Employee extends Employer {

	String empName = "Tom";
	
	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.displayHolidaysCount();
	}
	
	//whenever you have same method names in both Parent and child..Use super keyword to cll parent class method
	public void displayHolidaysCount() {
		System.out.println(12);
		super.displayHolidaysCount();
		
		//this keyword always points to child or current class obj
		//super keyword always points to Parent class object
		System.out.println(this.empName);
		System.out.println(super.empName);
	}

}
