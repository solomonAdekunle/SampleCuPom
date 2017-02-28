package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Constant;

public class ChangePassword extends BasePage {

	public ChangePassword(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub

	}
			
	 public void sendChangePasswordOld(String oldpassword){
		 driver.findElement(By.cssSelector(Constant.ChangePassword_OldPassword)).sendKeys(oldpassword);
		 System.out.println(oldpassword);
	 }
	 public void sendChangePasswordNewPassWord(String newpassword){
		 driver.findElement(By.cssSelector(Constant.ChangePassword_NewPassword)).sendKeys(newpassword);
		 
	 }
	 public void sendChangePasswordConfirmPassWord(String ConfPassword) throws InterruptedException{
	 driver.findElement(By.cssSelector(Constant.ChangePassword_ConfPassword)).sendKeys(ConfPassword);
	 Thread.sleep(200);
		 
	 }
	 public void clickChangePasswordSubmitButton(){
		System.out.println("I Clicking the Submit button");
		driver.findElement(By.xpath(Constant.ChangePassword_SubmitButton)).click();
	 }
	 
	 
	 public boolean verifyChangePasswordTitlePageText() {
			String Text = driver.findElement(By.cssSelector(Constant.ChangePassword_titlePage)).getText();
			if (Text.equalsIgnoreCase("CHANGE PASSWORD"))
				return true;
			else {
				// System.out.println(true);
				return false;
			}
		}
	   // 
		public boolean isChangePasswaordOldInputBoxPresent() {
			WebElement oldPasswordText = driver.findElement(By.cssSelector(Constant.ChangePassword_OldPassword));
			System.out.println(oldPasswordText.isDisplayed());
			return oldPasswordText.isDisplayed();
		}

		public boolean isNewPasswordInputBoxPresent() {
			return driver.findElement(By.cssSelector(Constant.ChangePassword_NewPassword)).isDisplayed();
		}

		public boolean isConfirmPasswordInputBoxPresent() {
			return driver.findElement(By.cssSelector(Constant.ChangePassword_ConfPassword)).isDisplayed();
		}

		public boolean isSubmitChangePasswordButtonPresent() {
		
			return driver.findElement(By.xpath(Constant.ChangePassword_SubmitButton)).isDisplayed();
			
		}
		
		 public boolean isErrorTextPresent(){
			 return  driver.findElement(By.cssSelector(Constant.ChangePassword_ErrorMessage)).isDisplayed();
		 }
		public String isYourPasswordHasSuccessfullyChangeTextPresent() throws InterruptedException{
			
			Thread.sleep(2000l);
			String Var1=driver.findElement(By.cssSelector(Constant.YourPasswordHasChangeSuccefully_titlePage)).getText();
			System.out.println(Var1);
			Assert.assertEquals(Var1, "YOUR PASSWORD HAS BEEN SUCCESSFULLY CHANGED");
			
			return Var1;
				
			   
			
				
		}
		
}

