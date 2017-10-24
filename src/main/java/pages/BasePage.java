package pages;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.Constant;

public class BasePage {

	protected WebDriver driver;
	public static boolean isLoggedIn=false;

	// Initilising the WebDriver
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public void sendUsername(String username) {
		// entering the Username into the username login file
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(username);

	}

	// entering the Password into the Password login field.
	public void sendPassword(String password) {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);

	}
     /* click on sigin button on the Home Page */
	public void clickSigin() {
		driver.findElement(By.cssSelector("div.playtech-login-block button.sign-in")).click();

	}
      /* Click on Join Now Button */
	public void clickJoinNow() {
		driver.findElement(By.xpath("//a[@class='button success register']")).click();
		

	}
    // Get the Current Url address
	public String getCurrentUrl() {
		String Url = driver.getCurrentUrl();
		return Url;
	}
    /* Check if Deposit button is displayed */
	public boolean isDepositButtonPresent() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.HP_DeopsitButton)));
		return driver.findElement(By.xpath("//*[@id='account_box']/a")).isDisplayed();
	}

	/* Click on ForgottenDetails link */
	public void clickForgottenDetailsLink() {
		driver.findElement(By.cssSelector(Constant.HomePage_ForgottenDetailsLink)).click();

	}
   /* Check if Login Error message is displayed */
	public boolean isLoginErrorMessPoxBoxPresent() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.Login_ErrorPopBox)));
		return driver.findElement(By.cssSelector(Constant.Login_ErrorPopBox)).isDisplayed();

	}

	// Click on the deposit button on the home page
	public void clickHpDepositButton() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			WebElement PlayerMessaging = (WebElement) driver
					.findElement(By.cssSelector("div.playerMessages-modal .footer .ok"));
			if (PlayerMessaging.isDisplayed())
				wait.until(ExpectedConditions.visibilityOf(PlayerMessaging));
			PlayerMessaging.click();
		} catch (Exception t) {
			t.printStackTrace();
		}

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.cssSelector("div#authcache-block-account-FLEX_account_block a.deposit")));
		driver.findElement(By.cssSelector(Constant.HP_DeopsitButton)).click();
	}
    /*  Mouse hover over the Account menu link */
	public void moveAccountMenu() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Constant.AccountMenuDropdown)));
		WebElement AccounMenu = driver.findElement(By.xpath(Constant.AccountMenuDropdown));
		Actions move = new Actions(driver);
		move.moveToElement(AccounMenu).build().perform();
		//
	}
    /* Click Change Password link */
	public void clickChangePasswordLink() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.AccountMenu_ChangePassword)));
		WebElement ChangePasswordLink = driver.findElement(By.cssSelector(Constant.AccountMenu_ChangePassword));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ChangePasswordLink);

	}
	/* click on withdraw link within the Account Menu */
	public void clickWithdrawLink() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.AccountMenu_Withdrawl)));

		driver.findElement(By.cssSelector(Constant.AccountMenu_Withdrawl)).click();

	}
    /* Click on Chat icon on the Home Page */
	public void clickChatIcon() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.ChatIcon)));
		driver.findElement(By.cssSelector(Constant.ChatIcon)).click();


	}
     /* Click on Help icon link */
	public void clickHelpIcon() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.HelpIconLink)));
		driver.findElement(By.cssSelector(Constant.HelpIconLink)).click();
	}
    /* Click on Casino Tab */
	public void clickCasinoTab() {
		driver.findElement(By.cssSelector(Constant.VerticalTab_Casino)).click();

	}
     /* click Vegas Tab */
	public void clickVegasTab() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.VerticalTab_Vegas)));
		driver.findElement(By.cssSelector(Constant.VerticalTab_Vegas)).click();

	}
     /* Click on Live Tab */
	public void clickLiveTab() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(Constant.VerticalTab_Live)).click();

	}
   /* Click on Promotions tab */
	public void clickPromotionsTab() {
		driver.findElement(By.cssSelector(Constant.VerticalTab_Promotions)).click();

	}

	// Creating a dologin function
	public void doLogin(String baseURL, String username, String password) {
		driver.get(baseURL);
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
		driver.findElement(By.cssSelector("div.playtech-login-block button.sign-in")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.HP_DeopsitButton)));

		

	}
  /* Check if User is loggedin and if Player messing is displayed */
	public boolean isLoggedIn(){
		try {
			WebElement PlayerMessage = driver.findElement(By.cssSelector("div.playerMessages-modal .footer .ok"));
			if (PlayerMessage.isDisplayed() == true)
				PlayerMessage.click();
		} catch (Throwable t) {
			t.getStackTrace();

		}
		WebElement HomePage_DepositButton=driver.findElement(By.cssSelector(Constant.HP_DeopsitButton));
		if(HomePage_DepositButton.isDisplayed()){
			return true;
		}else
				return false;
		}
		
	
	protected String generateStringWithAllobedSplChars(int length, String allowdSplChrs) {
		String allowedChars = "abcdefghijklmnopqrstuvwxyz" + // alphabets
				"1234567890" + // numbers
				allowdSplChrs;
		return RandomStringUtils.random(length, allowedChars);
	}

	public String generateRandomAlphaNumeric(int lenght, String charcter) {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!\"$%^&*()" + "0123456789";
		charcter = RandomStringUtils.random(lenght, characters);
		return charcter;
	}

	public static String getRelativeUrl(String absoluteURL) throws MalformedURLException {
		URL url = new URL(absoluteURL);
		return url.getPath();
	}

	// store screenshot

}