package com.suite.Cashier;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.Constant;
import pages.BasePage;

public class DepositPage extends BasePage {

	private String currentFrameId = "";

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

	public void isCashierBalancePresent() {

	}

	public boolean isCashierMyAccountTabPresent() {
		// driver.switchTo().frame("cashier-iframe");
		this.switchFrameTo("icashier");
		return driver.findElement(By.cssSelector(Constant.Cashier_MyAccountTab)).isDisplayed();
	}

	public boolean isCashierDepositTabPresent() {
		// driver.switchTo().frame("cashier-iframe");
		this.switchFrameTo("icashier");
		return driver.findElement(By.cssSelector(Constant.Cashier_DepositTab)).isDisplayed();

	}

	public boolean isCashierWithdrawTabPresent() {
		// driver.switchTo().frame("cashier-iframe");
		this.switchFrameTo("icashier");
		return driver.findElement(By.cssSelector(Constant.Cashier_WithrawTab)).isDisplayed();
	}

	public boolean isCashierMyPaymentMethodTextPresent() {
		this.switchFrameTo("ThirdPartyPage");
		return driver.findElement(By.cssSelector(Constant.Cashier_MyPaymentMethodtext)).isDisplayed();

	}

	public boolean isCashierPaymentDetailsTextPresent() {
		this.switchFrameTo("ThirdPartyPage");
		return driver.findElement(By.cssSelector(Constant.Cashier_MyPaymentMethodtext)).isDisplayed();

	}

	public boolean isCashierMyPaymentLogoPresent() {
		this.switchFrameTo("ThirdPartyPage");
		return driver.findElement(By.cssSelector(Constant.Cashier_MyPaymentMthodLogo)).isDisplayed();

	}

	public boolean isCashierOtherPaymentMethodLogo() {
		this.switchFrameTo("ThirdPartyPage");
		return driver.findElement(By.cssSelector(Constant.Cashier_MyOtherPaymentMethodPayPal_logo)).isDisplayed();

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

	public void sendCashierCardNumber(String cardNumber) {
		this.switchFrameTo("ThirdPartyPage");
		driver.findElement(By.cssSelector(Constant.Cashier_CardInputField)).sendKeys(cardNumber);
	}

	public void sendCashierMonthExpiryDate(String Month) {
		this.switchFrameTo("ThirdPartyPage");
		driver.findElement(By.cssSelector(Constant.Cashier_cardExpiryDateMonth)).sendKeys(Month);

	}

	public void sendCashierYearExpiryDate(String Year) {
		this.switchFrameTo("ThirdPartyPage");
		driver.findElement(By.cssSelector(Constant.Cashier_cardExpiryDateYear)).sendKeys(Year);

	}

	public void sendCashierCVVNumber(String cvvNumber) {
		this.switchFrameTo("ThirdPartyPage");
		driver.findElement(By.cssSelector(Constant.Cashier_CardCVVTextbox)).sendKeys(cvvNumber);
	}

	public void sendCashierPromocodeInputField() {
		this.switchFrameTo("ThirdPartyPage");
		driver.findElement(By.cssSelector(Constant.Cashier_promocodeTextbox));

	}

	public void sendCashierChangeBillingAddressCountryInput(String country) {

	}

	public void sendCashierChangeBillingAddressCityInput(String city) {

	}

	public void sendCashierChangeBillingAddressPostCodeInput(String postcode) {

	}

	public void sendCashierChangeBillingAddressNumberInput(String AddressNum) {

	}

	public boolean isErrorCardInputTextPresent(boolean expectedResult) {
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

	public void clickCashierDepositButton() {
		this.switchFrameTo("ThirdPartyPage");
		driver.findElement(By.cssSelector(Constant.Cashier_DepositButton)).click();
	}

}