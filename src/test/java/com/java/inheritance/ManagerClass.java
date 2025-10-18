package com.java.inheritance;

public class ManagerClass {

	// You can call provate methods ony within the class where it is declared. You can't access private methods outside of its Parent class
	public void showTasks() {
		System.out.println("Task1: Test Application Latest Version 4.0");
		System.out.println("Task2: Run Selenium Scripts on Latest Version 4.0");
	}
	
	private void submitRatings() {
		System.out.println("Kumar --> 3 out of 5");
		System.out.println("John --> 5 out of 5");
		System.out.println("Tom --> 4 out of 5");
	}
	
	public static void main(String args[]) {
		ManagerClass obj = new ManagerClass();
		obj.submitRatings();
	}
}
