package com.java.control.structures;

public class ForLoopDemo4 {

	public static void main(String[] args) {


		//if you find an employee Id with 1005, then skip that and print the rest
		for (int i = 1001; i < 1011; i++) { 
			if (i == 1005) {  
				continue;
			}
			System.out.println("Employeed ID: " + i); 
		}
		
		System.out.println("This is the statement printed immediatley after quitting the above for loop");
		
	}

}
