package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
		
		//Click on Login link
		driver.findElement(By.linkText("Log in")).click();
		
		//Again wait for 3seconds
		Thread.sleep(3000);
		
		//Close the bowser
		driver.quit();

	}

}
