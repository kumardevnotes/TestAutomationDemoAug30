package com.collections.demo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		/*
		 * Write a java list collection to store employee data such as 
		 * EmpName, EmpId, EmpSal, EmpGender, EmpMarStatus and display it on the console
		 * 
		 * EmpName ---> String
		 * EmpId --> Integer
		 * EmpSal --> Floating .. 2000.50$
		 * EmpGender - F/M Char
		 * EmpMarStatus -  true/false - boolean
		 * 
		 * List stores any type data into Object. List is Dynamic
		 * List stores duplicate values
		 * We can add one list to another list using addAll()
		 * */
		
		List employeeData = new ArrayList(); //ArrayList implements List

		
		employeeData.add("John Legend"); //0
		employeeData.add(1122); // 1
		employeeData.add(2000.50f);
		employeeData.add('M');
		employeeData.add(true);
		employeeData.add("John Legend");
		System.out.println(employeeData);
		
		//Creating another list object
		List additionalEmployeeData = new ArrayList();
		additionalEmployeeData.add("NewJersy");
		additionalEmployeeData.add("Manager");
		
		System.out.println("Before Adding: "+ employeeData.containsAll(additionalEmployeeData));
		
		employeeData.addAll(additionalEmployeeData);
		System.out.println(employeeData);
		
		//get the object/value at given position
		System.out.println(employeeData.get(1));
		
		System.out.println("After Adding: " +employeeData.containsAll(additionalEmployeeData));
		
		//to remove value from list object
		System.out.println(employeeData.remove(0));
		System.out.println(employeeData);
		
		//you can new values on demand at given position as shown below in the List object
		employeeData.add(1, "Car");
		System.out.println(employeeData);
		
		for(Object object : employeeData) {
			System.out.print(object+" ");
		}
		
		System.out.println();
		
		System.out.println("check size below");
		
		System.out.println(employeeData.size());
		
		System.out.println("check whether your list obj is empty");
		System.out.println(employeeData.isEmpty());
		
		System.out.println("trying to clear list object");
		//clear() clears all the values and makes the list empty
		employeeData.clear();
		System.out.println(employeeData);
		System.out.println("---------");
	}

}
