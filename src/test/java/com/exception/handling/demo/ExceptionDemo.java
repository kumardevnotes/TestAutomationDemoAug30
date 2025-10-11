package com.exception.handling.demo;

public class ExceptionDemo {

	public static void main(String[] args) {
		/*
		 * Exception handling will catch program level exceptions and will resume the
		 * program with the following lines of code catch will run only when you get
		 * exception inside try block.. of you don't get exception.. then catch block is
		 * ignored by Java
		 */
		try {
			int num1 = 100;
			int num2 = 0;
			System.out.println(num1 / num2);
		} catch (Exception e) {
			System.out.println("Caught an exception-->"+e);
		}
		System.out.println("Division operation is complete");
		
		System.out.println("******************");
		
		try {
			String empName = "John"; // J-0 o-1 h-2 n-3
			System.out.println(empName.toUpperCase()); 
			System.out.println(empName.charAt(4)); 
		} catch (Exception e) {
			System.out.println("Caught an exception-->"+e);
		}
		System.out.println("String operation is complete");
	}
}
