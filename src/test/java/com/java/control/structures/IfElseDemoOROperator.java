package com.java.control.structures;

public class IfElseDemoOROperator {

	public static void main(String[] args) {
		// We are going to learn if..else control structure

		int empSal = 5100;
		int empAge = 45;

		if (empSal > 5000 || empAge < 50) { // 5100 > 5000 || 45 < 50 ---> true || true --> true
			System.out.println("Employee has to pay 20% of the tax");
		} else {
			System.out.println("Employee has to pay no tax");
		}
		
		/* OR operator
		 * true || true --> true
		 * true || false --> true
		 * false || true --> true
		 * false || false --> false
		 *
		 * */
	}

}
