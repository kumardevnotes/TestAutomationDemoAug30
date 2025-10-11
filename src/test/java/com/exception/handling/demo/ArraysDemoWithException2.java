package com.exception.handling.demo;

public class ArraysDemoWithException2 {

	public static void main(String[] args) {
		
		//Declaring int array with size of 100. That means I can store 100 int values inside the below Array
		int myNumbers[] = new int[5]; //Capacity or Size or Length if the Array
		
		for(int index =0; index < myNumbers.length; index++) { // 5 < 5
			myNumbers[index] = index; // myNumbers[4] = 4; 
		}
		
		//myNumbers {0,1,2,3,4}
		for(int index =0; index < myNumbers.length; index++) {
			System.out.println(myNumbers[index]); //myNumbers[1]
		}
	
	}

}
