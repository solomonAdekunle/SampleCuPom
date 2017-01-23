package pages;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		String UserName = username;
		if (UserName.equals("{generator}")) {
			UserName = generateStringWithAllobedSplChars(20, "");

		}

		driver.findElement(By.cssSelector("input#account_username")).sendKeys(UserName);

	}

	public void sendRegPassword(String password) {

		driver.findElement(By.cssSelector("input#account_password")).sendKeys(password);

	}

	public void sendConfirmpassword(String ConfPass) {
		// Constant.Reg_ConfirmPassword.sendKeys(ConfPass);
		driver.findElement(By.cssSelector(Constant.Reg_ConfirmPassword)).sendKeys(ConfPass);

	}

	public void sendOnscreenName(String screenName) {
		String ScreenName = screenName;
		if (ScreenName.equals("{generator}")) {
			ScreenName = generateRandomAlphaNumeric(16);
		}
		// Constant.Reg_OnScreeName.sendKeys(ScreenName);
		driver.findElement(By.cssSelector(Constant.Reg_OnScreeName)).sendKeys(ScreenName);

	}

	public void sendEmail(String Email) {
		driver.findElement(By.cssSelector(Constant.Reg_Email)).sendKeys(Email);

	}

	public void sendTitle(String title) {
		driver.findElement(By.cssSelector(Constant.Reg_Title)).sendKeys(title);

	}

	public void sendFirstName(String firstName) {
		driver.findElement(By.cssSelector(Constant.Reg_FirstName)).sendKeys(firstName);

	}

	public void sendSurName(String surname) {

		driver.findElement(By.cssSelector(Constant.Reg_SurName)).sendKeys(surname);

	}

	public void sendDOBday(String Day) {
		driver.findElement(By.cssSelector(Constant.Reg_DOB_Day)).sendKeys(Day);

	}

	public void sendDOBmonth(String Month) {
		// Constant.DOB_Month.sendKeys(Month);
		driver.findElement(By.cssSelector(Constant.Reg_DOB_Month)).sendKeys(Month);

	}

	public void sendDOByear(String Year) {
		driver.findElement(By.cssSelector(Constant.Reg_DOB_Year)).sendKeys(Year);

	}

	public void clickEnterManually() {
		driver.findElement(By.cssSelector(Constant.Reg_Enter_Manually)).click();

	}

	public void sendAddress(String Address) {
		// Constant.Address.sendKeys(Address);
		driver.findElement(By.cssSelector(Constant.Reg_Address)).sendKeys(Address);

	}

	public void sendCity(String Town) {
		// Constant.Town.sendKeys(Town);
		driver.findElement(By.cssSelector(Constant.Reg_Town)).sendKeys(Town);

	}

	public void sendCounty(String county) {
		driver.findElement(By.cssSelector(Constant.Reg_County)).sendKeys(county);
	}

	public void sendPostCode(String Postcode) {
		driver.findElement(By.cssSelector(Constant.Reg_PostCode)).sendKeys(Postcode);

	}

	public void sendChooseType(String Type) {
		driver.findElement(By.cssSelector(Constant.Reg_DepositLimit_ChooseType)).sendKeys(Type);
	}

	public void sendChooseLimit(String Limit) {
		
		driver.findElement(By.cssSelector("select#edit-deposit-amount")).click();
		String Menu_Selector="div.form-item-deposit-amount option[value='{0}']";
		//long  LimitValue= Long.parseLong(Limit);
		float f = Float.parseFloat(Limit);
		 Menu_Selector= Menu_Selector.replace("{0}", String.valueOf(f));
		 System.out.println(f);
		 driver.findElement(By.cssSelector(Menu_Selector)).click();
		 
		//WebDriverWait wait = new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(Constant.Reg_DepositLimit_ChooseLimit)));
		//driver.findElement(By.xpath(Constant.Reg_DepositLimitValueBox)).click();
		//driver.findElement(By.cssSelector(Constant.Reg_DepositLimit_ChooseLimitValue2)).click();
		
		
	} 
	public void sendChooseLimitWeekly(String Limit) {
	//driver.findElement(By.xpath(Constant.Reg_DepositLimitValueBox)).click();
	//driver.findElement(By.cssSelector(Constant.Reg_DepositLimit_ChooseLimitValue3)).click();
	}
	
	public void sendContactNumber(String contactNumber) {
		driver.findElement(By.cssSelector(Constant.Reg_Contact_Number)).sendKeys(contactNumber);

	}
	

	public void sendChooseLimitOther(String Other) {
		//driver.findElement(By.cssSelector(Constant.Reg_DepositLimit_ChooseLimitOther)).sendKeys(Other);
	}
	

	public void checkFreeBonus() {

	}

	public void checkOver18() {
		// Constant.Over18.click();
		driver.findElement(By.cssSelector(Constant.Reg_Over18)).click();

	}

	public void clickDepositLimit() {
		driver.findElement(By.cssSelector(Constant.Reg_DepositLimitLink)).click();

	}

	public void clickDepositLimitClose() {
		driver.findElement(By.cssSelector(Constant.Reg_DepositLimit_close)).click();

	}

	public void clickRegSubmit() {
		driver.findElement(By.cssSelector(Constant.Reg_Submit)).click();

	}

	public void clickTermsAndWager() {
	}

	public void clickTerm() {

	}

	public void privacy() {

	}

	public void isComplianceTextPresent() {

	}

	public boolean isDepositLimitLinkPresent() {
		return driver.findElement(By.cssSelector(Constant.Reg_DepositLimitLink)).isDisplayed();

	}

	public boolean isDepositLimitChooseTypePresent() {
		return driver.findElement(By.cssSelector(Constant.Reg_DepositLimit_ChooseType)).isDisplayed();

	}

	public boolean isDepositLimitChooseLimitPresent() {
		return driver.findElement(By.cssSelector(Constant.Reg_DepositLimit_ChooseLimit)).isDisplayed();
	}
     
	
	 public boolean isDepositLimitOtherInputBoxPresent(){
		return  driver.findElement(By.cssSelector(Constant.Reg_DepositLimit_ChooseLimitOther)).isDisplayed();
	 }
	public boolean isDepositLimitDailyPresent(String Value) {
		return driver.findElement(By.cssSelector(Constant.Reg_DepositLimit_ChooseTypeDaily)).isDisplayed();

	}

	public boolean isDepositLimitWeeklyPresent(String Value) {
		return driver.findElement(By.cssSelector(Constant.Reg_DepositLimit_ChooseTypeWeekLy)).isDisplayed();

	}

	public boolean isDepositLimitMonthlyPresent(String Value) {
		return driver.findElement(By.cssSelector(Constant.Reg_DepositLimit_ChooseTypeMonthly)).isDisplayed();

	}

	public boolean isDepositLimitThousandPoundsPresent(String Value) {
		 return driver.findElement(By.cssSelector(Constant.Reg_DepositLimit_ChooseLimitValue1)).isDisplayed();

	}

	public boolean isDepositLimitTenThousandPoundsPresent(String Value) {
		 return driver.findElement(By.cssSelector(Constant.Reg_DepositLimit_ChooseLimitValue2)).isDisplayed();
	}

	public boolean isDepositLimitFiftyThousandPoundsPresent(String Value) {
		 return driver.findElement(By.cssSelector(Constant.Reg_DepositLimit_ChooseLimitValue3)).isDisplayed();
	}

	public boolean isDepositLimitOtherValuePresent(String Value) {
		 return driver.findElement(By.cssSelector(Constant.Reg_DepositLimit_ChooseLimitValue4)).isDisplayed();
	}

	public boolean getWelcomePage(String expectedResult) {
		return driver.findElement(By.cssSelector("h1.welcome_header")).isDisplayed();

	}

}
