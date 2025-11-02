package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {

	WebDriver driver = null;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void appLogin(String userEmail, String password) throws Exception {
		driver.findElement(By.id("email_input")).sendKeys(userEmail);
		driver.findElement(By.id("password_input")).sendKeys(password);
		driver.findElement(By.id("login_button")).click();
		Thread.sleep(5000);
	}

	public void verifyLoginSuccess() {
		if (driver.findElement(By.id("nav_user")).isDisplayed())
			System.out.println("User login is successful");
		else {
			Assert.fail("Something went wrong. User login is not successful");
		}
	}

	public void verifyLoginError() {
		if (driver.findElement(By.xpath("//li[@class='error_message']")).isDisplayed())
			System.out.println("Invalid error is validated");
		else
			System.out.println("Something went wrong. Unable to validate invalid user logins");
	}
}
