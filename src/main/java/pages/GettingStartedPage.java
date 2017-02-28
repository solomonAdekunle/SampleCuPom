package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.Constant;

public class GettingStartedPage extends BasePage {

	public GettingStartedPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public void get(String baseUrl) {
		driver.get(baseUrl + "/getting-started");
	}
	
	public boolean isGettingStratedTabPresent(){
	WebDriverWait wait= new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.GettingStarted_SubTab)));
		 return driver.findElement(By.cssSelector(Constant.GettingStarted_SubTab)).isDisplayed();
	}
	public boolean isHowToDepositTabPresent(){
		 return driver.findElement(By.cssSelector(Constant.GettingStarted_HowToDepositSubTab)).isDisplayed();
	}
	public boolean isHowToWithrawTabPresent(){
		 return driver.findElement(By.cssSelector(Constant.GettingStarted_HowToWithDrawSubTab)).isDisplayed();
	}
	public boolean isIsMyDepositSafeTabPresent(){
		 return driver.findElement(By.cssSelector(Constant.GettingStarted_IsMyDepositSafeSubTab)).isDisplayed();
	}
	public boolean isSecurityTabPresent(){
		 return driver.findElement(By.cssSelector(Constant.GettingStarted_SecuritySubTab)).isDisplayed();
	}
	public boolean isGettingStartedJackpotBlockSliderPresent(){
		 return driver.findElement(By.cssSelector(Constant.GettingStarted_JackpotBlockSlider)).isDisplayed();
	}
	
}
