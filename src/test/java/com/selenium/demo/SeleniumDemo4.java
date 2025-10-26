package com.selenium.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDemo4 {

	public static void main(String[] args) throws Exception {
	
		WebDriverManager.chromedriver().setup();
	
		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://www.speaklanguages.com/");
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("email_input")).sendKeys("TestUser@yahoo.com");
		Thread.sleep(3000);
		driver.findElement(By.id("email_input")).clear();
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(5000);
		
		//to launch a new tab in already opened chrome browser
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);

		//to launch a new tab in already opened chrome browser
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://in.search.yahoo.com/");
		Thread.sleep(5000);
		
		//closes current opened window
		driver.close();
		Thread.sleep(4000);
		
		//closes all the opened windows
		driver.quit();

	}

}
