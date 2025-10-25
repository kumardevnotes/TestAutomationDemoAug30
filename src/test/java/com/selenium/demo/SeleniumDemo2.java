package com.selenium.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDemo2 {

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

		WebElement singUpElement  = driver.findElement(By.linkText("Sign up"));
		singUpElement.click();
		
		Thread.sleep(2000);
		
		
		List<WebElement> inputElements = driver.findElements(By.tagName("input"));
		System.out.print("Number of anchor input inside signup page is: " + inputElements.size());
		
		
		Thread.sleep(4000);
		
		//Close the bowser
		driver.quit();

	}

}
