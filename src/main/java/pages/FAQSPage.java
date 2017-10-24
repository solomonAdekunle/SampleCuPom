package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Util.Constant;

public class FAQSPage extends BasePage {

	public FAQSPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/* Check if FAQS is displayed as a title on FAQS Page */
	public boolean isFaqsTitlePagePresent() {
		return driver.findElement(By.cssSelector(Constant.FAQS_TitlePage)).isDisplayed();
	}

}
