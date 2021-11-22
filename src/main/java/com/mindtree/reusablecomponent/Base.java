package com.mindtree.reusablecomponent;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.aventstack.extentreports.ExtentTest;
import com.mindtree.utilities.GetProperty;


public class Base {

	public static GetProperty property = null;
	public static WebDriver driver = null;
	public static ExtentTest test;

	public static WebDriver initializeDriver() throws Exception {
		
		property = new GetProperty();
		if (property.getBrowser().equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", property.getBrowserPath());

			driver = new ChromeDriver();
		} else if (property.getBrowser().equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", property.getBrowserPath());

			driver = new InternetExplorerDriver();
		} else if (property.getBrowser().equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", property.getBrowserPath());

			driver = new FirefoxDriver();

		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		return driver;
	}

	 public static WebDriver getDriver()
	 {
		 return driver;
	 }
}