package com.java.control.structures;

public class IfElseDemoAndOperator {

	public static void main(String[] args) {
		// We are going to learn if..else control structure

		int empSal = 6000; // if empSal > 5000 --> 20% of the tax
		int empAge = 60;
		
		if ( empAge < 50) { // 60 < 50 --> false
			System.out.println("Employee is not a senior resource");
		} else {
			System.out.println("Employee is a senior resource");
		}

		if (empSal > 5000 && empAge < 50) { // 6000 > 5000 && 35 < 50 ---> true && true --> true
			System.out.println("Employee has to pay 20% of the tax");
		} else {
			System.out.println("Employee has to pay no tax");
		}
		
		/* AND operator
		 * true && true --> true
		 * true && false --> false
		 * false && true --> false
		 * false && false --> false
		 *
		 * */
	}

}
