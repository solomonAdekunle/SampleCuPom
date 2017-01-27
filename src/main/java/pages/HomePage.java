package pages;

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

	public void clickRouletteGames() {

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
