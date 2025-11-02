package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupPage {

	WebDriver driver = null;
	
	public SignupPage(WebDriver driver) {
		this.driver = driver;
	}

	public void appSignup() throws Exception {
		driver.findElement(By.id("first_name")).sendKeys("John");
		driver.findElement(By.name("last_name")).sendKeys("Legend");
		driver.findElement(By.name("email")).sendKeys("johnlegetestrt41434@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Test#223344");
		
		Select genderSelect = new Select(driver.findElement(By.name("sex")));
		genderSelect.selectByVisibleText(" Male ");
		
		Select daySelect = new Select(driver.findElement(By.name("dob_day")));
		daySelect.selectByVisibleText("10");
		
		Select monthSelect = new Select(driver.findElement(By.name("dob_month")));
		monthSelect.selectByVisibleText("June");
		
		Select yearSelect = new Select(driver.findElement(By.name("dob_year")));
		yearSelect.selectByVisibleText("1999");
		
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
		Thread.sleep(8000);
	}

	public void verifyThankYouMessage() {
		if (driver.findElement(By.xpath("//h1")).isDisplayed())
			System.out.println("Signup is successful");
		else
			System.out.println("Something went wrong. Signup is not successful");
	}

}
