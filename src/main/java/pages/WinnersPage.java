package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Util.Constant;

public class WinnersPage extends BasePage {

	public WinnersPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
  
	
	public boolean isWinnersTitlePagePresent() {
		return driver.findElement(By.cssSelector(Constant.Winners_TitlePage)).isDisplayed();
	}

	public boolean isWinnersTablePagePresent() {
		return driver.findElement(By.cssSelector(Constant.Winners_Table)).isDisplayed();
	}
}
