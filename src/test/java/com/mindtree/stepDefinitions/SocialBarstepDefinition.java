package com.mindtree.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.mindtree.pageobjects.ValidationSocialNavigationLC;
import com.mindtree.reusablecomponent.Base;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SocialBarstepDefinition extends Base{
	
	public static Logger log = LogManager.getLogger(SocialBarstepDefinition.class.getName());

	ValidationSocialNavigationLC sn=new ValidationSocialNavigationLC(driver);

	
	@When("Click on Facebook logo")
	public void click_on_facebook_logo() {
		ValidationSocialNavigationLC sn=new ValidationSocialNavigationLC(driver);
		test.info("clicking on FaceBook Logo");
		log.info("Clicking on Facebook Logo");
		sn.getFacebook().click();
	    
	}

	@Then("facebook page should displayed")
	public void facebook_page_should_displayed() {
		test.info("Getting current page title and verifing it");
		log.info("Getting current page title and verifing it");
        Assert.assertEquals("bigsmall.in - Home | Facebook",driver.getTitle());
        test.pass("page navigated to facebook site");
        log.info("page navigated to facebook site");
	    
	}

	@Then("Navigate back to BigSmall site")
	public void navigate_back_to_big_small_site() {
		 driver.navigate().back();
	        test.info("driver navigate back to bigsmall site");
	        log.info("driver navigate back to bigsmall site");
	        
	    
	}

	@When("Click on Youtube logo")
	public void click_on_youtube_logo() {
		test.info("clicking on youtube Logo");
		log.info("Clicking on youtube Logo");
		sn.getYoutube().click();
		
	    
	}

	@Then("Youtube page should displayed")
	public void youtube_page_should_displayed() {
		test.info("Getting current page title and verifing it");
		log.info("Getting current page title and verifing it");
        Assert.assertEquals("bigsmall.in - YouTube",driver.getTitle());
        test.pass("page navigated to youtube site");
        log.info("page navigated to youtube site");
        
	    
	}

	@When("Click on Twitter logo")
	public void click_on_twitter_logo() {
		test.info("driver navigate back to bigsmall site");
        log.info("driver navigate back to bigsmall site");
        test.info("clicking on twitter Logo");
		log.info("Clicking on twitter Logo");
		sn.getTwitter().click();
		
	    
	}

	@Then("Twitter page should displayed")
	public void twitter_page_should_displayed() throws InterruptedException {
		test.info("Getting current page title and verifing it");
		log.info("Getting current page title and verifing it");
		Thread.sleep(3000);
        Assert.assertEquals("bigsmall.in (@Bigsmallstore) / Twitter",driver.getTitle());
        test.pass("page navigated to twitter site");
        log.info("page navigated to twitter site");
        test.pass("Social Link verified Successfully");
	    
	}

}
