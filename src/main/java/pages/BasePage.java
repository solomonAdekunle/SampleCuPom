package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.Constant;

public class BasePage  {

	
	
	protected  WebDriver driver;
	
	
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
		WebDriverWait wait=  new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.HP_DeopsitButton)));
		return driver.findElement(By.xpath("//*[@id='account_box']/a")).isDisplayed();
	}

	public String getUserName() {
		 return driver.findElement(By.cssSelector("div#account_box .username")).getText();
	}

	
	public void clickForgottenDetailsLink(){
		driver.findElement(By.cssSelector(Constant.HomePage_ForgottenDetailsLink)).click();
		
	}
	 public boolean isLoginErrorMessPoxBoxPresent(){
		 WebDriverWait wait=  new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.Login_ErrorPopBox)));
		return driver.findElement(By.cssSelector(Constant.Login_ErrorPopBox)).isDisplayed();
		 
	 }
	// Click on the deposit button on the home page
	public void clickHpDepositButton(){
		 WebDriverWait wait=  new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div#authcache-block-account-FLEX_account_block a.deposit")));
		driver.findElement(By.cssSelector(Constant.HP_DeopsitButton)).click();
	}
	 public void moveAccountMenu(){
		 WebElement AccounMenu= driver.findElement(By.xpath(Constant.AccountMenuDropdown));
		 Actions move=new Actions(driver);
		 move.moveToElement(AccounMenu).build().perform();
		 //
	 }
	 public void clickChangePasswordLink(){
		 driver.findElement(By.xpath(Constant.AccountMenu_ChangePassword)).click();
	 }
	 public void clickWithdrawLink(){
		 WebDriverWait wait=  new WebDriverWait(driver,15);
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.AccountMenu_Withdrawl)));
		driver.findElement(By.cssSelector(Constant.AccountMenu_Withdrawl)).click();
		 
	 }
	 
	 public void clickChatIcon(){
		 
	 }
	 
	 
	 
	 public void clickHelpIcon(){
		 
	 }
	 
	 public void clickCasinoTab(){
		 driver.findElement(By.cssSelector(Constant.VerticalTab_Casino)).click();
		 
	 }
	 
	  public void clickVegasTab(){
		  WebDriverWait wait=  new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.VerticalTab_Vegas)));
		  driver.findElement(By.cssSelector(Constant.VerticalTab_Vegas)).click();
		  
	  }
	  public void clickLiveTab(){
		  driver.findElement(By.cssSelector(Constant.VerticalTab_Live)).click();
		  
	  }
	  public void clickPromotionsTab(){
		  driver.findElement(By.cssSelector(Constant.VerticalTab_Promotions)).click();
		  
	  }
	  
	  
	  
	// Creating a dologin function
	public void  doLogin(String baseURL,String username, String password){
		driver.get(baseURL);
	 driver.findElement(By.xpath("//*[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
		driver.findElement(By.cssSelector("div.playtech-login-block button.sign-in")).click();
		WebDriverWait wait=  new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.HP_DeopsitButton)));
		
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
	
}