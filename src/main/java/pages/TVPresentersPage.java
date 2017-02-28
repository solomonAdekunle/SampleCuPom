package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Util.Constant;

public class TVPresentersPage extends BasePage {

	public TVPresentersPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public boolean isPresenterTitlePresent(){
	return	driver.findElement(By.cssSelector(Constant.Presenter_TitlePage)).isDisplayed();
	}
}
