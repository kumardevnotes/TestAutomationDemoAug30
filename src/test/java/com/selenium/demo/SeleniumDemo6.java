package com.selenium.demo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDemo6 {

	public static void main(String[] args) throws Exception {

		// ctrl + shift + f --> to format the code in eclipse IDE --> Integrated
		// Development Environment
		// Other IDes Intellij, VSCode, Visual Express edition,

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		File file = new File("src/test/java/com/selenium/demo/HTMLButtons.html");
		String filePath = "file:///" + file.getAbsolutePath();

		driver.get(filePath);
		
		WebElement headerText = driver.findElement(By.xpath("//h1"));
		System.out.println("headerText displayed or not? " + headerText.isDisplayed());
		
		System.out.println("headerText? " + headerText.getText());
		
		
		
		WebElement maleRadioButton = driver.findElement(By.xpath("//label//input[@value='male']"));
		System.out.println("maleRadioButton selected or not? " + maleRadioButton.isSelected());
		
		WebElement femaleRadioButton = driver.findElement(By.xpath("//label//input[@value='female']"));
		System.out.println("femaleRadioButton selected or not? " + femaleRadioButton.isSelected());
		
		WebElement sportsCheckbox = driver.findElement(By.xpath("//label//input[@value='sports']"));
		System.out.println("sportsCheckbox selected or not? " + sportsCheckbox.isSelected());
		
		WebElement musicCheckbox = driver.findElement(By.xpath("//label//input[@value='music']"));
		System.out.println("musicCheckbox selected or not? " + musicCheckbox.isSelected());
		
		
		WebElement primaryButton = driver.findElement(By.xpath("//div//button[.='Primary']"));
		System.out.println("primaryButton enabled or not? " + primaryButton.isEnabled());
		
		WebElement secondaryButton = driver.findElement(By.xpath("//div//button[.='Secondary']"));
		System.out.println("secondaryButton enabled or not? " + secondaryButton.isEnabled());

		Thread.sleep(3000); // 3000 ms == 3seconds

		// closes all the opened windows
		driver.quit();

	}

}
