package com.java.file.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import java.io.File;

public class ReadWriteExcelDemo {

	public static void main(String[] args) {
		
		/*
		 * Step1: Read Excel file by using its Path
		 * Step2: Get the excel workbook out of the above file
		 * Step3: Get your excel worksheet
		 * Step4: Get your cell data and print it on the console
		 * */
		
		try {
			
			//Reading data from Excel
			FileInputStream fis = new FileInputStream(new File("./src/test/resources/TestData.xlsx"));
			
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			
			XSSFSheet sheet = workbook.getSheet("AppDetails");
			
			System.out.println("Before updating-->getRow(1).getCell(0) "+ sheet.getRow(1).getCell(0));
			System.out.println(sheet.getRow(1).getCell(1));
			System.out.println(sheet.getRow(1).getCell(2));
			System.out.println(sheet.getRow(1).getCell(3));
			
			//Writing into Excel
			FileOutputStream fos = new FileOutputStream(new File("./src/test/resources/TestData.xlsx"));
			sheet.getRow(1).getCell(0).setCellValue("Facebook");
			workbook.write(fos);
			
			System.out.println("After updating-->getRow(1).getCell(0) "+ sheet.getRow(1).getCell(0));
			
			fis.close();
			
		} catch (Exception e) {
			
		}

	}

}
