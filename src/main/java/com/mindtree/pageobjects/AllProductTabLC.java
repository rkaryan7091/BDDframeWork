package com.mindtree.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.mindtree.reusablecomponent.Base;

public class AllProductTabLC extends Base {
	
	public WebDriver driver;

	public AllProductTabLC(WebDriver driver) {
		this.driver = driver;
	}
	


	By allOfIt = By.xpath("//div[@id=\"myheader\"]/div[1]/div/div/ul/li[12]");
	By pageSelect=By.xpath("//div[@class='pagination']//span[2]");
	By getCurrntPage=By.xpath("//div[@class='pagination']//span[@class='page current']");

	
	public WebElement getAllOfIt() {
		return driver.findElement(allOfIt);
	}
	public WebElement getPageSelect() {
		return driver.findElement(pageSelect);
	}
	public WebElement getGetCurrntPage() {
		return driver.findElement(getCurrntPage);
	}
}
