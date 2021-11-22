package com.mindtree.stepDefinitions;




import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.mindtree.pageobjects.NavBarValidationLC;
import com.mindtree.reusablecomponent.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HoverActionstepDefination extends Base {
	
	public static Logger log = LogManager.getLogger(HoverActionstepDefination.class.getName());

	NavBarValidationLC nv=new NavBarValidationLC(driver);

	
	@Given("Hover the mouse on Shop By section")
	public void hover_the_mouse_on_shop_by_section() {
		Actions a=new Actions(driver);
		WebElement move=nv.getNavShopByCategory();
		a.moveToElement(move).build().perform();
	}

	@When("The Option inside it are displayed user Click On 3D Mugs")
	public void the_option_inside_it_are_displayed_user_click_on_3d_mugs() {
		log.info("Hover performed successfully");
		test.info("Selecting Product category");
		log.info("Selecting Product category");
		nv.getNavProductSelect().click();
	}

	@Then("the page displaying results for 3D Mugs should be displayed")
	public void the_page_displaying_results_for_3d_mugs_should_be_displayed() {
		test.info("Product Selected from Drop Down");
		log.info("Product Selected from Drop Down");
		Assert.assertEquals(driver.getTitle(),"Coffee Mugs Online - Buy 3D Mugs, Travel Mugs, Funky Mugs [2021]– Bigsmall.in");
		test.pass("Navigation Bar Validated Succefully");
		log.info("Navigation Bar Validated Succefully");
		
	}
	
	
	
}
