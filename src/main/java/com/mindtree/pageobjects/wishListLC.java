package com.mindtree.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class wishListLC {

	public WebDriver driver;

	public wishListLC(WebDriver driver) {
		this.driver = driver;
	}

	By searchButton = By.xpath("//form[@class='search-bar'] //input[@name='q']");
	By selectProduct = By.xpath("//div[@id='snize-search-results-grid-mode']/ul//li[1]//a");
	By addingToWishList = By.xpath("//div[@class='product-single__meta']/div/div/div");
	By wishListButton = By.xpath("//div[@class='site-nav__icons']/a[2]");
	By wishListProductName = By.xpath("//ul[@id='swym-item-grid']/li/div/div/div/div//a");
	By productName = By.xpath("//div[@class='product-single__meta']//h1");
	By welcomeButton=By.xpath("//div[@class='swym-welcome-container']//button");

	public WebElement getWelcomeButton() {
		return driver.findElement(welcomeButton);
	}

	public void setWelcomeButton(By welcomeButton) {
		this.welcomeButton = welcomeButton;
	}

	public WebElement getSearchBox() {
		return driver.findElement(searchButton);
	}

	public WebElement getSelectProduct() {
		return driver.findElement(selectProduct);
	}

	public WebElement getAddingToWishList() {
		return driver.findElement(addingToWishList);
	}

	public WebElement getWishListButton() {
		return driver.findElement(wishListButton);
	}

	public WebElement getWishListProductName() {
		return driver.findElement(wishListProductName);
	}

	public WebElement getProductName() {
		return driver.findElement(productName);
	}

}
