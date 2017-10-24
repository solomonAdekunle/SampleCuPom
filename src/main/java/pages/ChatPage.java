package pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.Constant;

public class ChatPage extends BasePage {

	public ChatPage(WebDriver driver) {
		super(driver);
		
	}
	
	public boolean isChatPopUpLaunched(){
		// Switch to  Chat Box Pop-up
		Set<String> Windowids = driver.getWindowHandles();
		Iterator<String> it = Windowids.iterator();
		String MainWindowids = it.next();
		String tabbedWindowId = it.next();
		System.out.println(MainWindowids);
		System.out.println(tabbedWindowId);
        while (it.hasNext());
		driver.switchTo().window(tabbedWindowId);
		WebDriverWait WaitForMe = new WebDriverWait(driver,60);
		 WebElement SuercasinoLogoChat=driver.findElement(By.cssSelector(Constant.ChatboxSuperCasinoLogo));
		 WaitForMe.until(ExpectedConditions.visibilityOf(SuercasinoLogoChat));
		 return SuercasinoLogoChat.isDisplayed();
		
		
	}

}
