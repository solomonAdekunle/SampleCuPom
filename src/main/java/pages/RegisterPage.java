package pages;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Constant;

public class RegisterPage extends BasePage {


	public RegisterPage(WebDriver driver) {
		// this.driver = driver;
		super(driver);
	}

	public void get(String baseURL) {
		this.driver.get(baseURL + "/register");
	}

	public void sendRegUsername(String username) {
          String UserName=username;
		if(UserName.equals("{generator}")){
			UserName= generateStringWithAllobedSplChars(20,"");
				
			}
		//Constant.Reg_UserName.sendKeys(username);
		driver.findElement(By.cssSelector("input#account_username")).sendKeys(UserName);
	}

	public void sendRegPassword(String password) {
		Constant.Reg_PassWord.sendKeys(password);

	}

	public void sendConfirmpassword(String ConfPass) {
		Constant.Reg_ConfirmPassword.sendKeys(ConfPass);;
		
	}

	public void sendOnscreenName(String screenName) {
		String ScreenName=screenName;
		if(ScreenName.equals("{generator}")){
			ScreenName=generateRandomAlphaNumeric(16);
		}
		Constant.Reg_OnScreeName.sendKeys(ScreenName);

	}
	public void sendEmail(String Email){
		Constant.Reg_Email.sendKeys(Email);
		
	}

	public void sendTitle(String title) {
		Constant.Reg_Title.sendKeys(title);

	}

	public void sendFirstName(String firstName) {
		Constant.First_Name.sendKeys(firstName);

	}

	public void sendSurName(String surname) {
		Constant.SurName.sendKeys(surname);

	}

	public void sendDOBday(String Day) {
		Constant.DOB_Day.sendKeys(Day);

	}

	public void sendDOBmonth(String Month) {
		Constant.DOB_Month.sendKeys(Month);

	}

	public void sendDOByear(String Year) {
		Constant.DOB_Year.sendKeys(Year);

	}

	public void clickEnterManually() {
		Constant.Enter_Manually.click();

	}

	public void sendAddress(String Address) {
		Constant.Address.sendKeys(Address);

	}

	public void sendCity(String Town) {
		Constant.Town.sendKeys(Town);

	}

	public void sendCounty(String county) {
    Constant.County.sendKeys(county);
	}

	public void sendPostCode(String Postcode) {
		Constant.PostCode.sendKeys(Postcode);

	}

	public void sendContactNumber(String contactNumber) {
		Constant.Contact_Number.sendKeys(contactNumber);

	}

	public void checkFreeBonus() {

	}

	public void checkOver18() {
		Constant.Over18.click();

	}

	public void clickTermsAndWager() {
	}

	public void clickTerm() {

	}

	public void privacy() {

	}

	public void isComplianceTextPresent() {
		

	}

	public void clickRegSubmit() {
		Constant.Reg_Submit.click();

	}
	public  boolean getWelcomePage(){
		return driver.findElement(By.cssSelector("h1.title")).isDisplayed();
		
		
		
	}
	
}
