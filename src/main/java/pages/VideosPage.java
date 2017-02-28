package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Util.Constant;

public class VideosPage extends BasePage{

	public VideosPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
	public boolean isAllVideoTabPresent(){
		return	driver.findElement(By.cssSelector(Constant.Videos_AllVideosSubTab)).isDisplayed();
		}
	
	
	public boolean isVideoTVAdvertTabPresent(){
		return	driver.findElement(By.cssSelector(Constant.Videos_TVAdvertsSubTab)).isDisplayed();
		}
	public boolean isVideoGamesReviewTabPresent(){
		return	driver.findElement(By.cssSelector(Constant.Videos_GamesReviewSubTab)).isDisplayed();
		}
}
