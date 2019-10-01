package com.finalproject.BaseClass;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public static WebDriver driver;
	
    public static WebDriver getDriver() {
        if (driver != null) {
            return driver;
        }
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\NdlelaM1\\Desktop\\selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }
	
	@BeforeClass
	public static void setupBrowser() {
	
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		driver.manage().deleteAllCookies();
		
		getDriver().get("https://edureka.co");
		
	}
	
	@AfterClass
	public void closeBrowser() {
		getDriver().quit();
	}
	
	
}
