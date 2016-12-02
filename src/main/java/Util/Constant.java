package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Suite.BaseTest;

public class Constant extends BaseTest {

	
	
	public static String SUITE_SHEET="Suite";
	

	// Locators for Registtration Page
	public static  WebElement Reg_UserName= driver.findElement(By.cssSelector("input#account_username"));
	public static WebElement Reg_PassWord=driver.findElement(By.cssSelector("input#account_password"));
	public static WebElement Reg_ConfirmPassword=driver.findElement(By.cssSelector("input#account_password_confirm"));
	public static WebElement Reg_OnScreeName=driver.findElement(By.cssSelector("input#screen_name"));
	public static WebElement Reg_Email=driver.findElement(By.cssSelector("input#email"));
	public static WebElement Reg_Title=driver.findElement(By.cssSelector("div.form-item-title .form-select"));
	public static WebElement First_Name=driver.findElement(By.cssSelector("input#fname"));
	public static WebElement SurName=driver.findElement(By.cssSelector("input#surname"));
	public static WebElement DOB_Day=driver.findElement(By.cssSelector("select#edit-date-select-day"));
	public static WebElement DOB_Month=driver.findElement(By.cssSelector("select#edit-date-select-month"));
	public static WebElement DOB_Year=driver.findElement(By.cssSelector("select#edit-date-select-year"));
	public static WebElement Enter_Manually=driver.findElement(By.cssSelector("span#enter_manually a"));
	public static WebElement Address=driver.findElement(By.cssSelector("input#address"));
	public static WebElement Town=driver.findElement(By.cssSelector("input#city"));
	public static WebElement County=driver.findElement(By.cssSelector("input#county"));
	public static WebElement PostCode=driver.findElement(By.cssSelector("input#postcode"));
	public static WebElement Contact_Number=driver.findElement(By.cssSelector("input#mobile_phone"));
	public static WebElement FreeBonus=driver.findElement(By.cssSelector("input#nobonus"));
	public static WebElement Terms_Wagering=driver.findElement(By.cssSelector("div#bonus-description a"));
	public static WebElement Over18=driver.findElement(By.cssSelector("input#agree_terms"));
	public static WebElement terms=driver.findElement(By.cssSelector("div#terms-description a[data-ajax-url='/get-page/2']"));
	public static WebElement privacyPolicy=driver.findElement(By.cssSelector("div#terms-description a[data-ajax-url='/get-page/3']"));
	public static WebElement Compilaance_Message=driver.findElement(By.cssSelector("div.registration-form-legal-footer p"));
	public static WebElement Reg_Submit=driver.findElement(By.cssSelector("button#registration_submit"));
	
}

