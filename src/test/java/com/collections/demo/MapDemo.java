package com.collections.demo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		//Map is used to store data in the form of Key and Value pair
		//If you try to get value for the key which is not there in map, It returns null
		Map<String, String> myEmployeeData = new HashMap(); // HashMap implements Map
		
		//Below is used to store key value pair data using put()
		myEmployeeData.put("EmployeeName", "John Legend");
		myEmployeeData.put("EmployeeId", "1122");
		myEmployeeData.put("EmployeeGender", "Male");
		myEmployeeData.put("Employee Marital Status", "Married");
		
		System.out.println(myEmployeeData);
		
		// use get(key) method to get the value of given key
		
		System.out.println(myEmployeeData.get("EmployeeName"));
		System.out.println(myEmployeeData.get("EmployeeGender"));
		System.out.println(myEmployeeData.get("EmployeeId"));
		System.out.println(myEmployeeData.get("EmployeeCity"));
		
		//clear() to remove all key & value pair sets from Map
		//myEmployeeData.clear();
		System.out.println(myEmployeeData);
		
		for(Map.Entry<String, String> entry : myEmployeeData.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		//Bellow overrides the values as the keys are already existed
		myEmployeeData.put("EmployeeId", "5564");
		myEmployeeData.put("EmployeeGender", "Female");
		
		System.out.println(myEmployeeData);

	}

}
