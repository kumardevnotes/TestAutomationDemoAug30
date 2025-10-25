package com.selenium.demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDemo5 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		 driver.manage().window().maximize();

		driver.get("https://www.speaklanguages.com/");
		Thread.sleep(2000);

		System.out.println(driver.getCurrentUrl());
		System.out.println("**************************");

		System.out.println(driver.getTitle());
		System.out.println("**************************");

		System.out.println(driver.getPageSource());
		System.out.println("**************************");

		WebElement loginElement = driver.findElement(By.linkText("Log in"));
		System.out.println(loginElement.getAttribute("href"));
		System.out.println("**************************");

		System.out.println(loginElement.getText());

		// closes all the opened windows
		driver.quit();

	}

}
