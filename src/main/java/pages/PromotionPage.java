package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Constant;

public class PromotionPage extends BasePage {

	public PromotionPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void get(String baseURL) {
		driver.get(baseURL + "/promotions");
	}

	public boolean isPromMoreInfoButtonPresent() {
		List<WebElement> InfoButton = driver.findElements(By.cssSelector(Constant.PromoMoreInfo_Buttons));
		WebElement Button = InfoButton.get(0);
		return Button.isDisplayed();
	}

	public boolean isJoinToPlayButtonPresent() {
		List<WebElement> JoinNowButtons = driver.findElements(By.cssSelector(Constant.PromoJoinToPlay_Button));
		for(int i=0; i<JoinNowButtons.size(); i++){
			System.out.println(i);
			WebElement RegisterNowButton=JoinNowButtons.get(i);
		   RegisterNowButton.isDisplayed();
				
		}
		return false;
	}

	public boolean isPromoSubMenu() {
		return driver.findElement(By.cssSelector(Constant.PromotionSubMenu_Tablink)).isDisplayed();

	}

	public boolean isCompetitionSubMenuTabPresent() {
		return driver.findElement(By.cssSelector(Constant.CompetitionsSubMenu_Tablink)).isDisplayed();

	}

	public boolean PromotionBannerTitlePagePresent() throws InterruptedException {
//		WebElement promo = driver.findElement(By.cssSelector("div.view-promotions .view-content"));
//		List<WebElement> Promlist = promo.findElements(By.cssSelector("div.promo-wrapper"));
//
//		System.out.println(Promlist.size());
//
//		for (int i = 0; i < Promlist.size(); i++) {
//
//		System.out.println(i);
//			// Repolulate the list of all the Elements on all the banner.
//			promo = driver.findElement(By.cssSelector("div.view-promotions .view-content"));
//			Promlist = promo.findElements(By.cssSelector("div.promo-wrapper"));
//			WebElement promotion = Promlist.get(i);
		this.clickEachPromoMoreInfoButton();

			// get promotion title
			
			String promotionTitle = driver.findElement(By.cssSelector(".promotion-title a")).getText();
			System.out.println(promotionTitle);
			Thread.sleep(200);
			String pagetitle = driver.findElement(By.cssSelector(Constant.TitlePage)).getText();
			Thread.sleep(200);
			System.out.println(pagetitle);
			if (pagetitle.equalsIgnoreCase(promotionTitle)) {
				System.out.println(true);

				Thread.sleep(1000);
				driver.navigate().back();
			} else {
				System.out.println(false);

			}
		
		// this.clickEachPromoMoreInfoButton();
		return false;

	}

	public void clickEachPromoMoreInfoButton() throws InterruptedException {
		WebElement promo = driver.findElement(By.cssSelector("div.view-promotions .view-content"));
		List<WebElement> Promlist = promo.findElements(By.cssSelector("div.promo-wrapper"));

		System.out.println(Promlist.size());

		for (int i = 0; i < Promlist.size(); i++) {

		promo = driver.findElement(By.cssSelector("div.view-promotions .view-content"));
		Promlist = promo.findElements(By.cssSelector("div.promo-wrapper"));
		WebElement promotion = Promlist.get(i);
			// //navigate
			WebElement Button1 = promotion.findElement(By.cssSelector("a.promo-more-info"));
			Button1.click();
			Thread.sleep(2000);
			// get page title
			
	}
	}
	public void clickPromoJoinToPlayButton() {
		List <WebElement> PlayButton=driver.findElements(By.cssSelector(Constant.PromoJoinToPlay_Button));
		WebElement promoJoin= PlayButton.get(1);
		promoJoin.click();
		
	}
}
