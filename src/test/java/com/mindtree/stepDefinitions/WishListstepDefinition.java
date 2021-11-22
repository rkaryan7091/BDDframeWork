package com.mindtree.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;


import com.mindtree.pageobjects.wishListLC;
import com.mindtree.reusablecomponent.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WishListstepDefinition extends Base {
	
	public static Logger log = LogManager.getLogger(WishListstepDefinition.class.getName());
	
	wishListLC wl = new wishListLC(driver);
	String productName;
	@Given("User search for gifts in search box")
	public void user_search_for_gifts_in_search_box() {
		test.info("sending keys to search Box");
		log.info("sending keys to search Box");
		wl.getSearchBox().sendKeys("ironman", Keys.ENTER);
	    
	}

	@When("The Page is displayed user clicks on first product")
	public void the_page_is_displayed_user_clicks_on_first_product() {
		test.info("selecting first product from searchList");
		log.info("Selecting first product from  searchList");
		wl.getSelectProduct().click(); 
	    
	}

	@Then("The Page with product details open user get product name")
	public void the_page_with_product_details_open_user_get_product_name() {
		test.info("getting Product Name");
		productName = wl.getProductName().getText();
	    
	}

	@Then("User clicks on add to Wishlist Option")
	public void user_clicks_on_add_to_wishlist_option() {
		test.info("adding on WishList");
		log.info("adding on WishList");
		wl.getAddingToWishList().click();
	    
	}

	@When("user click on wishlist button")
	public void user_click_on_wishlist_button() {
		test.info("Opening Wishlist Section");
		log.info("Opening WishList Section");
		wl.getWishListButton().click();
	    
	}

	@Then("The wishlist Page is displayed with a welcome message")
	public void the_wishlist_page_is_displayed_with_a_welcome_message() {
		log.info("Accepting welcome Message");
		wl.getWelcomeButton().click();
		test.info("Clicking on Welcome Button");
	    
	}

	@Then("user accept the welcome message")
	public void user_accept_the_welcome_message() {
		test.info("Checking product is added to wishlist or not");
		log.info("Checking product is added to wishlist or not");
	    
	}

	@Then("The product added should be displayed correctly")
	public void the_product_added_should_be_displayed_correctly() {
		Assert.assertEquals(wl.getWishListProductName().getText(),productName);
		test.info("Item successfully added to wishList");
		log.info("Item successfully addtd to wishList");
	}


}
