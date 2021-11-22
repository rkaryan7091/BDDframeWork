package com.mindtree.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class priceComparisonLC {
       
	
	public  WebDriver driver;
	public priceComparisonLC(WebDriver driver)
	{
		this.driver=driver;
	}

	By searchButton=By.xpath("//form[@class='search-bar'] //input[@name='q']");
	By selectProduct=By.xpath("//div[@id='snize-search-results-grid-mode']/ul//li[1]//a");
	By productPrice=By.xpath("(//div[@class='snize-price-list'])[1]//span");
	By productPrice2=By.xpath("//div[@class='price-field']//span");
	
	public WebElement getSearchButton() {
		return driver.findElement(searchButton);
	}
	public WebElement getSelectProduct() {
		return driver.findElement(selectProduct);
	}
	public WebElement getProductPrice() {
		return driver.findElement(productPrice);
	}
	public WebElement getProductPrice2() {
		return driver.findElement(productPrice2);
	}
}
