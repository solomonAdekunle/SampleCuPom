package com.Suite;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import Connector.WebConnector;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.RegisterPage;

public class StepDefinition extends BaseTest {

	private HomePage homePage;
	private RegisterPage registerPage;

	public StepDefinition() {

		super();

		// all pages
		homePage = new HomePage(this.driver);
		registerPage = new RegisterPage(this.driver);
	}

	/*
	 * Navigating to the home page
	 * 
	 * @param {string} siteName-is the url address od supercasino.com
	 **/
	@Given("^I navigate to the homepage on Mozilla$")
	public void i_navigate_to_on_Mozilla() {
		homePage.get(CONFIG.getProperty("siteName"));
	}
	@Given("^I navigate to the Registrationpage on Mozilla$")
	public void i_navigate_to_the_Registrationpage_on_Mozilla() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	/**
	 * Entering the username into the Loging username input box
	 * 
	 * @param {string}
	 *            username- this is the UserName entered into the login username
	 *            text box.
	 */
	@When("^I enter Username as \"([^\"]*)\"$")
	public void i_enter_Username_as(String username) {
		homePage.sendUsername(username);
	}

	/**
	 * Entering the password into the Loging username input box
	 * 
	 * @param {string}
	 *            password- this is the Password entered into the login Password
	 *            text box.
	 */
	@When("^I enter Password as \"([^\"]*)\"$")
	public void i_enter_Password_as(String password) {
		homePage.sendPassword(password);

	}

	/**
	 * Clicking the Signin button to login
	 */
	@When("^I click on SignIn button$")
	public void i_click_on_SignIn_button() {
		homePage.clickSigin();
	}

	/*
	 * clicking on Join Now button to navigate to registration page
	 **/
	@When("^I click on JoinNow Button$")
	public void i_click_on_JoinNow_Button() {
		this.homePage.clickJoinNow();
	}
	
	@When("^I click on RegisterButton$")
	public void i_click_on_RegisterButton() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	@When("^I enter RegPassword as \"([^\"]*)\"$")
	public void i_enter_RegPassword_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	@When("^I enter RegConfirmPassword as \"([^\"]*)\"$")
	public void i_enter_RegConfirmPassword_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	@When("^I enter a RegScreenName as \"([^\"]*)\"$")
	public void i_enter_a_RegScreenName_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	@When("^I enter RegEmail as \"([^\"]*)\"$")
	public void i_enter_RegEmail_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I enter RegTitle as \"([^\"]*)\"$")
	public void i_enter_RegTitle_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I enter RegFirstName as \"([^\"]*)\"$")
	public void i_enter_RegFirstName_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I enter RegSurName as \"([^\"]*)\"$")
	public void i_enter_RegSurName_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I enter RegDOBDay as \"([^\"]*)\"$")
	public void i_enter_RegDOBDay_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I enter RegDOBMonth as \"([^\"]*)\"$")
	public void i_enter_RegDOBMonth_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I enter RegDOBYear as \"([^\"]*)\"$")
	public void i_enter_RegDOBYear_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on RegClickHere$")
	public void i_click_on_RegClickHere() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I enter RegAddress as \"([^\"]*)\"$")
	public void i_enter_RegAddress_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I enter RegTown as \"([^\"]*)\"$")
	public void i_enter_RegTown_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I enter RegCounty as \"([^\"]*)\"$")
	public void i_enter_RegCounty_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I enter RegPostCode as \"([^\"]*)\"$")
	public void i_enter_RegPostCode_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I enter RegContactNum as \"([^\"]*)\"$")
	public void i_enter_RegContactNum_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on RegT\\$CCheckBox$")
	public void i_click_on_RegT$CCheckBox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on RegSubmitButton$")
	public void i_click_on_RegSubmitButton() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	/*
	 * Verifying if username displayed is the same as the username entered to
	 * login
	 * 
	 * @param {string} username- this is the Name displayed on the user's
	 * account loggin page
	 **/
	@Then("^I should see username as \"([^\"]*)\" present$")
	public void i_should_see_username_as_present(String username) throws Throwable {
		Assert.assertEquals(username, homePage.getUserName());
	}

	/**
	 * Verifying if Account Balance is displayed after login
	 */
	@Then("^I should see AccountBlance present$")
	public void i_should_see_AccountBlance_present() {

	}

	/*
	 * Verifying if Deposit button is displayed after login
	 **/
	@Then("^I should see Depositbutton present$")
	public void i_should_see_Depositbutton_present() {
		Assert.assertTrue(homePage.isDepositButtonPresent());
	}

	/*
	 * verifying if Account Menu is displayed when user have logged in
	 **/
	@Then("^I should see AccountMenu_$")
	public void i_should_see_AccountMenu_() {

	}

	/*
	 * Verifying if the URL address of the register page is the same as
	 * expected.
	 **/
	@Then("^I should navigate  to Registration page$")
	public void i_should_navigate_to_Registration_page() {
		Assert.assertEquals("is the Url address the same", this.homePage.getCurrentUrl(), driver.getCurrentUrl());

	}
	@Then("^I should navigate \"([^\"]*)\" to welcome page\\.$")
	public void i_should_navigate_to_welcome_page(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


}
