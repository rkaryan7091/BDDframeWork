package com.mindtree.stepDefinitions;

import org.testng.Assert;

import com.mindtree.pageobjects.HomePageLC;
import com.mindtree.reusablecomponent.Base;

import io.cucumber.java.en.Then;

public class HomePagestepDefinition extends Base {
	
	HomePageLC hp=new HomePageLC(driver);
	
	@Then("BigSmall Website logo should be displayed")
	public void big_small_website_logo_should_be_displayed() {
		Assert.assertTrue(hp.getTitleImg().isDisplayed());
	}

	@Then("the Navigation Bar should be Displayed")
	public void the_navigation_bar_should_be_displayed() {
		Assert.assertTrue(hp.getNavigationBar().isDisplayed());
	}



}
