package com.selenium.demo;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDemo9 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.speaklanguages.com/");

		List<WebElement> allLangElements = driver.findElements(By.xpath("//p[@class='site_link']//a"));
		Actions actions = new Actions(driver);

		for (WebElement element : allLangElements) {
			System.out.println("inside for loop");
			actions.moveToElement(element).build().perform();
			Thread.sleep(1000);
		}

		// Take screenshot and store as a file format
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// Destination file path
		File destFilePNG = new File("./screenshots/speakLanguages.png");
		File destFileJPG = new File("./screenshots/speakLanguages.jpg");
		File destFileGIF = new File("./screenshots/speakLanguages.gif");
		File destFileBMP = new File("./screenshots/speakLanguages.bmp");

		// Copy file to destination
		FileHandler.copy(srcFile, destFilePNG);
		FileHandler.copy(srcFile, destFileJPG);
		FileHandler.copy(srcFile, destFileGIF);
		FileHandler.copy(srcFile, destFileBMP);

		Thread.sleep(3000);

		// closes all the opened windows
		driver.quit();

	}

}
