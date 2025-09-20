package com.java.demo1;

public class JavaDataTypesDemo {

	public static void main(String[] args) {
		// Single line comment --> We are learning java data types

		/*
		 * Try to print employee details on the console.. Details such as empName,
		 * empID, empCity, empSal and empGender
		 */
		// the regular data types
		//ctrl + shift + f - toformat the code in eclipse
		// ctrl + / --> to comment the code

		// 6 different data types we have in java
		String empName = "John Legend";
		int empId = 1001;
		String empCity = "Newyork";
		double empSal = 2000.8989898;
		char empGender = 'M'; // 'F'
		float empIncentive  = 5888.76767676767667767676f;
		boolean isEmployeeMarried  = true; // if married true, if not married false
//
//		System.out.println(empName + empId + empCity + empSal + empGender);
//		System.out.println(empName + "\t" + empId + "\t" + empCity + "\t" + empSal + "\t" + empGender);
//		System.out.println(empName + "\n" + empId + "\n" + empCity + "\n" + empSal + "\n" + empGender);

		
		System.out.println(empName);
		System.out.println( empId );
		System.out.println( empCity );
		System.out.println(empSal );
		System.out.println(empGender);
		
		
		System.out.println("****************");
		
		System.out.print(empName);
		System.out.print( empId );
		System.out.print( empCity );
		System.out.print(empSal );
		System.out.print(empGender);

	}

}
