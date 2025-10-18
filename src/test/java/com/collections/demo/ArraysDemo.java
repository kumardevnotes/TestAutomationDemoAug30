package com.collections.demo;

public class ArraysDemo {

	public static void main(String[] args) {
		
		int myNumber = 40; // Only one value can be stored into an Integer Variable
		// More than one value can be stored into Array Variable
		//Deleting or adding new values from array is not allowed
		int[] myNumbers = {10, 12, 34, 55}; 
		
		int[] myEmployeeIds = new int[5];
		
		myEmployeeIds[0] = 100;
		myEmployeeIds[1] = 200;
		myEmployeeIds[2] = 250;
		myEmployeeIds[3] = 300;
		myEmployeeIds[4] = 40;
		
		myEmployeeIds[5] = 600;
		
		//You can't store more than the Array's capcity. Below line gives java.lang.ArrayIndexOutOfBoundsException
		//This is another disadvantage with Arrays
		System.out.println(myEmployeeIds[5] );
		
       int[] myZipCodes = new int[1000]; // This can store upto 1000zipCodes
		
       myZipCodes[0] = 500090;
       //Now the Capacity is wastaed here as it still can store 999 zipCodes. This another disadvantage with Arrays

       String[] myCityNames = {"NewJersy", "NewYork"};// In Arrays we can store same dataType values only
       
	}

}
