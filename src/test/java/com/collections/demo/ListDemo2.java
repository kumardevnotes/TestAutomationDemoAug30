package com.collections.demo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
		
		List employeeData = new ArrayList(); 
		
		employeeData.add("John Legend"); 
		employeeData.add(1122); // 1
		employeeData.add(2000.50f);
		employeeData.add('M');
		employeeData.add(true);
		employeeData.add("John Legend");
	
		
		System.out.println("check size below");
		System.out.println(employeeData.size());
		
		System.out.println("check whether your list obj is empty");
		System.out.println(employeeData.isEmpty());
		
		System.out.println("trying to clear list object");
		employeeData.clear();
		System.out.println(employeeData);
		
		System.out.println("check whether your list obj is empty");
		System.out.println(employeeData.isEmpty());
	
	}

}
