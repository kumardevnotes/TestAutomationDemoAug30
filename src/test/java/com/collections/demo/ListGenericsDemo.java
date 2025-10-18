package com.collections.demo;

import java.util.ArrayList;
import java.util.List;

public class ListGenericsDemo {

	public static void main(String[] args) {
		
		// 	List employeeData = new ArrayList();
		List<String> employeeNames = new ArrayList(); 
		
		employeeNames.add("Kumar Th");
		employeeNames.add("Yar");
		employeeNames.add("Hewad");
		
		System.out.println(employeeNames);
		
	}

}
