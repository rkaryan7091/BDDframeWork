package com.mindtree.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavBarValidationLC {
	
	public WebDriver driver;

	public NavBarValidationLC(WebDriver driver) {
		this.driver = driver;
	}
	
	By navBardropDown=By.xpath("//a[@data-dropdown-rel='shop-by-category']");
	By navShopByCategory=By.xpath("//div[@id=\"myheader\"]/div[1]/div/div/ul/li[9]");
	By navProductSelect=By.xpath("//div[@id=\"myheader\"]/div[1]/div/div/ul/li[9]/ul/li[6]");

	public WebElement getNavBardropDown() {
		return driver.findElement(navBardropDown);
	}
	public WebElement getNavShopByCategory() {
		return driver.findElement(navShopByCategory);
	}
	public WebElement getNavProductSelect() {
		return driver.findElement(navProductSelect);
	}
	

}
