package com.app.tests;

import org.testng.annotations.Test;

import com.app.pages.HomePage;
import com.app.pages.LoginPage;
import com.app.pages.SignupPage;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AppTests {
	WebDriver driver = null;
	HomePage homePage = null;
	LoginPage loginPage = null;
	SignupPage signupPage = null;

	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com/");

		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		signupPage = new SignupPage(driver);
	}

	@Test(priority = 1)
	public void verifySuccessfulLogin() throws Exception {
		homePage.launchLoginPage();
		loginPage.appLogin("johnnitesh2@gmail.com", "Testing@123");
		loginPage.verifyLoginSuccess();
	}

	@Test(priority = 2)
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
