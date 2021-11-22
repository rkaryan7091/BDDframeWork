package com.mindtree.stepDefinitions;


import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.mindtree.pageobjects.LoginPageLC;
import com.mindtree.reusablecomponent.Base;
import com.mindtree.utilities.excelSheet;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginTeststepDefinition extends Base {

	public static Logger log = LogManager.getLogger(LoginTeststepDefinition.class.getName());

	LoginPageLC lg = new LoginPageLC(driver);

	@And("Clicks on sign in")
	public void clicks_on_sign_in() {
		test.info("Clicling on SignIn Button");
		lg.getHomeSignInButtond().click();
		log.info("clicked on SignIn Button");
	}

	@Then("User enters username and password")
	public void user_enters_username_and_password() throws IOException {
		log.info("navigated to Login Page");
		test.info("navigated to Login Page");
		// sending email addreess from excelsheet to loginPage
		log.info("getting email addreess from excel and sending to username");
		test.info("Entering Username");
		lg.getemailBox().sendKeys(excelSheet.getExcelSheetData("sheet1", 1, 0));
		// sending Password from excelSheet to loginPage
		log.info("getting password from excelSheet and sending to password");
		test.info("Entering password");
		lg.getpasswordBox().sendKeys(excelSheet.getExcelSheetData("sheet1", 1, 1));

	}

	@And("Click on submit")
	public void click_on_submit() throws InterruptedException {
		// Clicking on signIn Button
		log.info("clicking on signButton");
		test.info("Clicking SignIn Button");
		lg.getLoginSignButton().click();
		log.info("Validation Login Page");
		test.info("Validating Login Page");
		Assert.assertTrue(lg.getAccountDetail().isDisplayed());
		test.pass("Login Succesfull");

	}

}
