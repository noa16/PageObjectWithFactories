package com.w2a.basic;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.w2a.pages.actions.TopNavigation;
import com.w2a.utilities.ExcelReader;
import com.w2a.utilities.ExtentManager;

public class Page {
	
	public static WebDriver driver;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\testdata.xlsx");
	public static WebDriverWait wait;
	public ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test;
	public static String browser;
	public static TopNavigation topNav;
	
	
	
	public static void initConfiguration() {
		
		if(Constants.browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe" );
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-infobars");
			driver = new ChromeDriver(options);
			log.debug("Launching chrome");
			driver.get(Constants.testsiteurl);
			driver.manage().window().maximize();
		//	driver.manage().timeouts().implicitlyWait(Constants.implicitwait, TimeUnit.SECONDS);
			
		//	wait = new WebDriverWait();
			topNav = new TopNavigation(driver);
		}
		
	}
	
	
	public static void click(WebElement element) {
		
		element.click();
		log.debug("Clicking on an element :"+element);
		test.log(LogStatus.INFO,"Clicking on :"+element);
		
		
		
	}
	
	public static void quitBrowser() {
		
		driver.quit();
		
	}

}
