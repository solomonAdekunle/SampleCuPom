package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Util.Constant;

public class PrivacyPolicy extends BasePage {

	public PrivacyPolicy(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public boolean isPrivacyPolicyTitlePagePresent() {
		return driver.findElement(By.cssSelector(Constant.PrivacyPolicy_TitlePage)).isDisplayed();
	}

}
