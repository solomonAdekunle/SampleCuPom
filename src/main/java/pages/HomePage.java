package pages;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Connector.WebConnector;

public class HomePage {
	@FindBy(css ="div.region-header input#username")
	public WebElement Login_Username;

	private WebDriver driver;
     // Initilising the WebDriver
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
     // get the Url address
	public void get(String baseURL) {
		this.driver.get(baseURL + "/");
	}

	public void sendUsername(String username) {
	// entering the Username into the username login file
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(username);
	}
    // entering the Password into the Password login field.
	public void sendPassword(String password) {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
	}
     
	public void clickSigin() {
		driver.findElement(By.cssSelector("div.playtech-login-block button.sign-in")).click();

	}

	public void clickJoinNow() {
		driver.findElement(By.xpath("//a[@class='button success register']")).click();
	     //driver.getCurrentUrl();

	}
	 public String getCurrentUrl(){
		String Url=  driver.getCurrentUrl() ;
		return Url;
	 }

	public boolean isDepositButtonPresent() {
		return driver.findElement(By.xpath("//*[@id='account_box']/a")).isDisplayed();
	}

	public String getUserName() {
		 return driver.findElement(By.cssSelector("div#account_box .username")).getText();
	}
}