package com.testng.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDataProviderDemo {

	@Test (dataProvider = "userEmails")
  public void enterUserName(String userName, String userEmail) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("email_input")).sendKeys(userName);
		Thread.sleep(1000);
		driver.findElement(By.id("email_input")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("email_input")).sendKeys(userEmail);
		Thread.sleep(2000);
		driver.quit();
  }
	
	@DataProvider(name = "userEmails")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "john", "johnLegend1122@gmail.com" },
	   { "kumar", "kumartrainier@gmail.com"},
	   { "Rams", "RamsTester3344@gmail.com" },
	   { "James", "James657575@gmail.com"},
	 };
	}
}
