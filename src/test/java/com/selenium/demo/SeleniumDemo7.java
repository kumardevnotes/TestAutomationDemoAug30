package com.selenium.demo;


import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDemo7 {

	public static void main(String[] args) throws Exception {
	
		WebDriverManager.chromedriver().setup();
	
		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://www.speaklanguages.com/");
		Thread.sleep(2000); 
		String tab1ID = driver.getWindowHandle();
		System.out.println(tab1ID);
		
		
		//to launch a new tab in already opened chrome browser
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		String tab2ID = driver.getWindowHandle();
		System.out.println(tab2ID);

		//to launch a new tab in already opened chrome browser
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://in.search.yahoo.com/");
		Thread.sleep(2000);
		String tab3ID = driver.getWindowHandle();
		System.out.println(tab3ID);
		
		driver.switchTo().window(tab1ID);
		Thread.sleep(2000);
		
		// Capture all window IDs at once and try to switch to each window one by one
		
		System.out.println("Now switching among all 3 tabs/windows one by one");
		Thread.sleep(2000);
		Set<String> allWindowIds  = driver.getWindowHandles();
		for(String window : allWindowIds) {
			driver.switchTo().window(window);
			Thread.sleep(2000);
		}
		
		//closes all the opened windows
		driver.quit();

	}

}
