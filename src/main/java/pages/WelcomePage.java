package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.Constant;

public class WelcomePage  extends BasePage{

	public WelcomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean getWelComePageTilte(){
		WebDriverWait wait= new WebDriverWait(driver,35);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.Welcome_DepositButton)));
		return driver.findElement(By.cssSelector("h1.welcome_header")).isDisplayed();
		
	}
	
	
	
	
	
	
	
	
	
	public void clickDepositWelcomeButton(){
		WebDriverWait wait= new WebDriverWait(driver,35);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(Constant.Welcome_DepositButton)));
		driver.findElement(By.cssSelector(Constant.Welcome_DepositButton)).click();
	}

}
