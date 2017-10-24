package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Util.Constant;

public class ContactUsPage extends BasePage {

	public ContactUsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/* Go to Vegas Vertcal Cont-us Page */
	public void Url() {
		driver.get("https://vegas.supercasino.com/contact-us");

	}

	/* Check if Contact-us is displayed as Title Page */
	public boolean isContactUsTitlePagePresent() {
		return driver.findElement(By.cssSelector(Constant.ChangePassword_titlePage)).isDisplayed();
	}

	/*
	 * Check if Customer care Link is Present within the content page on Contact
	 * us Page
	 */
	public boolean isCustomerCareLinkPresent() {
		return driver.findElement(By.cssSelector(Constant.ContactUs_CustomerCareLink)).isDisplayed();

	}

	/*
	 * Check if Forgotten Link is Present within the content page on Contact us
	 * Page
	 */
	public boolean isForgotYourPasswordLinkPresent() {
		return driver.findElement(By.cssSelector(Constant.ContactUs_ForgottenPasswordlink)).isDisplayed();

	}

	/*
	 * Check if Customer care Contact Number is Present within the content page
	 * on Contact us Page
	 */
	public boolean isUKContactNumberPresent() {
		return driver.findElement(By.cssSelector(Constant.ContactUs_UkNumber)).isDisplayed();

	}

	public void clickContactUsForgottenDetailsLink() {
		driver.findElement(By.cssSelector(Constant.ContactUs_ForgottenPasswordlink)).click();
	}
}