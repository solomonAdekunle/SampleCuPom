package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Util.Constant;

public class ResposibleGamblingPage extends BasePage{

	public ResposibleGamblingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public boolean isResponsibleGamblingTitlePagePresent() {
		return driver.findElement(By.cssSelector(Constant.ResponsibleGambling_TitlePage)).isDisplayed();
	}

}
