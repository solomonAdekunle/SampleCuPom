package pages;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

		driver.findElement(By.name("account_username")).sendKeys(UserName);

	}

	public void sendRegPassword(String password) {
		driver.findElement(By.name("account_password")).sendKeys(password);

	}
	public void sendRegConfPassword(String ConfPass) {
		driver.findElement(By.name("password_confirm")).sendKeys(ConfPass);

	}
	

	public void sendOnscreenName(String screenName) {
		String ScreenName = screenName;
		if (ScreenName.equals("{generator}")) {
			ScreenName = generateStringWithAllobedSplChars(16, "");
		}
		// Constant.Reg_OnScreeName.sendKeys(ScreenName);
		driver.findElement(By.name(Constant.Reg_OnScreeName)).sendKeys(ScreenName);

	}

	public void sendEmail(String Email) {
		driver.findElement(By.name(Constant.Reg_Email)).sendKeys(Email);

	}
   
	
	public void sendTitle(String title){
		driver.findElement(By.name(Constant.Reg_RegisterTitle)).sendKeys(title);
	}
	
	public void sendFirstName(String firstName) {
		driver.findElement(By.name(Constant.Reg_FirstName)).sendKeys(firstName);

	}

	public void sendSurName(String surname) {
		driver.findElement(By.name(Constant.Reg_SurName)).sendKeys(surname);

	}

	public void sendDOBday(String Day) {
		driver.findElement(By.name(Constant.Reg_DOB_Day)).sendKeys(Day);

	}

	public void sendDOBmonth(String Month) {
		// Constant.DOB_Month.sendKeys(Month);
		driver.findElement(By.name(Constant.Reg_DOB_Month)).sendKeys(Month);

	}

	public void sendDOByear(String Year) {
		driver.findElement(By.name(Constant.Reg_DOB_Year)).sendKeys(Year);

	}

	public void clickEnterManually() {
		driver.findElement(By.cssSelector(Constant.Reg_Enter_Manually)).click();

	}

	public void sendAddress(String Address) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(Constant.Reg_Address)));
		driver.findElement(By.name(Constant.Reg_Address)).sendKeys(Address);

	}

	public void sendCity(String Town) {
		driver.findElement(By.name(Constant.Reg_Town)).sendKeys(Town);

	}

	public void sendCounty(String county) {
		driver.findElement(By.name(Constant.Reg_County)).sendKeys(county);
	}

	public void sendCountry(String country) {
		driver.findElement(By.name(Constant.Reg_Country)).sendKeys(country);
	}

	public void sendCurrency(String CurrencyType) {
		driver.findElement(By.name(Constant.Reg_Currency)).sendKeys(CurrencyType);
	}

	public void sendPostCode(String Postcode) {
		driver.findElement(By.name(Constant.Reg_PostCode)).sendKeys(Postcode);

	}
	public void sendDiallingCode(String diallingcode){
		driver.findElement(By.name(Constant.Reg_CountryDialingCode)).sendKeys(diallingcode);
	}

	public void sendContactNumber(String contactNumber) {
		driver.findElement(By.name(Constant.Reg_Contact_Number)).sendKeys(contactNumber);

	}

	public void sendChooseType(String TypeLimit) {
		driver.findElement(By.name(Constant.Reg_DepositLimit_ChooseType)).sendKeys(TypeLimit);
	}

	public void sendChooseLimit(String Limit) {
		driver.findElement(By.cssSelector("select#edit-deposit-amount")).click();
		String Menu_Selector = "div.form-item-deposit-amount option[value='{0}']";
		// long LimitValue= Long.parseLong(Limit);
		//float f = Float.parseFloat(Limit);
		Menu_Selector = Menu_Selector.replace("{0}", Limit);
		System.out.println(Limit);
		driver.findElement(By.cssSelector(Menu_Selector)).click();

		

	}

	public void sendChooseLimitWeekly(String Limit) {
		 driver.findElement(By.xpath(Constant.Reg_DepositLimitValueBox)).click();
		driver.findElement(By.cssSelector(Constant.Reg_DepositLimit_ChooseLimitValue3)).click();
	}

	public void sendChooseLimitOther(String Other) {
		//WebDriverWait wait = new WebDriverWait(driver,30);
		 //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.Reg_DepositLimit_ChooseLimitOther)));
		 driver.findElement(By.cssSelector(Constant.Reg_DepositLimit_ChooseLimitOther)).sendKeys(Other);
	}

	public void checkFreeBonus() {

	}

	public void clickGenderType() {
		driver.findElement(By.id(Constant.Reg_GenderTypeFemale)).click();
	}

	public void checkOver18() {
		// Constant.Over18.click();
		driver.findElement(By.name(Constant.Reg_Over18)).click();

	}

	public void clickDepositLimit() {
		driver.findElement(By.cssSelector(Constant.Reg_DepositLimitLink)).click();
		// WebDriverWait wait = new WebDriverWait(driver,30);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.Reg_DepositLimit_ChooseType)));

	}

	public void clickDepositLimitClose() {
		driver.findElement(By.name(Constant.Reg_DepositLimit_close)).click();

	}
	public void clickEnterYourAddressManually(){
		driver.findElement(By.cssSelector(Constant.Reg_Enter_Manually)).click();
	}
	
	public void clickRegSubmit() {
		WebElement RegisterSubmit = driver.findElement(By.id(Constant.Reg_Submit));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", RegisterSubmit);
		// driver.findElement(By.cssSelector(Constant.Reg_Submit)).click();

	}

	public void clickTermsAndWager() {
	}

	public void clickTerm() {

	}

	public void privacy() {

	}

	public boolean isRegisterHelpIconPresent() {
		return driver.findElement(By.cssSelector(Constant.Reg_HelpIconlink)).isDisplayed();
	}

	public boolean isRegisterChatIconPresent() {
		return driver.findElement(By.cssSelector(Constant.Reg_ChatIconlink)).isDisplayed();
	}

	public boolean isRegisterWelcomeToSuperCasinoTextPresent() {
		return driver.findElement(By.cssSelector(Constant.Reg_WelToSuperCasinoText)).isDisplayed();
	}

	public boolean isRegisterJackpotSliderBlockPresent() {
		return driver.findElement(By.cssSelector(Constant.Reg_JackpotSliderBlock)).isDisplayed();
	}

	public boolean isRegisterPoromotionBannerPresent() {
		return driver.findElement(By.cssSelector(Constant.Reg_PromoBanner)).isDisplayed();
	}

	public boolean isRegisterEmailInputBoxPresent() {
		return driver.findElement(By.cssSelector(Constant.Reg_Email)).isDisplayed();
	}

	public boolean isRegisterPasswordInputBoxPresent() {
		return driver.findElement(By.name(Constant.Reg_PassWord)).isDisplayed();
	}

	public boolean isRegisterUserNameInputBoxPresent() {
		return driver.findElement(By.name(Constant.Reg_UserName)).isDisplayed();
	}

	public boolean isRegisterScreenNameInputBoxPresent() {
		return driver.findElement(By.name(Constant.Reg_OnScreeName)).isDisplayed();
	}

	public boolean isRegisterFirstNameInputBoxPresent() {
		return driver.findElement(By.name(Constant.Reg_FirstName)).isDisplayed();
	}

	public boolean isRegisterSurNameInputBoxPresent() {
		return driver.findElement(By.name(Constant.Reg_SurName)).isDisplayed();
	}

	public boolean isRegisterDOBDayDropdownBoxPresent() {
		return driver.findElement(By.name(Constant.Reg_DOB_Day)).isDisplayed();
	}

	public boolean isRegisterDOBMonthDropdownBoxPresent() {
		return driver.findElement(By.name(Constant.Reg_DOB_Month)).isDisplayed();
	}

	public boolean isRegisterGenderTypeFemaleRadioButtonPresent() {
		return driver.findElement(By.id(Constant.Reg_GenderTypeFemale)).isDisplayed();
	}

	public boolean isRegisterDOBYearhDropdownBoxPresent() {
		return driver.findElement(By.name(Constant.Reg_DOB_Month)).isDisplayed();
	}

	public boolean isRegisterGenderTypeMaleRadioButtonPresent() {
		return driver.findElement(By.id(Constant.Reg_GenderTypeMale)).isDisplayed();
	}

	public boolean isRegisterCountryInputBoxPresent() {
		return driver.findElement(By.name(Constant.Reg_Country)).isDisplayed();
	}

	public boolean isRegisterCunrrencyDropdownBoxPresent() {
		return driver.findElement(By.name(Constant.Reg_Currency)).isDisplayed();
	}
	public boolean isRegisterHouseNumberInputBoxPresent(){
		 return driver.findElement(By.name(Constant.Reg_Address)).isDisplayed();
	}
	
    public boolean isRegisterContactNumberInputBoxPresent(){
     return	driver.findElement(By.name(Constant.Reg_Contact_Number)).isDisplayed();
    }
    
    public boolean isRegisterPostCodeInputBoxPresent(){
    	 return driver.findElement(By.name(Constant.Reg_PostCode)).isDisplayed();
    }
    
	public boolean isRegisterFindAddressButtonPresent() {
		return driver.findElement(By.name(Constant.Reg_FindAddressButton)).isDisplayed();
	}

	public boolean isRegisterCountryDialingCodeDropdownBoxPresent() {
		return driver.findElement(By.name(Constant.Reg_CountryDialingCode)).isDisplayed();
	}
	
	public boolean isRegisterFreeBonusessCheckedBoxPresent() {
		return driver.findElement(By.name(Constant.Reg_Terms_Wagering)).isDisplayed();
	}
	public boolean isRegisterOverEightennPlusCheckBoxPresent() {
		return driver.findElement(By.name(Constant.Reg_Over18)).isDisplayed();
	}
	public boolean isRegisterOverEighteenTermsPresent() {
		return driver.findElement(By.cssSelector(Constant.Reg_Terms_Wagering)).isDisplayed();
	}
	public boolean isRegisterOverEighteenPrivacyPolicyBoxPresent() {
		return driver.findElement(By.cssSelector(Constant.Reg_privacyPolicy)).isDisplayed();
	}
	public boolean isRegisterRegisterNowButtonPresent() {
		return driver.findElement(By.name(Constant.Reg_Submit)).isDisplayed();
	}
	public boolean isComplianceTextPresent() {
		return driver.findElement(By.cssSelector(Constant.Reg_Compilaance_Message)).isDisplayed();
	}

	public boolean isDepositLimitLinkPresent(){
	 return	driver.findElement(By.cssSelector(Constant.Reg_DepositLimitLink)).isDisplayed();
	}

	public boolean isDepositLimitChooseTypePresent() {
		return driver.findElement(By.name(Constant.Reg_DepositLimit_ChooseType)).isDisplayed();

	}

	public boolean isDepositLimitChooseLimitPresent() {
		return driver.findElement(By.name(Constant.Reg_DepositLimit_ChooseLimit)).isDisplayed();
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

	
	public boolean isRegErrorMessagePresent() {
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.Reg_ErrorText)));
		boolean Failure = driver.findElement(By.cssSelector(Constant.Reg_ErrorText)).isDisplayed();
		return Failure;
	}
	public boolean isRegInvalidDataErrorMessagePresent(){
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.Reg_InvalidDataErrorMessage)));
		 return driver.findElement(By.cssSelector(Constant.Reg_InvalidDataErrorMessage)).isDisplayed();
	}
	
	public boolean isDisabledRegisterNowButtonPresent(){
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.Reg_DisabledRegisterNowButton)));
		return driver.findElement(By.cssSelector(Constant.Reg_DisabledRegisterNowButton)).isDisplayed();
		
		
	}

}
