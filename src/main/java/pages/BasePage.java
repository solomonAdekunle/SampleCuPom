package pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage  {

	
	
	protected WebDriver driver;
	
	
    // Initilising the WebDriver
	public BasePage(WebDriver driver) {
		this.driver = driver;
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

	
	
	
	
	protected String generateStringWithAllobedSplChars(int length,String allowdSplChrs){
		  String allowedChars="abcdefghijklmnopqrstuvwxyz" +   //alphabets
		    "1234567890" +   //numbers
		    allowdSplChrs;
		  return RandomStringUtils.random(length, allowedChars);
		 }

				
	protected String generateRandomAlphaNumeric(int length){
		  return RandomStringUtils.randomAlphanumeric(length);
		 }
}