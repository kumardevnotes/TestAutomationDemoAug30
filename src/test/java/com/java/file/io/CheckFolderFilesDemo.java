package com.java.file.io;

import java.io.File;

public class CheckFolderFilesDemo {

	public static void main(String[] args) {

		/*
		 * Write a Java program to check whether your folder has files or not.. if you
		 * have files, print the filenames on the console ./src//test//resources//
		 */

		File folder = new File("./src//test//java//com//class_object//demo");
		if (folder.exists()) {
			File[] allFiles = folder.listFiles();
			for (File file : allFiles) {
				System.out.println(file.getName());
			}
		} else {
			System.out.println("Check the path given!");
		}

	}

}
