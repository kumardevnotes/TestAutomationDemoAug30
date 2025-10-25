package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDemo {

	public static void main(String[] args) throws Exception {
		/*
		 * Using Selenium
		 * 1. Setup Driver file
		 * 2. Launch browser
		 * 3. Maximize the browser
		 * 4. Launch application
		 * 5. Wait for 2 seconds
		 * 6. Click on Login link
		 * 7. Wait for 3 seconds
		 * 8. Close the browser
		 * */
		
		// To download Driver file and to setup its path to launch actual chrome browser
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		WebDriver driver = new ChromeDriver(); // ChromeDriver implements WebDriver in the background
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Launch the application
		driver.get("https://www.speaklanguages.com/");
		
		//Wait for 2 seconds
		Thread.sleep(2000); // 2000ms == 2seonds
		
		//Click on Login link using linkText locator
		//driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.partialLinkText("Sign")).click();
		
		//Enter first Name value using id locator
		driver.findElement(By.id("first_name")).sendKeys("John");
		
		/*WebElement element = driver.findElement(By.id("first_name"));
		element.sendKeys("John");*/
		
		//Enter last Name value using name locator
		driver.findElement(By.name("last_name")).sendKeys("Legend");
		
		//Enter email value using name locator
		driver.findElement(By.name("email")).sendKeys("johnLegend@gmail.com");
		
		//Enter email value using name locator
	    driver.findElement(By.name("password")).sendKeys("Pwd#1122");
				
		//Click Sign up button using xpath locator
	    driver.findElement(By.xpath("//input[@value='Sign up']")).click();
	    
		//Again wait for 8seconds
		Thread.sleep(8000);
		
		//Close the bowser
		driver.quit();

	}

}
