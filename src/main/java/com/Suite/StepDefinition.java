package com.Suite;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

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

public class StepDefinition extends BaseTest{

	private HomePage homePage;
	
	public StepDefinition() {
		
		super();
		
		//all pages
		this.homePage = new HomePage(this.driver);
		
		
		
		
	}
	
	@Given("^I navigate to the homepage on Mozilla$")
	public void i_navigate_to_on_Mozilla() throws Throwable {
		this.homePage.get(CONFIG.getProperty("siteName"));
	}

	@When("^I enter \"([^\"]*)\" as \"([^\"]*)\"$")
	public void i_enter_as(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on \"([^\"]*)\"$")
	public void i_click_on(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should see \"([^\"]*)\" displayed as UsernameInfo$")
	public void i_should_see_displayed_as_UsernameInfo(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should see \"([^\"]*)\" displayed as Account Balance$")
	public void i_should_see_displayed_as_Account_Balance(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should see \"([^\"]*)\" displayed as Deposit button$")
	public void i_should_see_displayed_as_Deposit_button(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should see \"([^\"]*)\" displayed as Account Menu$")
	public void i_should_see_displayed_as_Account_Menu(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
