package com.java.file.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadWriteTextDoc {

	public static void main(String[] args) {

		//To load the file into Java program
		File file = new File("./src//test//resources//Assignments.txt");

		try {
			//To read file data into BufferedReader object
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = "";
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			System.out.println("Caught an exception-->" + e);
		}
	}

}
