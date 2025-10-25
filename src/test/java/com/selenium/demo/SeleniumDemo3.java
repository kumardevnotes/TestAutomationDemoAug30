package com.selenium.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDemo3 {

	public static void main(String[] args) throws Exception {
		
		
		// To download Driver file and to setup its path to launch actual chrome browser
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		WebDriver driver = new ChromeDriver(); // ChromeDriver implements WebDriver in the background
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Launch the application
		driver.get("https://www.speaklanguages.com/");
		
		//Wait for 2 seconds
		Thread.sleep(2000);

//		WebElement singUpElement  = driver.findElement(By.linkText("Sign up"));
//		singUpElement.click();
		
		//Write selenium script to use XPath locator
		WebElement headerElement  = driver.findElement(By.xpath("//h1[.='Sign up to Speak Languages']"));
		System.out.println("Header displayed or not ? " + headerElement.isDisplayed());
		
		Thread.sleep(4000);
		
		//Close the bowser
		driver.quit();

	}

}
