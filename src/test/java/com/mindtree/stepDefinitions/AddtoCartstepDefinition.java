package com.mindtree.stepDefinitions;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import com.mindtree.pageobjects.CartLC;
import com.mindtree.reusablecomponent.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddtoCartstepDefinition extends Base {
	
	public static Logger log= LogManager.getLogger(AddtoCartstepDefinition.class.getName());
	
	String productName;
	
	CartLC ct = new CartLC(driver);
	@Given("Search for a product")
	public void search_for_a_product() {
		test.info("searching a Product");
		log.info("Searching a Product");
		ct.getSearchButton().sendKeys("captain America", Keys.ENTER);
	    
	}

	@Then("User selects second product and click on it")
	public void user_selects_second_product_and_click_on_it() {
		test.info("Selecting second Product from Product List");
		log.info("Selecting second Product from Product List");
		ct.getSelectProduct().click();
	    
	}

	@When("the Page loads the details of the product")
	public void the_page_loads_the_details_of_the_product() {
	    test.info(driver.getTitle());
	    log.info(driver.getTitle());
	    
	}

	@When("get the product name from product page")
	public void get_the_product_name_from_product_page() {
		productName = ct.getProductName().getText();
	    
	}

	@When("Clicks on Add to Cart button")
	public void clicks_on_add_to_cart_button() {
		test.info("Clicking on Add to Cart Button");
		log.info("Clicking on Add to Cart Button");
		ct.getAddToCartButton().click();
	    
	}

	@Then("cart will open with containing product")
	public void cart_will_open_with_containing_product() {
		test.info("Opening Cart");
		log.info("Opening Cart");
		ct.getCartButton().click();
	    
	}

	@Then("verify product name")
	public void verify_product_name() throws InterruptedException {
		test.info("Validating Product By Product Name");
		log.info("Validating Product By Product Name");
		Thread.sleep(3000);
		Assert.assertEquals(productName,ct.getProductCartName().getText());
		test.pass("Name Matched");
		log.info("Name Matched");
	    
	}

	@Then("checkout button will displayed")
	public void checkout_button_will_displayed() {
		test.info("Validating Checkout Button");
		log.info("Validating CheckOut Button");
		Assert.assertTrue(ct.getCheckoutButton().isDisplayed());
		test.pass(productName + " Item Succefully added To Cart");
		log.info(productName + " Item Succefully added To Cart");
	    
	    
	}

}
