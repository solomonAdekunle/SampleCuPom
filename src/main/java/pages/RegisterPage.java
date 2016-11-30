package pages;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.sun.org.apache.xpath.internal.operations.String;

import Connector.WebConnector;

public class RegisterPage {
	
	private WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void get(java.lang.String baseURL) {
		this.driver.get(baseURL + "/register");
	}
		
		

	public void sendUsername(String username) {
		
	}
	
	public void sendPassword(String password) {
		
	}

}
	


