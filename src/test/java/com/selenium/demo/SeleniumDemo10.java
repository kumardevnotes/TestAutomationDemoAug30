package com.selenium.demo;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDemo10 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.speaklanguages.com/");
		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		
		File beforeScrollSrcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File beforeScrollDown = new File("./screenshots/beforeScrollDown.png");
		FileHandler.copy(beforeScrollSrcFile, beforeScrollDown);
		
		jse.executeScript("window.scrollBy(0, 800);");
		Thread.sleep(3000);

		File afterScrollSrcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File afterScrollDown = new File("./screenshots/afterScrollFile.png");
		FileHandler.copy(afterScrollSrcFile, afterScrollDown);
		
		jse.executeScript("window.scrollBy(0, 0);");
		
		Thread.sleep(3000);

		// closes all the opened windows
		driver.quit();

	}

}
