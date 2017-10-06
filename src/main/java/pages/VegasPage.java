package pages;

import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.suite.BaseTest;

import junit.framework.Assert;

public class VegasPage extends BasePage {

	public VegasPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public String VerifyVegasURLaddress() {
		return driver.getCurrentUrl();

	}

	public void clickVegasGamesLaunch() {
		WebElement GameBox = driver.findElement(By.cssSelector("div.view-id-games"));
		List<WebElement> Game = GameBox.findElements(By.cssSelector("div.view-id-games .playtech-games"));
		System.out.println(Game.size());
		WebElement secondGame = Game.get(2);
		secondGame.click();

	}

	
	public WebDriver isWindowTabTheSame() {
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
