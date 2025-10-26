package com.selenium.demo;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDemo8 {

	public static void main(String[] args) throws Exception {
	
		WebDriverManager.chromedriver().setup();
	
		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys("KumarTester@gmail.com");
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.name("proceed")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText()); // Prints the text which is shown on the Alert
		alert.accept(); //  clicks on OK button on the Alert
		//alert.dismiss(); // clicks on Cancel button on the Alert
		
		Thread.sleep(3000); 
	
		
		//closes all the opened windows
		driver.quit();

	}

}
