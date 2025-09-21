package com.java.control.structures;

public class ForLoopDemo2 {

	public static void main(String[] args) {
		// Print employee Ids of 10 employees
		// if you find an employee with Id 1004, then don't print..

//		for (int i = 1001; i < 1011; i++) { // 1005 < 1011 --> true
//			if (i == 1004) { // 1004 == 1004
//               //prints nothing
//			} else {
//				System.out.println("Employeed ID: " + i);
//			}
//		}

		//if you find an employee Id with 1005, then quit the forloop forever
		for (int i = 1001; i < 1011; i++) { // 1005 < 1011
			if (i == 1005) {  // 1005 == 1005 --> true
				break;
			}
			System.out.println("Employeed ID: " + i); // 100
		}
		
		System.out.println("This is the statement printed immediatley after quitting the above for loop");
		
	}

}
