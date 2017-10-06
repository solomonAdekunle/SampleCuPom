package com.suite.Cashier;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.Constant;
import bsh.org.objectweb.asm.Constants;
import pages.BasePage;

public class DepositPage extends BasePage {

	private String currentFrameId = "";
	private double CurrentBalance;
	// private double ShowbalFiqure;

	public DepositPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// Switiching to the Cashier
	/*
	 * public void isSwitchToCashier() { WebDriverWait wait = new
	 * WebDriverWait(driver, 30);
	 * wait.until(ExpectedConditions.presenceOfElementLocated(By.id(
	 * "cashier-iframe"))); driver.switchTo().frame("cashier-iframe");
	 * driver.switchTo().frame("icashier"); driver.switchTo().frame(1);
	 * wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(
	 * "#PB_CasinoMyAccount")));
	 * 
	 * }
	 */
	public String getCashierUsername() {
		// driver.switchTo().frame("cashier-iframe");
		this.switchFrameTo("icashier");
		return driver.findElement(By.cssSelector(Constant.Cashier_UserNameInfo)).getText();

	}

	public double getCashierBalancePresent() {
		this.switchFrameTo("icashier");
		String Showbal = driver.findElement(By.cssSelector(Constant.Cashier_BalanceFigure)).getText();
		String ShowBalance = Showbal.replace(",", "").substring(1);
		// System.out.println(ShowBalance);
		// String NewCurr=Double.toString(ShowbalFiqure);
		// System.out.println(NewCurr);
		double ShowbalFiqure = Double.parseDouble(ShowBalance);
		// System.out.println(ShowbalFiqure);
		return ShowbalFiqure;

	}

	public boolean isCashierMyAccountTabPresent() {
		// driver.switchTo().frame("cashier-iframe");
		this.switchFrameTo("icashier");
		return driver.findElement(By.cssSelector(Constant.Cashier_MyAccountTab)).isDisplayed();
	}

	public boolean isCashierDepositTabPresent() {
		// driver.switchTo().frame("cashier-iframe");
		this.switchFrameTo("icashier");
		WebDriverWait wait =new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.Cashier_DepositTab)));
		return driver.findElement(By.cssSelector(Constant.Cashier_DepositTab)).isDisplayed();

	}

	public boolean isCashierWithdrawTabPresent() {
		// driver.switchTo().frame("cashier-iframe");
		this.switchFrameTo("icashier");
		WebDriverWait wait =new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.Cashier_WithrawTab)));
		return driver.findElement(By.cssSelector(Constant.Cashier_WithrawTab)).isDisplayed();
	}

	public boolean isCashierMyPaymentMethodTextPresent() {
		this.switchFrameTo("ThirdPartyPage");
		return driver.findElement(By.cssSelector(Constant.Cashier_MyPaymentMethodtext)).isDisplayed();

	}

	public boolean isCashierPaymentDetailsTextPresent() {
		this.switchFrameTo("ThirdPartyPage");
		System.out.println(driver.findElement(By.cssSelector(Constant.Cashier_MyPaymentMethodtext)).isDisplayed());
		return driver.findElement(By.cssSelector(Constant.Cashier_MyPaymentMethodtext)).isDisplayed();

	}

	public boolean isCashierMyPaymentLogoPresent() {
		this.switchFrameTo("ThirdPartyPage");

		return driver.findElement(By.cssSelector(Constant.Cashier_MyPaymentMthodLogo)).isDisplayed();

	}

	public boolean isCashierOtherPaymentMethodLogo() {
		this.switchFrameTo("ThirdPartyPage");
		return driver.findElement(By.cssSelector(Constant.Cashier_MyPaymentMthodLogo)).isDisplayed();

	}

	public boolean isCashierCreditNameOwnerPresent() {
		this.switchFrameTo("ThirdPartyPage");
		return driver.findElement(By.cssSelector(Constant.Cashier_CardOwnerName)).isDisplayed();

	}

	public boolean isCashierLastFourDigitCardNumberPresent() {
		this.switchFrameTo("ThirdPartyPage");
		return driver.findElement(By.cssSelector(Constant.Cashier_CardOwnerNumber)).isDisplayed();

	}

	public boolean isCashierCreditCardExpiaryDatePresent() {
		this.switchFrameTo("ThirdPartyPage");
		return driver.findElement(By.cssSelector(Constant.Cashier_CardExpirydate)).isDisplayed();

	}

	public boolean isLastFourdigitNumberPresent() {
		this.switchFrameTo("ThirdPartyPage");
		return driver.findElement(By.cssSelector(Constant.Cashier_lastFourDigitNumber)).isDisplayed();
	}

	public boolean isCashierCVVInputfieldPresent() {
		this.switchFrameTo("ThirdPartyPage");
		return driver.findElement(By.cssSelector(Constant.Cashier_CardCVVTextbox)).isDisplayed();

	}

	public boolean isCashierPromocodeInputFieldPresent() {
		this.switchFrameTo("ThirdPartyPage");
		return driver.findElement(By.cssSelector(Constant.Cashier_promocodeTextbox)).isDisplayed();
	}

	public boolean isCashierChangeBillingAddCheckboxPresent() {
		this.switchFrameTo("ThirdPartyPage");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.user_details")));
		return driver.findElement(By.cssSelector(Constant.Cashier_ChangeBillingAddresCheckbox)).isDisplayed();

	}

	public void isCashierAmountTextPresent() {

	}

	public boolean isCashierOtherAmountInputfieldPresent() {
		this.switchFrameTo("ThirdPartyPage");
		return driver.findElement(By.cssSelector(Constant.Cashier_EnterAmountInputField)).isDisplayed();

	}

	public boolean isCashierDepositButtonPresent() {
		this.switchFrameTo("ThirdPartyPage");
		return driver.findElement(By.cssSelector(Constant.Cashier_DepositButton)).isDisplayed();

	}

	public double getCurrentBalance() {
		this.switchFrameTo("icashier");
		String bal = driver.findElement(By.cssSelector(Constant.Cashier_BalanceFigure)).getText();
		// System.out.println(bal);
		String Balance = bal.replace(",", "").substring(1);
		// System.out.println(bal);

		// convert the current to in
		// String NewCurr=Double.toString(CurrentBalance);
		CurrentBalance = Double.parseDouble(Balance);
		// CurrentBalance = Float.valueOf(Balance);
		System.out.println(CurrentBalance);
		return CurrentBalance;

	}

	/**
	 * Conditon for frame switch
	 * 
	 * @param frameName
	 */
	private void switchFrameTo(String frameId) {

		if (this.currentFrameId != frameId) {

			if (this.currentFrameId == "") {
				driver.switchTo().defaultContent();
				driver.switchTo().frame("cashier-iframe");
				 this.currentFrameId = "cashier-iframe";
				
				
			}

			switch (frameId) {

			case "icashier":
				driver.switchTo().defaultContent().switchTo().frame("cashier-iframe").switchTo().frame("icashier");
				this.currentFrameId = "icashier";
				break;
			

			case "ThirdPartyPage":
				driver.switchTo().defaultContent().switchTo().frame("cashier-iframe").switchTo().frame("icashier")
						.switchTo().frame("ThirdPartyPage");
				this.currentFrameId = "ThirdPartyPage";
				break;

			}
		}
	}

	// Verying if SafeCharge logo is displayed within the Cashier
	public boolean isCashierSafeChargeLogoPresent() {
		this.switchFrameTo("ThirdPartyPage");
		return driver.findElement(By.cssSelector(Constant.SafeCharge_Logo)).isDisplayed();

	}

	public void isCashierfooterSuperCasinoTextPresent() {

	}

	public void isCashierCardNumberInputFieldPresent() {

	}

	public void isCashierMonthExpiryInputFieldPresent() {

	}

	public void isCashierYearExpiryInputFieldPresent() {

	}

	// Functtion for Cashier deposit approve Pop-up box
	public boolean isApporvedDepositTextPresent() {
		this.switchFrameTo("ThirdPartyPage");
		return driver.findElement(By.cssSelector(Constant.Cashier_DepositApporovedText)).isDisplayed();

	}

	public boolean isApprovedDepositHeaderPopBoxPresent() {
		this.switchFrameTo("ThirdPartyPage");
		WebDriverWait wait = new WebDriverWait(driver,65);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.blockOverlay")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.lightbox-header h2")));
		return driver.findElement(By.cssSelector(Constant.Cashier_SuccessDepositPop_upBox)).isDisplayed();
	}

	public boolean isApprovedDepositCloseButtonPopUpBoxPresent() {
		this.switchFrameTo("ThirdPartyPage");
		return driver.findElement(By.cssSelector(Constant.Cashier_SuccessDepositPop_boxCloseButton)).isDisplayed();

	}

	public void sendCashierCardNumber(String cardNumber) {
		this.switchFrameTo("ThirdPartyPage");
		driver.findElement(By.cssSelector(Constant.Cashier_CardInputField)).sendKeys(cardNumber);
	}

	public void sendCashierMonthExpiryDate(String Month) {
		this.switchFrameTo("ThirdPartyPage");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.Cashier_cardExpiryDateMonth)));
		driver.findElement(By.cssSelector(Constant.Cashier_cardExpiryDateMonth)).click();
		String Xpath_Menu = Constant.Cashier_cardExpiryDateMonth_Select;
		//int ExpriyMonth= Integer.parseInt(Month);
		Xpath_Menu = Xpath_Menu.replace("{0}", String.valueOf(Month));
		WebElement clickDate=driver.findElement(By.xpath(Xpath_Menu));
		wait.until(ExpectedConditions.visibilityOf(clickDate));
		clickDate.click();
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();", clickDate);
		//driver.findElement(By.xpath(Xpath_Menu)).click();
	}

	public void sendCashierYearExpiryDate(String Year) {
		this.switchFrameTo("ThirdPartyPage");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.Cashier_cardExpiryDateYear)));
		driver.findElement(By.cssSelector(Constant.Cashier_cardExpiryDateYear)).sendKeys(Year);
//		String Xpath_Menu = Constant.Cashier_cardExpiryDateYear_Select;
//          int ExpiryYear= Integer.parseInt(Year);
//		Xpath_Menu = Xpath_Menu.replace("{0}", String.valueOf(ExpiryYear));
//		WebElement clickYear=driver.findElement(By.xpath(Xpath_Menu));
//		wait.until(ExpectedConditions.visibilityOf(clickYear));
//		clickYear.click();
		//driver.findElement(By.xpath(Xpath_Menu)).click();

	}

	public void sendCashierCVVNumber(String cvvNumber) {
		this.switchFrameTo("ThirdPartyPage");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.Cashier_CardCVVTextbox)));
		driver.findElement(By.cssSelector(Constant.Cashier_CardCVVTextbox)).sendKeys(cvvNumber);
	}

	public void sendCashierPromocodeInputField() {
		this.switchFrameTo("ThirdPartyPage");
		driver.findElement(By.cssSelector(Constant.Cashier_promocodeTextbox));

	}

	/*
	 * Input the amount to deposit in the Enter amount input box
	 * 
	 * @param {string} Amount- this is the Amount in value that user is willing
	 * to deposit
	 **/
	public void sendCashierEnterAmountInputField(String amount) {
		this.switchFrameTo("ThirdPartyPage");
		driver.findElement(By.cssSelector(Constant.Cashier_EnterAmountInputField)).clear();
		driver.findElement(By.cssSelector(Constant.Cashier_EnterAmountInputField)).sendKeys(amount);
	}

	public boolean isErrorCardInputTextPresent() {
		this.switchFrameTo("ThirdPartyPage");
		return driver.findElement(By.cssSelector(Constant.Cashier_CardInputtextErroMessage)).isDisplayed();

	}

	public boolean isInvalidExpDateError() {
		this.switchFrameTo("ThirdPartyPage");
		return driver.findElement(By.cssSelector(Constant.Cashier_cardExpiryErroText)).isDisplayed();
	}

	public boolean isCardCVVNumberErrorMessagePresent() {
		this.switchFrameTo("ThirdPartyPage");
		return driver.findElement(By.cssSelector(Constant.Cashier_cardCVVErrorText)).isDisplayed();

	}

	public boolean isEnterAmountToDepositErrorMessagePresent() {
		this.switchFrameTo("ThirdPartyPage");
		return driver.findElement(By.cssSelector(Constant.Cashier_EnterAmountInputFieldErroMessageText)).isDisplayed();
	}

	public boolean isGreenTickCardOwnerNamesPresent() {
		this.switchFrameTo("ThirdPartyPage");
		return driver.findElement(By.cssSelector(Constant.Cashier_CardOwnerNameInputGreenTick)).isDisplayed();

	}

	public boolean isGreenTickCardNumberPresent() {
		this.switchFrameTo("ThirdPartyPage");
		return driver.findElement(By.cssSelector(Constant.Cashier_CardNumberInputFieldGreenTick)).isDisplayed();
	}

	public boolean isGreenTickCardCVVNumberPresent() {
		return driver.findElement(By.cssSelector(Constant.Cashier_ExpirydateAndCvvInputFieldGreenTick)).isDisplayed();
	}

	public boolean isGreenTickPromoCodePresent() {
		this.switchFrameTo("ThirdPartyPage");
		return driver.findElement(By.cssSelector(Constant.Cashier_PromCodeInputFieldGreenTick)).isDisplayed();
	}

	public boolean isGreenTickEnterAmountPresent() {
		this.switchFrameTo("ThirdPartyPage");
		return driver.findElement(By.cssSelector(Constant.Cashier_EnterAmountInputFieldGreenTick)).isDisplayed();

	}

	public boolean isDeclinedDepositHeaderPopUpBoxPresent() {
		this.switchFrameTo("ThirdPartyPage");
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.blockOverlay")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.lightbox-header h2")));
		return driver.findElement(By.cssSelector(Constant.Cashier_DeclinedDepositPop_upBox)).isDisplayed();
	}

	public boolean isYourTransactionHasBeenDeclineTextPresent() {
		this.switchFrameTo("ThirdPartyPage");
		return driver.findElement(By.cssSelector(Constant.Cashier_DeclineDepositTransactionText)).isDisplayed();
	}

	public boolean isDeclinedDepositContactSurpotNumberPresent() {
		this.switchFrameTo("ThirdPartyPage");
		return driver.findElement(By.xpath(Constant.Cashier_DeclinedDepositConatctSuportNumber)).isDisplayed();
	}

	public boolean isDeclinedDepositCloseIconPresent() {
		this.switchFrameTo("ThirdPartyPage");
		return driver.findElement(By.cssSelector(Constant.Cashier_DeclineDepositCloseIcon)).isDisplayed();
	}

	public String getNewBillingAddresss() {
		String Text1 = driver.findElement(By.cssSelector(Constant.Cashier_NewBillinaddresText)).getText();
		System.out.println(Text1);
		return Text1;
	}

	public boolean isWitdrawPendingNotificationPresent() {
		this.switchFrameTo("ThirdPartyPage");
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.blockOverlay")));
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span.modal_close.on_cancel")));
		System.out.println(driver.findElement(By.cssSelector(Constant.Cashier_DeclineDepositCloseIcon)).isDisplayed());
		return driver.findElement(By.cssSelector(Constant.Cashier_WithdrawPendingNotification_PopupBox)).isDisplayed();

	}

	public void sendCashierChangeBillingAddressCountryInput(String country) {

	}

	public void sendCashierChangeBillingAddressCityInput(String city) {

	}

	public void sendCashierChangeBillingAddressPostCodeInput(String postcode) {
		this.switchFrameTo("ThirdPartyPage");
		// driver.findElement(By.cssSelector(Constant.Cashier_ChangeBillingAddressPostCodeInputField)).clear();
		driver.findElement(By.cssSelector(Constant.Cashier_ChangeBillingAddressPostCodeInputField)).sendKeys(postcode);

	}

	public void sendCashierChangeBillingAddressNumberInput(String AddressNum) {
		this.switchFrameTo("ThirdPartyPage");
		// driver.findElement(By.cssSelector(Constant.Cashier_ChangeBillingAddressHouseNumber)).clear();
		driver.findElement(By.cssSelector(Constant.Cashier_ChangeBillingAddressHouseNumber)).sendKeys(AddressNum);

	}

	public void clickCashierDepositButton() {
		this.switchFrameTo("ThirdPartyPage");
		driver.findElement(By.cssSelector(Constant.Cashier_DepositButton)).click();
		// WebDriverWait wait = new WebDriverWait(driver,45);
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#continueButton")));
	}

	public void clickSuccessCloseApprovedButton() {
		this.switchFrameTo("ThirdPartyPage");
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.modal_close.btn.on_confirm")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.blockOverlay")));
		WebElement chromeclick = driver.findElement(By.cssSelector("button.modal_close.btn.on_confirm"));
		chromeclick.click();

	}

	// Click on Declined close Icon on the Decline pop-up
	public void clickDeclinedCloseIcon() {
		this.switchFrameTo("ThirdPartyPage");
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.blockOverlay")));
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span.modal_close.on_cancel")));
		System.out.println(driver.findElement(By.cssSelector(Constant.Cashier_DeclineDepositCloseIcon)).isDisplayed());
		driver.findElement(By.cssSelector(Constant.Cashier_DeclineDepositCloseIcon)).click();

	}

	public void clickRegisterNewCreditCard() {
		this.switchFrameTo("ThirdPartyPage");
		driver.findElement(By.cssSelector(Constant.Cashier_RegisterNewCardLogo)).click();
	}

	public void clickCashierChangeBillAddresCheckBox() {
		this.switchFrameTo("ThirdPartyPage");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("label[for='user_details'] span")));
		driver.findElement(By.cssSelector(Constant.Cashier_ChangeBillingAddresCheckbox)).click();
	}

	public void clickChashierCloseIcon() {
		this.switchFrameTo("cashier-iframe");
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector(Constant.Cashier_closeIcon)).click();

	}

	public void clickCashierDepositTablink() {
		this.switchFrameTo("icashier");
		driver.findElement(By.cssSelector(Constant.Cashier_DepositTab)).click();
	}

}