package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Constant;

public class ChangePassword extends BasePage {

	
	
	/* Initialised the webdriver */
	public ChangePassword(WebDriver driver) {
		super(driver);
		

	}
	/* Enter your Old Password word */
	public void sendChangePasswordOld(String oldpassword) {
		driver.findElement(By.cssSelector(Constant.ChangePassword_OldPassword)).sendKeys(oldpassword);
		System.out.println(oldpassword);
	}
	/* Enter your new Password */
	public void sendChangePasswordNewPassWord(String newpassword) {
		driver.findElement(By.cssSelector(Constant.ChangePassword_NewPassword)).sendKeys(newpassword);

	}
   /* Enter your Confirmed Password */
	public void sendChangePasswordConfirmPassWord(String ConfPassword) throws InterruptedException {
		driver.findElement(By.cssSelector(Constant.ChangePassword_ConfPassword)).sendKeys(ConfPassword);
		Thread.sleep(200);

	}
    /* Click Submit button */
	public void clickChangePasswordSubmitButton() {
		System.out.println("I Clicking the Submit button");
		driver.findElement(By.xpath(Constant.ChangePassword_SubmitButton)).click();
	}
   /* Check if Change Password is displayed as title Page */
	public boolean verifyChangePasswordTitlePageText() {
		String Text = driver.findElement(By.cssSelector(Constant.ChangePassword_titlePage)).getText();
		if (Text.equalsIgnoreCase("CHANGE PASSWORD"))
			return true;
		else {
			// System.out.println(true);
			return false;
		}
	}

	/* Check if Change Password input box is displayed on Change Password page */
	public boolean isChangePasswaordOldInputBoxPresent() {
		WebElement oldPasswordText = driver.findElement(By.cssSelector(Constant.ChangePassword_OldPassword));
		System.out.println(oldPasswordText.isDisplayed());
		return oldPasswordText.isDisplayed();
	}
	/* Check if  New Password input box is displayed on Change Password page */
	public boolean isNewPasswordInputBoxPresent() {
		return driver.findElement(By.cssSelector(Constant.ChangePassword_NewPassword)).isDisplayed();
	}
	/* Check if Change Password input box is displayed on Change Password page */
	public boolean isConfirmPasswordInputBoxPresent() {
		return driver.findElement(By.cssSelector(Constant.ChangePassword_ConfPassword)).isDisplayed();
	}
	/* Check if Submit button is displayed on Change Password page */
	public boolean isSubmitChangePasswordButtonPresent() {

		return driver.findElement(By.xpath(Constant.ChangePassword_SubmitButton)).isDisplayed();

	}
	/* Check if Error Message is displayed on Change Password page */
	public boolean isErrorTextPresent() {
		return driver.findElement(By.cssSelector(Constant.ChangePassword_ErrorMessage)).isDisplayed();
	}
	/* Check if  User has Successfully change his/her password */
	public String isYourPasswordHasSuccessfullyChangeTextPresent() throws InterruptedException {

		String Var1 = driver.findElement(By.cssSelector(Constant.YourPasswordHasChangeSuccefully_titlePage)).getText();
		System.out.println(Var1);
		Assert.assertEquals(Var1, "YOUR PASSWORD HAS BEEN SUCCESSFULLY CHANGED");

		return Var1;

	}

}
