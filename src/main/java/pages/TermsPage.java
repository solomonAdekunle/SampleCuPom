package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Util.Constant;

public class TermsPage extends BasePage {

	public TermsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public boolean isTermsAndConditionsTitlePagePresent() {
		return driver.findElement(By.cssSelector(Constant.Terms_TitlePage)).isDisplayed();
	}

}
