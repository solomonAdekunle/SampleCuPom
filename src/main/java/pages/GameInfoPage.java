package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.Constant;

public class GameInfoPage extends BasePage {

	public GameInfoPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean isGameInfoPageGameNamePresent(){
	return	driver.findElement(By.cssSelector(Constant.TitlePage)).isDisplayed();
				
	}
	
	public boolean isGameInfoPageGameDetailsPresent(){
		return	driver.findElement(By.cssSelector(Constant.GamesDetails)).isDisplayed();
					
		}
	public boolean isGameInfoPageGameDeviceImagePresent(){
		return	driver.findElement(By.cssSelector(Constant.GamesInfoGameDeviceImg)).isDisplayed();
					
		}
	
	public boolean isGameInfoPageGameAirStatusPresent(){
		return	driver.findElement(By.cssSelector(Constant.GameInfoPageAirStatus)).isDisplayed();
					
		}
	
	public boolean isGameInfoPageGameBannerPresent(){
		return	driver.findElement(By.cssSelector(Constant.GameInfoGameBanner)).isDisplayed();
					
		}
	
	public boolean isGameInfoPageGamePlayForRealButtonPresent(){
		return	driver.findElement(By.cssSelector(Constant.GameInfoPagePlayForReal)).isDisplayed();
					
		}
	public boolean isGameInfoPageGamePlayForFunButtonPresent(){
		return	driver.findElement(By.cssSelector(Constant.GameInfoPagePlayForFun)).isDisplayed();
					
		}
	public boolean isGameInfoPageGameJackpotSliderPresent(){
		return	driver.findElement(By.cssSelector(Constant.GameInfoPageJackpotSlider)).isDisplayed();
					
		}
	public boolean isGameInfoPageGameWinnersSliderPresent(){
		return	driver.findElement(By.cssSelector(Constant.GameInfoPageWinnersSlider)).isDisplayed();
					
		}
	public boolean isGameInfoPageGameAppleLogoPresent(){
		return	driver.findElement(By.cssSelector(Constant.GameInfoPageAppLogo)).isDisplayed();
					
		}
	public boolean isGameInfoPageGameAndroidLogoPresent(){
		return	driver.findElement(By.cssSelector(Constant.GameInfoPageAndroidLogo)).isDisplayed();
					
		}
	public boolean isGameInfoPageLoginPopBoxPresent(){
		WebDriverWait wait= new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.LoginPopUpBox)));
		return	driver.findElement(By.cssSelector(Constant.LoginPopUpBox)).isDisplayed();
					
		}
     
	
	
	
	   public void clickGameInfoGamePlayForRealButton(){
		   WebDriverWait wait= new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.GameInfoPagePlayForReal)));
			WebElement PlayForReal=driver.findElement(By.cssSelector(Constant.GameInfoPagePlayForReal));
			wait.until(ExpectedConditions.visibilityOf(PlayForReal));
			Actions move= new Actions(driver);
			move.moveToElement(PlayForReal).click().build().perform();
			//JavascriptExecutor executor = (JavascriptExecutor)driver;
			//executor.executeScript("arguments[0].click();", PlayForReal);
			//((JavascriptExecutor) driver).executeScript("arguments[0].click();", PlayForReal);
			
			
		 // driver.findElement(By.cssSelector(Constant.GameInfoPagePlayForReal)).click();
		   
	   }
	   public void clickGameInfoGamePlayForFunButton(){
			  driver.findElement(By.cssSelector(Constant.GameInfoPagePlayForFun)).click();
			   
		   }
	
	
	
}
