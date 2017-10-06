package pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.Constant;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void get(String baseURL) {
		this.driver.get(baseURL + "/");
	}

	
	
	public boolean isCasinoGameSearchReturnPresent(){
		WebElement SearchRolutteGame=driver.findElement(By.cssSelector(Constant.SearchGameReturnRoulette));
		WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.SearchGameReturnRoulette)));
		System.out.println(SearchRolutteGame.isDisplayed());
		driver.findElement(By.cssSelector(Constant.SearchGameReturnRoulette));
		return SearchRolutteGame.isDisplayed();
		//return driver.findElement(By.cssSelector(Constant.SearchGameReturnRoulette)).isDisplayed();
		
		
	}
	
	
	public boolean isVegasGameSearchReturnPresent(){
		WebDriverWait wait = new WebDriverWait(driver,90);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.SearchGameVirtureFusionReturn)));
		System.out.println(driver.findElement(By.cssSelector(Constant.SearchGameVirtureFusionReturn)).isDisplayed());
		driver.findElement(By.cssSelector(Constant.SearchGameVirtureFusionReturn));
		return driver.findElement(By.cssSelector(Constant.SearchGameVirtureFusionReturn)).isDisplayed();
	}
	
	
	public String getUserName() {
		WebDriverWait wait= new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#account_box .username")));
		return driver.findElement(By.cssSelector("div#account_box .username")).getText();
	}

	
	
	
	
	public void sendSearchGames(String gameSearchType) {
		WebDriverWait wait = new WebDriverWait(driver,35);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.SearchGameInputbox)));
    driver.findElement(By.cssSelector(Constant.SearchGameInputbox)).sendKeys(gameSearchType);

	}
	public void enterSearchGames() {
	    driver.findElement(By.cssSelector(Constant.SearchGameInputbox)).sendKeys(Keys.ENTER);

		}
	public void clickHeroBanner() {

	}

	public void clickJackPotBlock() {

	}

	public void clickWinnerBlock() {

	}

	public void clickFeaturedGames() {

	}

	public void clickSlotsGames() {

	}

	public void clickRouletteGames() throws InterruptedException {
		List<WebElement> gameBox = driver.findElements(By.cssSelector("div.netplay-games"));
		System.out.println(gameBox.size());
		WebElement RouletteExpressPremiumPlayForReal = gameBox.get(3);
		RouletteExpressPremiumPlayForReal.click();
		Thread.sleep(2000);
		Set<String> Windowids = driver.getWindowHandles();
		Iterator<String> it = Windowids.iterator();
		String MainWindowids = it.next();
		String tabbedWindowId = it.next();
		System.out.println(MainWindowids);
		System.out.println(tabbedWindowId);
		while (it.hasNext())
			;
		Thread.sleep(3000L);
		driver.switchTo().window(tabbedWindowId);

	}
	
	
	
	public void clickRouletteGameGameInfoButton(){
		driver.findElement(By.cssSelector(Constant.RepGameInfoButton)).click();
	}
	
	public void clickPlaytechGameInfoButton(){
		List<WebElement> gameInfoButtons = driver.findElements(By.cssSelector(Constant.PlaytechGameInfoButton));
		WebElement GameInfoIcon = gameInfoButtons.get(2);
		GameInfoIcon.click();
		
	}
	
	
	
	

	public void clickBlackJackGames() {

	}

	public void clickJackPotsGames() {

	}

	public void clickLives() {

	}

	public void clickAllGames() {

	}
}
// get the Url address
