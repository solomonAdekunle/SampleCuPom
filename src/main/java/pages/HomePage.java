package pages;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.sun.org.apache.xpath.internal.operations.String;

import Connector.WebConnector;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void get(java.lang.String baseURL) {
		this.driver.get(baseURL + "/");
	}
		
		

	public void sendUsername(String username) {
		
	}
	
	public void sendPassword(String password) {
		
	}
	
	public void clickSigin() {
		
	}
		
}
	


