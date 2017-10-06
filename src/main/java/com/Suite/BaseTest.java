package com.suite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

public class BaseTest {

	public static WebDriver driver;
	Properties OR = null;
	Properties CONFIG = null;
	WebDriver mozilla = null;
	WebDriver chrome = null;
	WebDriver ie = null;

	private static String OS = System.getProperty("os.name").toLowerCase();

	public static boolean isUnix() {
		return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0);
	}

	public BaseTest() {

		try {
			// initialize OR
			OR = new Properties();
			FileInputStream fs;
			if (!isUnix()) {
				fs = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\Config\\OR.properties");
			} else {
				fs = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/Config/OR.properties");
			}
			OR.load(fs);

			// initialize CONFIG to corresponding env
			CONFIG = new Properties();
			if (!isUnix()) {
				fs = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\main\\java\\Config\\Config.properties");
			} else {
				fs = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/Config/Config.properties");
			}
			CONFIG.load(fs);

		} catch (Exception e) {
			System.out.println("Error on intializing properties files" + e.getMessage());
		}
		if (driver == null) {
		}

		// log("Opening browser "+browserType);
		String browserType = CONFIG.getProperty("browser");
		if (browserType.equals("Mozilla")) {
			FirefoxProfile profile = new FirefoxProfile();
			ProfilesIni prof = new ProfilesIni();
			FirefoxProfile ffProfile = prof.getProfile("ProfileSeleniumQA");
			profile.setPreference("dom.max_chrome_script_run_time", 0);
			profile.setPreference("dom.max_script_run_time", 0);
//			ffProfile.setAcceptUntrustedCertificates(true);
//			ffProfile.setAssumeUntrustedCertificateIssuer(false);
			FirefoxOptions options = new FirefoxOptions();
			if (!isUnix()) {
				options.setBinary("lib\\geckodriver.exe");
				System.setProperty("webdriver.gecko.driver", "lib\\geckodriver.exe");
			} else {
				options.setBinary("lib/geckodriver");
				System.setProperty("webdriver.gecko.driver", "lib/geckodriver");
			}
			driver = new FirefoxDriver(ffProfile);
		} else if (browserType.equals("Chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-infobars");
			options.addArguments("no-sandbox");
			if (!isUnix()) {
				File file = new File("lib\\chromedriver.exe");
				System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
				options.addExtensions(new File("lib\\chromedriver.exe"));
			} else {
				File file = new File("lib/chromedriver");
				options.addExtensions(new File("lib/chromedriver"));
				System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			}

			driver = new ChromeDriver();
		} else if (browserType.equals("IE")) {
			// set the IE server exe path and initialize
		}

		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// driver.get(CONFIG.getProperty("siteName"));
		
		
		
	}

	public void quit() {
		if (driver != null) {
			driver.quit();
			driver = null;

		}

	}

	public static void takeScreenshot(String fileName) throws Exception {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			if (!isUnix()) {
				FileUtils.copyFile(scrFile,
						new File(System.getProperty("user.dir") + "\\screenshots\\" + fileName + ".jpg"));
			} else {
				FileUtils.copyFile(scrFile,
						new File(System.getProperty("user.dir") + "/screenshots/" + fileName + ".jpg"));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		
	}
}
