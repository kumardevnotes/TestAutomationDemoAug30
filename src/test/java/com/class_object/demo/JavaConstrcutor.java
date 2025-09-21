package com.class_object.demo;

public class JavaConstrcutor {

	public static void main(String[] args) {
		//As soon as you create an object of a class, its constructor is called automatically
		JavaConstrcutor obj = new JavaConstrcutor();
		obj.displayEmpName();
		
		JavaConstrcutor obj2 = new JavaConstrcutor("Hello All");
		obj2.displayEmpName();
	}
	
	//Constructor has same name as Class name and is called once you create an object of the class
	//Default constructor
	JavaConstrcutor(){
		System.out.println("I am a default constructor");
	}
	
	//Parameterized constructor
	JavaConstrcutor(String message){
		System.out.println("I am a parameterized constructor and have some message-->"+ message);
	}

	public void displayEmpName() {
		System.out.println("Mike Tyson");
	}
}
