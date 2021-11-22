package com.mindtree.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartLC {

	public WebDriver driver;

	public CartLC(WebDriver driver) {
		this.driver = driver;
	}

	By searchButton = By.xpath("//form[@class='search-bar'] //input[@name='q']");
	By selectProduct = By.xpath("//div[@id='snize-search-results-grid-mode']/ul//li[2]//a");
	By addToCartButton = By.xpath("//form[@method='post'] //button[@name='add']");
	By productName = By.xpath("//div[@class='product-single__meta']//h1");
	By cartButton = By.xpath("//div[@class='site-nav__icons']/a[4]");
	By productCartName = By.xpath("//div[@class='cart__items']/div/div/div[2]/div/div/a");
	By checkoutButton=By.xpath("//button[@name='checkout']/span");

	public WebElement getSearchButton() {
		return driver.findElement(searchButton);
	}

	public WebElement getSelectProduct() {
		return driver.findElement(selectProduct);
	}

	public WebElement getAddToCartButton() {
		return driver.findElement(addToCartButton);
	}

	public WebElement getProductName() {
		return driver.findElement(productName);
	}

	public WebElement getCartButton() {
		return driver.findElement(cartButton);
	}

	public WebElement getCheckoutButton() {
		return driver.findElement(checkoutButton);
	}

	public WebElement getProductCartName() {
		return driver.findElement(productCartName);
	}



}
