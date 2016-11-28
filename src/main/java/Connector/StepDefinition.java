package Connector;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;

public class StepDefinition  extends WebConnector {

	public StepDefinition() {
		
		// TODO Auto-generated constructor stub
		
	}
	@Given("^I navigate to \"([^\"]*)\" on \"([^\"]*)\"$")
	public void i_navigate_to_on_Mozilla(String siteName,String browser) throws Throwable {
		// check if logged in the browser.. if not.. login
	System.out.println("I navigate to "+ siteName +" on  "+ browser);
			openBrowser(browser);
				navigate(siteName);
	
	}
}
