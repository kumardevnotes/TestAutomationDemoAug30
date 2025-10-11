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
			int num2 = 10;
			System.out.println(num1 / num2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Division operation is complete");
	}

}
