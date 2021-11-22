package com.mindtree.stepDefinitions;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.mindtree.pageobjects.GiftCardLC;
import com.mindtree.reusablecomponent.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class GiftCardstepDefinition extends Base {
	
	public static Logger log= LogManager.getLogger(GiftCardstepDefinition.class.getName());
	GiftCardLC gc = new GiftCardLC(driver);
	@Given("User clicks on Gift Card")
	public void user_clicks_on_gift_card() {
		test.info("clicking on GiftCard");
		log.info("clicking on GiftCard");
		gc.getGiftCardButton().click();
	}

	@Then("gift card page should displayed")
	public void gift_card_page_should_displayed() {
		
	    
	}
    
    @Then("^A box for entering postal code is displayed$")
    public void a_box_for_entering_postal_code_is_displayed() throws Throwable {
    	test.info("validating Gift card Page");
		log.info("validating Gift Card Page");
		Assert.assertTrue(gc.getGiftCardTitle().isDisplayed());
		test.pass("GiftCard Page Open" + driver.getTitle());
		log.info("Gift card Validate passed");
    
    }

   

    
}
