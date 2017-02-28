package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Util.Constant;

public class VIPPage extends BasePage {

	public VIPPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public boolean isVIPLogoPresent() {
		return driver.findElement(By.cssSelector(Constant.Vip_Logo)).isDisplayed();
	}

	public boolean isVIPRedBadgePresent() {
		return driver.findElement(By.cssSelector(Constant.Vip_RedTable)).isDisplayed();
	}

	public boolean isVIPBronzeBadgePresent() {
		return driver.findElement(By.cssSelector(Constant.Vip_BronzeTable)).isDisplayed();
	}

	public boolean isVIPSliverBadgePresent() {
		return driver.findElement(By.cssSelector(Constant.Vip_SliverTable)).isDisplayed();
	}

	public boolean isVIPGoldBadgePresent() {
		return driver.findElement(By.cssSelector(Constant.Vip_GoldTable)).isDisplayed();
	}

	public boolean isVIPPlatinumBadgePresent() {
		return driver.findElement(By.cssSelector(Constant.Vip_platinumTable)).isDisplayed();
	}
}
