package com.testng.demo;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class TestNGAnnotationsDemo {
	WebDriver driver = null;

	@BeforeTest
	public void beforeTest() {
		System.out.println("I will run only once before the first test runs in this class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com/");
	}

	@Test
	public void launchLoginPage() {
		driver.findElement(By.partialLinkText("Log in")).click();
	}

	@Test
	public void launchSignupPage() {
		driver.findElement(By.linkText("Sign up")).click();
	}

	@AfterMethod
	public void afterMethod() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("I will run only once after the completion of last test in this class");
	}

}
