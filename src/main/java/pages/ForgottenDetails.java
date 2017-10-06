package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.ForgottenDetails_DOBYEAR)));
		driver.findElement(By.cssSelector(Constant.ForgottenDetails_DOBYEAR)).click();
		String Xpath_Menu = Constant.ForgottenDetails_DOBYEAR_Select;
		int Year = Integer.parseInt(year);
		Xpath_Menu = Xpath_Menu.replace("{0}", String.valueOf(Year));
		driver.findElement(By.xpath(Xpath_Menu)).click();
	}

	public void sendResetNewPassword(String newpassword) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.Reset_NewPassword)));
		driver.findElement(By.cssSelector(Constant.Reset_NewPassword)).sendKeys(newpassword);

	}

	public void sendResetConfPassword(String confirmPassword) {
		driver.findElement(By.cssSelector(Constant.Resset_ConfirmPassword)).sendKeys(confirmPassword);
	}

	public void clickForgottenSubmitButton() throws InterruptedException {
		WebElement ForgottenDetailsButton = driver.findElement(By.cssSelector(Constant.ForgottenDetails_Submit));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ForgottenDetailsButton);
		

	}

	public void clickResetSubmitButton() {
		driver.findElement(By.cssSelector(Constant.Reset_Submit)).click();
	}

	public boolean YourPasswordSuccessfyllyChange() {
		String Title = driver.findElement(By.cssSelector(Constant.TitlePage)).getText();
		//System.out.println(Title);
		if (Title.equalsIgnoreCase("YOUR PERSONAL DETAILS HAVE BEEN SUCCESSFULLY UPDATED")) {
			return true;

		} else {

			return false;
		}
	}

	public boolean isErrorMessageTextPresent() {
		return driver.findElement(By.cssSelector(Constant.ForgottenDetails_ErrorText)).isDisplayed();
	}

	public boolean isTitlePresent() {
		return driver.findElement(By.cssSelector(Constant.TitlePage)).isDisplayed();
	}
}
