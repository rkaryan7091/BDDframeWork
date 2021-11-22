package com.mindtree.stepDefinitions;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.mindtree.pageobjects.AllProductTabLC;
import com.mindtree.reusablecomponent.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AllofItstepDefinition extends Base{
	
	public static Logger log= LogManager.getLogger(AllofItstepDefinition.class.getName());
	
	AllProductTabLC ap=new AllProductTabLC(driver);
	
	@Given("User lands on Home Page")
	public void user_lands_on_home_page() throws Exception {
		log.info("Browser Opened");
		driver.get(property.getUrl());
		test.info("Navigate to Url : " + driver.getCurrentUrl());
		log.info("Navigate to Url : " + driver.getCurrentUrl());
		
	}
	@Given("Clicks on AllOfIt Section from Navigation Bar")
	public void clicks_on_all_of_it_section_from_navigation_bar() {
		test.info("Clicking on ALL OF IT in nav Bar");
		log.info("Clicking on ALL OF IT in nav Bar");
		ap.getAllOfIt().click();
	
	}

	@When("Product Page should Displayed Click on second page")
	public void product_page_should_displayed_click_on_second_page() {
		test.info("Clicking on 2nd Page");
		log.info("Clicking on 2nd Page");
		ap.getPageSelect().click();
	}

	@Then("The user should be taken to second page of product")
	public void the_user_should_be_taken_to_second_page_of_product() {
		test.info("Validating Current Page");
		log.info("Validating Current Page");
	}

	@Then("validate Current Page")
	public void validate_current_page() {
		Assert.assertEquals("2",ap.getGetCurrntPage().getText());
		test.pass("Successfully Navigated to 2nd Page");
		log.info("Successfully Navigated to 2nd Page");
		
	}
}
