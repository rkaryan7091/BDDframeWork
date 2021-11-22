package com.mindtree.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GiftCardLC {

	public WebDriver driver;

	public GiftCardLC(WebDriver driver) {
		this.driver = driver;
	}

	By giftCardButton = By.xpath("//div[@class='site-nav__icons']/a[3]");
	By giftCardTitle = By.xpath("//div[@class='product-single__meta']//h1");

	public WebElement getGiftCardButton() {
		return driver.findElement(giftCardButton);
	}

	public WebElement getGiftCardTitle() {
		return driver.findElement(giftCardTitle);
	}

}
