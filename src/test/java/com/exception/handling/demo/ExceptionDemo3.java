package com.exception.handling.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		
		try {
			File file = new File("./src//test//resources//Assignments_1.txt");
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			while(bufferedReader.readLine()!=null) {
				System.out.println(bufferedReader.readLine());
			}
		} catch (Exception e) {
			System.out.println("Caught an exception-->"+e);
		}
		
	}
}
