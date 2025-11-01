package com.testng.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDemo {
	@Test
	public void loginPageDemo() throws Exception {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.speaklanguages.com/");

		Thread.sleep(2000);

		driver.findElement(By.partialLinkText("Log in")).click();

		Thread.sleep(3000);

		// Close the bowser
		driver.quit();
		
		Assert.fail("Failing testcase for granted");
	}

	@Test
	public void signUpPageDemo() throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.speaklanguages.com/");

		Thread.sleep(2000); // 2000ms == 2seconds

		driver.findElement(By.linkText("Sign up")).click();

		Thread.sleep(3000);

		// Close the bowser
		driver.quit();
	}
}
