package com.selenium.demo;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDemo11 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		//ImplicitWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		//Page wait
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		
		driver.get("https://www.speaklanguages.com/");
		
		WebElement loginElement  = driver.findElement(By.linkText("Log in"));
		
		//Explicit Wait
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		ExpectedConditions.elementToBeClickable(loginElement);
		loginElement.click();
		
		//ExpectedConditions.visibilityOfElementLocated(By.linkText("Log in"));
		
		//ExpectedConditions.alertIsPresent();
		
		Thread.sleep(2000);

		// closes all the opened windows
		driver.quit();

	}

}
