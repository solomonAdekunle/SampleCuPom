package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Util.Constant;

public class ContactUsPage extends BasePage {

	public ContactUsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void Url() {
		driver.get("https://vegas.supercasino.com/contact-us");

	}

	public boolean isContactUsTitlePagePresent() {
		return driver.findElement(By.cssSelector(Constant.ChangePassword_titlePage)).isDisplayed();
	}

	public boolean isCustomerCareLinkPresent() {
		return driver.findElement(By.cssSelector(Constant.ContactUs_CustomerCareLink)).isDisplayed();

	}

	public boolean isForgotYourPasswordLinkPresent() {
		return driver.findElement(By.cssSelector(Constant.ContactUs_ForgottenPasswordlink)).isDisplayed();

	}

	public boolean isUKContactNumberPresent() {
		return driver.findElement(By.cssSelector(Constant.ContactUs_UkNumber)).isDisplayed();

	}

	public void clickContactUsForgottenDetailsLink() {
		driver.findElement(By.cssSelector(Constant.ContactUs_ForgottenPasswordlink)).click();
	}
}