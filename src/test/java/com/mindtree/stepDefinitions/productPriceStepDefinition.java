package com.mindtree.stepDefinitions;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import com.mindtree.pageobjects.priceComparisonLC;
import com.mindtree.reusablecomponent.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class productPriceStepDefinition extends Base {

	public static Logger log = LogManager.getLogger(productPriceStepDefinition.class.getName());

	priceComparisonLC pc = new priceComparisonLC(driver);
	static String searchPrice;

	@Given("User pass the input into search box and press Enter")
	public void user_pass_the_input_into_search_box_and_press_enter() throws InterruptedException {
		
		log.info("Entering text into the search bar");
		//test.info("Entering text into the search bar");
		pc.getSearchButton().sendKeys("Iron Man",Keys.ENTER);
		Thread.sleep(5000);

	}
	@Then("Getting first product Price from searchList")
	public void getting_first_product_price_from_search_list() {
		test.info("getting Price of first Product from search product list");
		searchPrice=pc.getProductPrice().getText();
		log.info("getting price from search list of first product : Price : "+searchPrice);
	}

	@Then("Clicking on First Product")
	public void clicking_on_first_product() {
		pc.getSelectProduct().click();
		test.info("Clicking on First Item");
		log.info("selecting first product");
	}

	@Then("getting Product Price from Product Page and matching to SearchList Price")
	public void getting_product_price_from_product_page_and_matching_to_search_list_price() {
		String productPrice=pc.getProductPrice2().getText();
		test.info("getting price from product page");
		log.info("getting price from product page");
		log.info("matching price");
		test.info("Matching Price");
		Assert.assertEquals(searchPrice, productPrice);
		log.info("Price Matched");
		test.pass("Price Matched");

	}

	

}
