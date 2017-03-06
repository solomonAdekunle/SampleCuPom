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
	
	public void clickDepositWelcomeButton(){
		WebDriverWait wait= new WebDriverWait(driver,25);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(Constant.Welcome_DepositButton)));
		driver.findElement(By.cssSelector(Constant.Welcome_DepositButton)).click();
	}

}
