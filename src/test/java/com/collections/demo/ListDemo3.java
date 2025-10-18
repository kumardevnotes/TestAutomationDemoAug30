package com.collections.demo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo3 {

	public static void main(String[] args) {
		
		//List follows order
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
		
		
		employeeData.addAll(additionalEmployeeData);
		System.out.println(employeeData);
		
	}

}
