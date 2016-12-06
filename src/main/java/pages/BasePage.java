package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.Suite.BaseTest;

import Util.Constant;

public class BasePage extends BaseTest  {

	
	
	protected static  WebDriver driver;
	
	
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

	
	public void clickForgottenDetailsLink(){
		driver.findElement(By.cssSelector(Constant.HomePage_ForgottenDetailsLink)).click();
		
	}
	
	// Creating a dologin function
	public void  doLogin(String Username, String password){
	 driver.findElement(By.xpath("//*[@id='username']")).sendKeys(Username);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
		driver.findElement(By.cssSelector("div.playtech-login-block button.sign-in")).click();
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
	
	//store screenshot
	public static void takeScreenshot(String fileName) {
	File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    try {
		FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+"\\screenshots\\"+fileName+".jpg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}