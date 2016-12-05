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
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasePage;
import pages.HomePage;
import pages.RegisterPage;

public class StepDefinition extends BaseTest {

	private BasePage basePage;
	private HomePage homePage;
	private RegisterPage registerPage;

	public StepDefinition() {

		super();

		// all pages
		homePage = new HomePage(this.driver);
		registerPage = new RegisterPage(this.driver);
		basePage = new BasePage(this.driver);
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/* This below are Only For @Given Methods */
	///////////////////////////////////////////////////////////////////////////////////////////////////////////

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
	public void i_navigate_to_the_Registrationpage_on_Mozilla() {
		registerPage.get(CONFIG.getProperty("siteName"));

	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	/* This Below are only for @When Methods */
	//////////////////////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Entering the username into the Loging username input box
	 * 
	 * @param {string}
	 *            username- this is the UserName entered into the login username
	 *            text box.
	 */
	@When("^I enter Username as \"([^\"]*)\"$")
	public void i_enter_Username_as(String username) {
		basePage.sendUsername(username);
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
		basePage.sendPassword(password);

	}

	/**
	 * Clicking the Signin button to login
	 */
	@When("^I click on SignIn button$")
	public void i_click_on_SignIn_button() {
		basePage.clickSigin();
	}

	/*
	 * clicking on Join Now button to navigate to registration page
	 **/
	@When("^I click on JoinNow Button$")
	public void i_click_on_JoinNow_Button() {
		basePage.clickJoinNow();
	}

	@When("^I click on RegisterButton$")
	public void i_click_on_RegisterButton() {

	}

	@When("^I enter regUsername as \"([^\"]*)\"$")
	public void i_enter_regUsername_as(String UserName) {
		registerPage.sendRegUsername(UserName);

	}

	@When("^I enter RegPassword as \"([^\"]*)\"$")
	public void i_enter_RegPassword_as(String password) {
		registerPage.sendRegPassword(password);

	}

	@When("^I enter RegConfirmPassword as \"([^\"]*)\"$")
	public void i_enter_RegConfirmPassword_as(String ConfPass) {
		registerPage.sendConfirmpassword(ConfPass);
	}

	@When("^I enter a RegScreenName as \"([^\"]*)\"$")
	public void i_enter_a_RegScreenName_as(String ScreenName) {
		registerPage.sendOnscreenName(ScreenName);

	}

	@When("^I enter RegEmail as \"([^\"]*)\"$")
	public void i_enter_RegEmail_as(String Email) {
		registerPage.sendEmail(Email);

	}

	@When("^I enter RegTitle as \"([^\"]*)\"$")
	public void i_enter_RegTitle_as(String title) {
		registerPage.sendTitle(title);
	}

	@When("^I enter RegFirstName as \"([^\"]*)\"$")
	public void i_enter_RegFirstName_as(String firstName) {
		registerPage.sendFirstName(firstName);

	}

	@When("^I enter RegSurName as \"([^\"]*)\"$")
	public void i_enter_RegSurName_as(String surname) {
		registerPage.sendSurName(surname);

	}

	@When("^I enter RegDOBDay as \"([^\"]*)\"$")
	public void i_enter_RegDOBDay_as(String Day) {
		registerPage.sendDOBday(Day);

	}

	@When("^I enter RegDOBMonth as \"([^\"]*)\"$")
	public void i_enter_RegDOBMonth_as(String Month) {
		registerPage.sendDOBmonth(Month);
	}

	@When("^I enter RegDOBYear as \"([^\"]*)\"$")
	public void i_enter_RegDOBYear_as(String Year) {
		registerPage.sendDOByear(Year);

	}

	@When("^I click on RegClickHere$")
	public void i_click_on_RegClickHere() {
		registerPage.clickEnterManually();

	}

	@When("^I enter RegAddress as \"([^\"]*)\"$")
	public void i_enter_RegAddress_as(String Address) {
		registerPage.sendAddress(Address);

	}

	@When("^I enter RegTown as \"([^\"]*)\"$")
	public void i_enter_RegTown_as(String Town) {
		registerPage.sendCity(Town);

	}

	@When("^I enter RegCounty as \"([^\"]*)\"$")
	public void i_enter_RegCounty_as(String county) {
		registerPage.sendCounty(county);

	}

	@When("^I enter RegPostCode as \"([^\"]*)\"$")
	public void i_enter_RegPostCode_as(String Postcode) {
		registerPage.sendPostCode(Postcode);
	}

	@When("^I enter RegContactNum as \"([^\"]*)\"$")
	public void i_enter_RegContactNum_as(String contactNumber) {
		registerPage.sendContactNumber(contactNumber);

	}

	@When("^I click on RegT\\$CCheckBox$")
	public void i_click_on_RegT$CCheckBox() {
		registerPage.checkOver18();

	}

	@When("^I click on RegSubmitButton$")
	public void i_click_on_RegSubmitButton() {
		registerPage.clickRegSubmit();

	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////
	/* This Are only for @Then Methods */
	////////////////////////////////////////////////////////////////////////////////////////////////////////

	/*
	 * Verifying if username displayed is the same as the username entered to
	 * login
	 * 
	 * @param {string} username- this is the Name displayed on the user's
	 * account loggin page
	 **/
	@Then("^I should see username as \"([^\"]*)\" present$")
	public void i_should_see_username_as_present(String username) {
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
		Assert.assertTrue(basePage.isDepositButtonPresent());
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
		Assert.assertEquals("is the Url address the same", this.basePage.getCurrentUrl(), driver.getCurrentUrl());

	}

	/*
	 * Verifying if user able to register successfully
	 * 
	 * @param {string} expected Result- this id the Welcome title page
	 */
	@Then("^I should navigate \"([^\"]*)\" to welcome page\\.$")
	public void i_should_navigate_to_welcome_page(String expectedResult) {
		Assert.assertTrue(this.registerPage.getWelcomePage(expectedResult));

	}

}
