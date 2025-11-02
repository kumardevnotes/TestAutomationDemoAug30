package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver = null;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void launchLoginPage() {
		driver.findElement(By.linkText("Log in")).click();
	}

	public void launchSignUpPage() {
		driver.findElement(By.linkText("Sign up")).click();
	}

}
