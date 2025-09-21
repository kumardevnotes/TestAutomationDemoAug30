package com.java.control.structures;

public class WhileAndDoWhileDemo {

	public static void main(String[] args) {
		
		int number1  =0;
		// based on condition, repeat some job as long as that condition is true
		// first check the condition and then run the login inside while block
		
		while (number1 < 4) { // 0 < 4
			number1++;
			System.out.println("number: " + number1);
		}
		
		System.out.println("********************");
		
		int number2 = 0;
		// first run the job inside do..while then check for the condition
		do {
			number2++;
			System.out.println("number2: " + number2);
		} while (number2 < 4);

	}

}
