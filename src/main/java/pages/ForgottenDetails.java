package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Util.Constant;

public class ForgottenDetails extends BasePage {

	public ForgottenDetails(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void get(String baseUrl) {
		driver.get(baseUrl + "/forgotten-details");
	}

	public void sendForgottenUsername(String username) {
		driver.findElement(By.cssSelector(Constant.ForgottenDetails_UserName)).sendKeys(username);
	}

	public void sendForgottenEmail(String Email) {
		driver.findElement(By.cssSelector(Constant.ForgottenDetails_Email)).sendKeys(Email);

	}

	public void sendForgottenDOBDay(String day) {
		driver.findElement(By.cssSelector(Constant.ForgottenDetails_DOBDay)).sendKeys(day);
	}

	public void sendForgottenMonth(String month) {
		driver.findElement(By.cssSelector(Constant.ForgottenDetails_DOBMonth)).sendKeys(month);

	}

	public void sendForgottenYear(String year) {
		driver.findElement(By.cssSelector(Constant.ForgottenDetails_DOBYEAR)).sendKeys(year);
	}

	public void clickForgottenSubmitButton() {
		driver.findElement(By.cssSelector(Constant.ForgottenDetails_Submit)).click();
	}

	public void sendResetNewPassword(String newpassword) {
		driver.findElement(By.cssSelector(Constant.Reset_NewPassword)).sendKeys(newpassword);
	}

	public void sendResetConfPassword(String confirmPassword) {
		driver.findElement(By.cssSelector(Constant.Resset_ConfirmPassword)).sendKeys(confirmPassword);
	}

	public void clickResetSubmitButton() {
		driver.findElement(By.cssSelector(Constant.Reset_Submit)).click();
	}

	public boolean isTitlePresent() {
		return driver.findElement(By.cssSelector(Constant.TitlePage)).isDisplayed();
	}
}
