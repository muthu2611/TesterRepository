package org.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static WebDriver driver ;
	public Properties prop;
	
	
	@BeforeSuite
	public WebDriver initializeDriver() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\org\\utility\\datas.properties");
		prop.load(fis);
		//String BrowserName = System.getProperty("browser");
		String BrowserName = prop.getProperty("browser");
		
		if(BrowserName.contains("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if(BrowserName.contains("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		return driver;
	}
	
	
	
	
	
}


//Map<String, Object> prefs = new HashMap<String, Object>();
//prefs.put("profile.default_content_setting_values.notifications", 2);
//prefs.put("credentials_enable_service", false);
//prefs.put("profile.password_manager_enabled", false);
//ChromeOptions options = new ChromeOptions();
//options.setExperimentalOption("prefs", prefs);
//options.addArguments("start-maximized");
//options.addArguments("--disable-notifications");
//
//
//options.setExperimentalOption ("excludeSwitches", Collections.singletonList ("enable-automation"));
//options.setExperimentalOption ("useAutomationExtension", false);
//options.addArguments("--user-data-dir=C:\\Users\\1\\AppData\\Local\\Google\\Chrome\\User Data\\");
//options.addArguments("--profile-directory=Profile 1");
//
//
//driver = new ChromeDriver(options);
//driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
