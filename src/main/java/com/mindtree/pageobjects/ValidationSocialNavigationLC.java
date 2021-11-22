package com.mindtree.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ValidationSocialNavigationLC {

	public WebDriver driver;

	public ValidationSocialNavigationLC(WebDriver driver) {
		this.driver = driver;
	}

	
	By facebook = By.xpath("//div[@class='social']/ul/li[1]/a");
	By youtube = By.xpath("//div[@class='social']/ul/li[2]/a");
	By twitter = By.xpath("//div[@class='social']/ul/li[3]/a");
	

	
	public WebElement getFacebook() {
		return driver.findElement(facebook);
	}

	public WebElement getYoutube() {
		return driver.findElement(youtube);
	}

	public WebElement getTwitter() {
		return driver.findElement(twitter);
	}



}
