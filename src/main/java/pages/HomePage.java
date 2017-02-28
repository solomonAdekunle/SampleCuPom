package pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Connector.WebConnector;
import Util.Constant;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void get(String baseURL) {
		this.driver.get(baseURL + "/");
	}
	
	public void sendSearchGames() {

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
		WebElement RouletteExpressPremiumPlayForReal = gameBox.get(0);
		RouletteExpressPremiumPlayForReal.click();
		Thread.sleep(2000);
		Set<String> Windowids = driver.getWindowHandles();
		Iterator<String> it = Windowids.iterator();
		String MainWindowids = it.next();
		String tabbedWindowId = it.next();
		System.out.println(MainWindowids);
		System.out.println(tabbedWindowId);
		while(it.hasNext());
			Thread.sleep(3000L);
			driver.switchTo().window(tabbedWindowId);

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
