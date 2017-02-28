package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.Constant;

public class FooterPage extends BasePage {

	public FooterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public boolean isGettingStartedLinkPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_GettingStartedLink)).isDisplayed();

	}

	public boolean isTVPresentLinkPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_TvPresenterLink)).isDisplayed();
	}

	public boolean isVideoLinkPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_VideosLink)).isDisplayed();
	}

	public boolean isVIPLinkPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_VIPLink)).isDisplayed();

	}

	public boolean isWinnerLinkPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_WinnersLink)).isDisplayed();

	}

	public boolean isAboutUsLinkPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_GettingStartedLink)).isDisplayed();

	}

	public boolean isContactUsLinkPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_ConTactUSLink)).isDisplayed();

	}

	public boolean isFAQSLinkPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_FAQSLink)).isDisplayed();

	}

	public boolean isPrivacyPolicylinkPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_PrivacyPolicyLink)).isDisplayed();

	}

	public boolean isResponsibleGamblingLinkPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_ResponsibleGamblingLink)).isDisplayed();

	}

	public boolean isTermLinkPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_TermsLink)).isDisplayed();

	}

	public boolean isPayPalIconPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_PayPalIcon)).isDisplayed();

	}

	public boolean isVisaIconPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_VisaIcon)).isDisplayed();

	}

	public boolean isNetPlayTvLogoPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_NetPlayTvIcon)).isDisplayed();

	}

	public boolean is18PLUSPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_18PlusIcon)).isDisplayed();

	}

	public boolean isGAMCAREPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_GamCareIcon)).isDisplayed();

	}

	public boolean isGambCommsissionPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_GamblingCommissionIcon)).isDisplayed();

	}

	public boolean isComplianceTextsPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_NetplaytvLicenceTexts)).isDisplayed();

	}
	public boolean isBlogLinkPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_BlogLink)).isDisplayed();

	}
	public boolean isAfiliatesLinkPresent() {
		return driver.findElement(By.cssSelector(Constant.Footer_AfiliatesLink)).isDisplayed();

	}
	public void clickGettingStartedLink() {
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(Constant.Footer_GettingStartedLink)));
		driver.findElement(By.cssSelector(Constant.Footer_GettingStartedLink)).click();

	}

	public void clickTVPresentLink() {
		driver.findElement(By.cssSelector(Constant.Footer_TvPresenterLink)).click();

	}

	public void clickVideo() {
		driver.findElement(By.cssSelector(Constant.Footer_VideosLink)).click();
	}

	public void clickVIPLink() {
		driver.findElement(By.cssSelector(Constant.Footer_VIPLink)).click();
	}

	public void clickWinnerLink() {
		driver.findElement(By.cssSelector(Constant.Footer_WinnersLink)).click();

	}

	public void clickAboutUs() {
		driver.findElement(By.cssSelector(Constant.Footer_AboutUSLink)).click();

	}

	public void clickContactUsLink() {
		driver.findElement(By.cssSelector(Constant.Footer_ConTactUSLink)).click();

	}

	public void clickFAQSLink() {
		driver.findElement(By.cssSelector(Constant.Footer_FAQSLink)).click();

	}

	public void clickPrivacyPolicylink() {
		driver.findElement(By.cssSelector(Constant.Footer_PrivacyPolicyLink)).click();

	}

	public void clickResponsibleGamblingLink() {
		driver.findElement(By.cssSelector(Constant.Footer_ResponsibleGamblingLink)).click();

	}

	public void clickTermLink() {
		driver.findElement(By.cssSelector(Constant.Footer_TermsLink)).click();

	}
}
