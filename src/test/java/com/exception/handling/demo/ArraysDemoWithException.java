package com.exception.handling.demo;

public class ArraysDemoWithException {

	public static void main(String[] args) {
		
//		int num1 = 10;
//		int num2 = 20;
//		System.out.println(num1);
//		System.out.println(num2);
		
		//Declaring int Array and storing 2 integer values
		//An Array is a user defined variable where you can store defined number of values separated by comma
		// Arrays store same typoe of data
		int[] numbers = {10,20};
		System.out.println(numbers[0]); // 10
		System.out.println(numbers[1]); // 20
		
		//Declaring int array with size of 6.. that meanns in the below ARray you can store max 5 integer values/elements
		int myNumbers[] = new int[6];
		myNumbers[0] = 10;
		myNumbers[1] = 20;
		myNumbers[2] = 30;
		myNumbers[3] = 40;
		myNumbers[4] = 50;
		myNumbers[5] = 100;
		
		System.out.println(myNumbers[0]); // Index is 0 .. position 1
		System.out.println(myNumbers[1]);  //index 1.. position 2
		System.out.println(myNumbers[2]);
		System.out.println(myNumbers[3]);
		System.out.println(myNumbers[4]);
		System.out.println(myNumbers[5]);
		
		System.out.println(myNumbers[6]);
	}

}
