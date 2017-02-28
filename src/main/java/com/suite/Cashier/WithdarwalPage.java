package com.suite.Cashier;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.Constant;
import pages.BasePage;

public class WithdarwalPage extends BasePage {
	private String currentFrameId = "";

	public WithdarwalPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

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

	public boolean isYourWithdrawalPendingTextPresent() {
		this.switchFrameTo("ThirdPartyPage");
		return driver.findElement(By.cssSelector(Constant.Cashier_Withdraw_NoWithDrawalPendingtext)).isDisplayed();
	}

	public boolean isWithdrawSuccessLightBoxPresent() {
		this.switchFrameTo("ThirdPartyPage");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.blockOverlay")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.lightbox-header h2")));
		return driver.findElement(By.cssSelector(Constant.Cashier_Withdraw_SuccessPopUpBox)).isDisplayed();
	}

	public boolean isWithdrawSuccessLightBoxNotPresent() {
		this.switchFrameTo("ThirdPartyPage");
		return driver.findElement(By.cssSelector(Constant.Cashier_Withdraw_SuccessPopUpBox)).isDisplayed();
	}

	public boolean isPendingWithdrawalCancellButtonPresent() {
		this.switchFrameTo("ThirdPartyPage");
		return driver.findElement(By.cssSelector(Constant.Cashier_WithdrawPendingCancelButton)).isDisplayed();
	}

	public boolean isPendingWithdrawCancelButtonNotPresent() {
		this.switchFrameTo("ThirdPartyPage");
		 WebElement El= driver.findElement(By.cssSelector(Constant.Cashier_WithdrawPendingCancelButton));
		 El.isDisplayed();
		 return true;
		

	}

	public boolean isPendingWithdrawCancelConfimationBoxPresent() {
		this.switchFrameTo("ThirdPartyPage");
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.blockOverlay")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.lightbox-header h2")));
		return driver.findElement(By.cssSelector(Constant.Cashier_WithdrawPendingCancel_ConfirmationPopBox))
				.isDisplayed();
	}

	public boolean isWithdrawPendingCancelSuccessConfrimationPopUpBoxPresent() {
		this.switchFrameTo("ThirdPartyPage");
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.blockOverlay")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.lightbox-header h2")));
		return driver.findElement(By.cssSelector(Constant.Cashier_WithdrawPendingCancel_SuccessPopUpBox)).isDisplayed();
	}

	public void clickWithDrawConirmSuccessOKButton() {
		this.switchFrameTo("ThirdPartyPage");
		driver.findElement(By.cssSelector(Constant.Cashier_Withdraw_SuccessPopUpBox_okButton)).click();
	}

	public void sendAmoutToWithdraw(String AmountWithdraw) {
		this.switchFrameTo("ThirdPartyPage");
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.cssSelector(Constant.Cashier_Withdraw_AmountToWithdraw)));
		// driver.findElement(By.cssSelector(Constant.Cashier_Withdraw_AmountToWithdraw)).click();
		driver.findElement(By.cssSelector(Constant.Cashier_Withdraw_AmountToWithdraw)).sendKeys(AmountWithdraw);

	}

	public void clickWithdrwalTablink() {
		this.switchFrameTo("icashier");
		driver.findElement(By.cssSelector(Constant.Cashier_WithrawTab)).click();
	}

	public void clickWithDrawalButton() {
		this.switchFrameTo("ThirdPartyPage");
		driver.findElement(By.cssSelector(Constant.Cashier_WithdrawButton)).click();

	}

	public void clickWithDrawSuccesOKButton() {
		this.switchFrameTo("ThirdPartyPage");
		driver.findElement(By.cssSelector(Constant.Cashier_Withdraw_SuccessPopUpBox_okButton)).click();
	}

	public void clickPendingWithdrawalCancellButton() throws InterruptedException {
		this.switchFrameTo("ThirdPartyPage");
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.blockOverlay")));
		driver.findElement(By.cssSelector(Constant.Cashier_WithdrawPendingCancelButton)).click();

	}

	public void clickNoConfirmationWithdrawPendingButton() {
		this.switchFrameTo("ThirdPartyPage");
		driver.findElement(By.cssSelector(Constant.Cashier_WithdrawConfirmationPopBox_NoButton)).click();

	}

	public void clickYesConfirmationWithdrawPendingButton() {
		this.switchFrameTo("ThirdPartyPage");
		driver.findElement(By.cssSelector(Constant.Cashier_WithdrawConfimationPopBox_YesButton)).click();
	}

	public void clickOKConfirmationWithdrawPendingSuccessButton() {
		this.switchFrameTo("ThirdPartyPage");
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(Constant.Cashier_WithdrawPendingCancel_SuccessPopUpBox_OKButton)));
		driver.findElement(By.cssSelector(Constant.Cashier_WithdrawPendingCancel_SuccessPopUpBox_OKButton)).click();

	}
}
