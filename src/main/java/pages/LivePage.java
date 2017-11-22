package pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.Constant;

public class LivePage extends BasePage {

	public LivePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public String  getLiveVetricalUrlAddress(){
		return driver.getCurrentUrl();
	}
	
	public void clickLiveGame() throws InterruptedException{
		WebElement Game = driver.findElement(By.cssSelector(Constant.RouletteExpressPremium));
		WebElement PlayForReal=driver.findElement(By.cssSelector(Constant.RouletteExpressPremiumPLayForReal));
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(Game));
		Actions Move = new Actions(driver);
		Move.moveToElement(Game).build().perform();
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", PlayForReal);


	}
	
	public WebDriver isLiveGameLaunch() throws InterruptedException{
		 Thread.sleep(5000);
		 Set<String> Windowids1 = driver.getWindowHandles();
			Iterator<String> it1 = Windowids1.iterator();
			String MainWindowids1 = it1.next();
			String tabbedWindowId1 = it1.next();
			Windowids1.size();
			System.out.println(Windowids1.size());
			System.out.println(MainWindowids1);
			System.out.println(tabbedWindowId1);
			while (it1.hasNext())
				;
			if (Windowids1.size() > 1)
				System.out.println(true);
			else
				System.out.println(false);
			//Assert.assertNotSame(MainWindowids1, tabbedWindowId1);
			return driver.switchTo().window(tabbedWindowId1);
	 }
}
