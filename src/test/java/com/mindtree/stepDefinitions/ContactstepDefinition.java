package com.mindtree.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;


import com.mindtree.pageobjects.ContactUsLC;
import com.mindtree.reusablecomponent.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactstepDefinition extends Base{
	
	
	
	public static Logger log= LogManager.getLogger(ContactstepDefinition.class.getName());
	ContactUsLC cu=new ContactUsLC(driver);	

	
	@Then("User clicks on Contact Us link")
	public void user_clicks_on_contact_us_link() {
		
	    test.info("Clicking on Contact Us");
	    log.info("Clicking on Contact Us");
	    cu.getContactUs().click();
		
		
	    
	}

	@When("the User lands on Contact Us form")
	public void the_user_lands_on_contact_us_form() {
	    // Write code here that turns the phrase above into concrete actions
		 test.info("Navigated To contact us page");
		    log.info("Navigated TO Contact us Page");
	    
	}

	 @Then("User should enter {string}, {string} and {string}")
	    public void user_should_enter_and(String name, String emailid, String message) throws Throwable {
		 test.info("Enetering Name");
		    log.info("Entering Name");
		    cu.getName().sendKeys(name);
		    test.info("Enetering Email");
		    log.info("Entering Email");
		    cu.getEmail().sendKeys(emailid);
		    test.info("Enetering Message");
		    log.info("Entering Message");
		    cu.getMessage().sendKeys(message);
		 
			
	    }

	@And("User Clicks on submit")
	public void user_clicks_on_submit() throws InterruptedException {
	    test.info("Click on Send Button");
	    log.info("clicking on Send Button");
	    cu.getSendButton().click();
	}

	@Then("A Thankyou Message should be displayed")
	public void a_thankyou_message_should_be_displayed() {
	   
		Assert.assertTrue(cu.getThanksMessage().isDisplayed());
		log.error("Thankyou message is not displayed");
		//test.fail("Thankyou message is not displayed ");
		
	}
}
