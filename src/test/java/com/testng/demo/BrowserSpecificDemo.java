package com.testng.demo;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSpecificDemo {
	@Test
	public void launchAppInChrome() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com/");
		driver.quit();
		
	}

	@Test
	public void launchAppInEdge() throws Exception {
		String driverPath = System.getProperty("user.dir") 
                + "/src/test/resources/msedgedriver.exe";
		
		System.out.println("Driver path: " + driverPath);
		File file = new File(driverPath);
		System.out.println("File exists? " + file.exists());
		
		

        System.setProperty("webdriver.edge.driver", driverPath);
        
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com/");
		driver.quit();
	}
}
