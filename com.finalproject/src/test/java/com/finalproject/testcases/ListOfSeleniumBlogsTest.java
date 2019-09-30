package com.finalproject.testcases;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.finalproject.BaseClass.BaseClass;
import com.finalproject.pages.BlogPage;
import com.finalproject.pages.HomePage;
import com.finalproject.pages.LoginPage;

public class ListOfSeleniumBlogsTest extends BaseClass {

	LoginPage loginPage = new LoginPage();
	BlogPage blogPage = new BlogPage();
	Actions action = new Actions(getDriver());
	
	@Test
	public void ListSeleniumBlogs() {
		
		loginPage.LoginToPortal();
		((JavascriptExecutor)getDriver()).executeScript("window.open('https://edureka.co/blog/','_blank')");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		  @SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayList tabs = new ArrayList (getDriver().getWindowHandles());
		    System.out.println(tabs.size());
		    driver.switchTo().window((String) tabs.get(1));
		blogPage.getSoftwareTestingLink().click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		blogPage.getInterviewQuestionsLink().click();
		
		String actualTitle = getDriver().getTitle();
		String expectedTitle = "Top Test Automation Interview Questions and Answers | Edureka";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		//driver.close();
		driver.switchTo().defaultContent();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		HomePage.logoutFromPortal();
		

	}
}
