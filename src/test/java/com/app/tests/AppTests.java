package com.app.tests;

import org.testng.annotations.Test;

import com.app.pages.HomePage;
import com.app.pages.LoginPage;
import com.app.pages.SignupPage;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AppTests {
	WebDriver driver = null;
	HomePage homePage = null;
	LoginPage loginPage = null;
	SignupPage signupPage = null;
	
	String appUrl  = "";
	String appUserEmail = "";
	String appPwd = "";

	@BeforeMethod
	public void beforeMethod() throws Exception {
		
		FileReader file = new FileReader("./src//test//resources//AppData.properties");
		Properties props =  new Properties();
		props.load(file);
		appUrl = props.get("AppURL").toString();
		System.out.println(":: " + appUrl);
		appUserEmail = props.get("AppUserEmail").toString();
		appPwd = props.get("AppPassword").toString();
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(appUrl);

		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		signupPage = new SignupPage(driver);
	}

	@Test(priority = 1)
	public void verifySuccessfulLogin() throws Exception {
		homePage.launchLoginPage();
		loginPage.appLogin(appUserEmail, appPwd);
		loginPage.verifyLoginSuccess();
	}

	@Test(priority = 2, invocationCount = 3)
	public void verifySignup() throws Exception {
		homePage.launchSignUpPage();
		signupPage.appSignup();
		signupPage.verifyThankYouMessage();
	}

	@Test(priority = 3)
	public void verifyInvalidLogin() throws Throwable {
		homePage.launchLoginPage();
		loginPage.appLogin("johntester@gmail.com", "PWD34@123");
		loginPage.verifyLoginError();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
