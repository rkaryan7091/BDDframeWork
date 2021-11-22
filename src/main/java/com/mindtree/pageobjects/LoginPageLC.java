package com.mindtree.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageLC {
	
	public  WebDriver driver;
	public LoginPageLC(WebDriver driver)
	{
		this.driver=driver;
	}

	By homeSignInButton=By.xpath("//div[@class='site-nav__icons']//a[1]");
	By emailBox=By.cssSelector("input[id='CustomerEmail']");
	By passwordBox=By.cssSelector("input[id='CustomerPassword']");
	By loginSignButton=By.xpath("(//input[@type='submit'])[1]");
	By accountDetail=By.xpath("//div[@class='grid']//h3");
	
	public WebElement getAccountDetail() {
		return driver.findElement(accountDetail);
	}

	public WebElement getHomeSignInButtond() {
		return driver.findElement(homeSignInButton);
	}
	
	public WebElement getemailBox() {
		return driver.findElement(emailBox);
	}
	
	public WebElement getpasswordBox() {
		return driver.findElement(passwordBox);
	}
	
	public WebElement getLoginSignButton()
	{
		return driver.findElement(loginSignButton);
	}

}
