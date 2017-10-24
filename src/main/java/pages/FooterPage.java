package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.Constant;

public class FooterPage extends BasePage {

	// Initialised the Webdriver
	public FooterPage(WebDriver driver) {
		super(driver);
	}

	/*
	 * Verified if Getting Started link is displayed on the Footer of each page
	 */
	public boolean isGettingStartedLinkPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_GettingStartedLink)).isDisplayed();

	}

	/* Verified if TV Presenter link is displayed on the footer of each page */
	public boolean isTVPresentLinkPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_TvPresenterLink)).isDisplayed();
	}

	/* Verified if Video link is displayed on the footer of each page */
	public boolean isVideoLinkPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_VideosLink)).isDisplayed();
	}

	/* Verified if VIP link is displayed on the footer of each page */
	public boolean isVIPLinkPresent() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.Footer_VIPLink)));
		return driver.findElement(By.cssSelector(Constant.Footer_VIPLink)).isDisplayed();

	}

	/* Verified if Winner link is displayed on the footer of each page */
	public boolean isWinnerLinkPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_WinnersLink)).isDisplayed();

	}

	/* Verified if About us link is displayed on the footer of each page */
	public boolean isAboutUsLinkPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_GettingStartedLink)).isDisplayed();

	}

	/* Verified if Contact-us link is displayed on the footer of each page */
	public boolean isContactUsLinkPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_ConTactUSLink)).isDisplayed();

	}

	/* Verified if Help and Faqs link is displayed on the footer of each page */
	public boolean isFAQSLinkPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_FAQSLink)).isDisplayed();

	}

	/*
	 * Verified if Privacy Policy link is displayed on the footer of each page
	 */
	public boolean isPrivacyPolicylinkPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_PrivacyPolicyLink)).isDisplayed();

	}

	/*
	 * Verified if Responsible Gambling link is displayed on the footer of each
	 * page
	 */
	public boolean isResponsibleGamblingLinkPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_ResponsibleGamblingLink)).isDisplayed();

	}

	/* Verified if Terms link is displayed on the footer of each page */
	public boolean isTermLinkPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_TermsLink)).isDisplayed();

	}

	/* Verified if PayPal Icon link is displayed on the footer of each page */
	public boolean isPayPalIconPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_PayPalIcon)).isDisplayed();

	}

	/* Verified if Visa Icon link is displayed on the footer of each page */
	public boolean isVisaIconPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_VisaIcon)).isDisplayed();

	}

	/*
	 * Verified if NetPlaytv Logo link is displayed on the footer of each page
	 */
	public boolean isNetPlayTvLogoPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_NetPlayTvIcon)).isDisplayed();

	}

	/*
	 * Verified if Over 18 Plus Icon link is displayed on the footer of each
	 * page
	 */
	public boolean is18PLUSPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_18PlusIcon)).isDisplayed();

	}

	/* Verified if GameCare link is displayed on the footer of each page */
	public boolean isGAMCAREPresent() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.Footer_GamCareIcon)));
		return driver.findElement(By.cssSelector(Constant.Footer_GamCareIcon)).isDisplayed();

	}

	/*
	 * Verified if Gambling Commision Logo link is displayed on the footer of
	 * each page
	 */
	public boolean isGambCommsissionPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_GamblingCommissionIcon)).isDisplayed();

	}

	public boolean isComplianceTextsPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_NetplaytvLicenceTexts)).isDisplayed();

	}

	/* Verified if Compliance text is displayed on the footer of each page */
	public boolean isBlogLinkPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_BlogLink)).isDisplayed();

	}

	/* Verified if Affiliates link is displayed on the footer of each page */
	public boolean isAfiliatesLinkPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_AfiliatesLink)).isDisplayed();

	}

	/* Click on Getting Started link on the footer */
	public void clickGettingStartedLink() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(Constant.Footer_GettingStartedLink)));
		driver.findElement(By.cssSelector(Constant.Footer_GettingStartedLink)).click();

	}

	/* Click on TV Presenter link on the footer */
	public void clickTVPresentLink() {
		driver.findElement(By.cssSelector(Constant.Footer_TvPresenterLink)).click();

	}

	/* Click on Video link on the footer */
	public void clickVideo() {
		driver.findElement(By.cssSelector(Constant.Footer_VideosLink)).click();
	}

	/* Click on VIP link on the footer */
	public void clickVIPLink() {
		driver.findElement(By.cssSelector(Constant.Footer_VIPLink)).click();
	}

	/* Click on Winners link on the footer */
	public void clickWinnerLink() {
		driver.findElement(By.cssSelector(Constant.Footer_WinnersLink)).click();

	}

	/* Click on About-us link on the footer */
	public void clickAboutUs() {
		driver.findElement(By.cssSelector(Constant.Footer_AboutUSLink)).click();

	}

	/* Click on Getting Started link on the footer */
	public void clickContactUsLink() {
		driver.findElement(By.cssSelector(Constant.Footer_ConTactUSLink)).click();

	}

	/* Click on FAQS link on the footer */
	public void clickFAQSLink() {
		driver.findElement(By.cssSelector(Constant.Footer_FAQSLink)).click();

	}

	/* Click on Privacy Policy link on the footer */
	public void clickPrivacyPolicylink() {
		driver.findElement(By.cssSelector(Constant.Footer_PrivacyPolicyLink)).click();

	}

	/* Click on Responsible Gambling link on the footer */
	public void clickResponsibleGamblingLink() {
		driver.findElement(By.cssSelector(Constant.Footer_ResponsibleGamblingLink)).click();

	}

	/* Click on Terms link on the footer */
	public void clickTermLink() {
		driver.findElement(By.cssSelector(Constant.Footer_TermsLink)).click();

	}
}
