package com.test;

import java.util.Scanner;

public class MyFirstJava {
	
	public static void main(String[] args) {
//		System.out.println("Hello Automation Folks!");
		
		// Verify whether the person is allowed to vote > 18yrs
		// 14  55 47 65 33 36
		
		
		// personAge is a Integer variable in Java
		// int is integer datatype where you cans store integer values
		// ctrl + s
		
		for (int i = 1; i <= 100; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter the age of Person"+i);
			int personAge = scan.nextInt();
			if (personAge >= 18) { // 17 > 18 --> False
				System.out.println("Person is allowed to vote");
			} else {
				System.out.println("Person is not allowed to vote");
			} 
		}
	}

}
