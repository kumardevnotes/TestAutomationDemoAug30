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
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(); // ChromeDriver implements WebDriver in the background
		
		driver.manage().window().maximize();
		//driver.get("https://www.speaklanguages.com/");
		driver.get("https://www.speaklanguages.com/");
		Thread.sleep(2000); // 2000 ms == 2 seonds
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
