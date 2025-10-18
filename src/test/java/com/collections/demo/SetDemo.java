package com.collections.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		/*
		 * Write a java set collection to store employee data such as 
		 * EmpName, EmpId, EmpSal, EmpGender, EmpMarStatus and display it on the console
		 * 
		 * EmpName ---> String
		 * EmpId --> Integer
		 * EmpSal --> Floating .. 2000.50$
		 * EmpGender - F/M Char
		 * EmpMarStatus -  true/false - boolean
		 * 
		 * Set Can't store duplicate values
		 * Set doesn't follow order or indexing
		 * */
		
		Set employeeData = new HashSet(); //HashSet implements Set

		employeeData.add("John Legend");
		employeeData.add(1122); // 1
		employeeData.add(2000.50f);
		employeeData.add('M');
		employeeData.add(true);
		employeeData.add("John Legend");
		
		System.out.println(employeeData);
		
		// there is no get(index) method in Set
		//employeeData.get(2);
		
		Set employeeAdditonaldata = new HashSet();
		employeeAdditonaldata.add("Delhi");
		employeeAdditonaldata.add("5");
		
		employeeData.addAll(employeeAdditonaldata);
		System.out.println(employeeData);
		
		System.out.println(employeeData.size());
		
		System.out.println(employeeData.isEmpty());
		
		for(Object object : employeeData) {
			System.out.print(object+" ");
		}
		
		employeeData.clear();
		System.out.println(employeeData);
		System.out.println(employeeData.isEmpty());
		
		
		
	}

}
