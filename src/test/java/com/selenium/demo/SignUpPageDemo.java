package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpPageDemo {

	public static void main(String[] args) throws Exception {

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
