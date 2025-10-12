package com.java.inheritance;

//Inheritance in Java
public class ChildClass2{

	public static void main(String[] args) {
		ChildClass2 obj = new ChildClass2();
		obj.displayEmpID();
		
		ParentClass parentObj = new ParentClass();
		parentObj.displayEmpName();
	}

	public void displayEmpID() {
		System.out.println(112233);
	}
}
