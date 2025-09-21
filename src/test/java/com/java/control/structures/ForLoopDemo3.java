package com.java.control.structures;

public class ForLoopDemo3 {

	public static void main(String[] args) {

		int count = 0;
		for (int i = 1001; i < 1011; i++) {
			count++; // 6
			if (count == 6) { // 6 == 6
				break;
			}
			System.out.println("Employeed ID: " + i); // 100
		}

		System.out.println("This is the statement printed immediatley after quitting the above for loop");

	}

}
