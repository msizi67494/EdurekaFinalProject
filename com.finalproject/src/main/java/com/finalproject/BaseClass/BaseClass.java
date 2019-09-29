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
        driver = new ChromeDriver();
        return driver;
    }
	
	@BeforeClass
	public static void setupBrowser() {
	
		
		getDriver().manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().deleteAllCookies();
		
		driver.get("https://edureka.co");
		
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	
	public static void logoutFromPortal() {
		
	}
	
}
