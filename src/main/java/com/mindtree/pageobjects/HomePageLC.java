package com.mindtree.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageLC {

	
	public WebDriver driver;

	public HomePageLC(WebDriver driver) {
		this.driver = driver;
	}
	
      By titleImg=By.xpath("//div[@itemtype='http://schema.org/Organization']/a/img[1]");
	
	  By navigationBar=By.xpath("//div[@id=\'myheader\']/div[1]/div/div/ul");

	public WebElement getTitleImg() {
		return driver.findElement(titleImg);
	}

	public WebElement getNavigationBar() {
		return driver.findElement(navigationBar);
	}
	  
	  
     

}
