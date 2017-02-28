package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Util.Constant;

public class AboutUsPage extends BasePage{

	public AboutUsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public boolean isAboutSupercasionTitlePagePresent() {
		return driver.findElement(By.cssSelector(Constant.AboutUs_TitlePage)).isDisplayed();
	}

	
	
}
