package com.finalproject.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.finalproject.BaseClass.BaseClass;
import com.finalproject.pages.AllCoursesPage;
import com.finalproject.pages.HomePage;
import com.finalproject.pages.LoginPage;

public class AddSeleniumToWishListTest extends BaseClass {
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	AllCoursesPage allCourses = new AllCoursesPage();
	Actions action = new Actions(getDriver());

	@Test
	public void verifySeleniumCourseAddedToWishListTest() {
		loginPage.LoginToPortal();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// homePage.navigateToAllCourses();
		getDriver().navigate().to("https://edureka.co/all-courses");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		allCourses.searchBtn.sendKeys("Selenium");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		allCourses.searchBtn.sendKeys(Keys.ENTER);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		allCourses.automationMastersProgramLink.click();
		String expectedText = allCourses.automationMastersProgramLink.getText();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		((JavascriptExecutor) getDriver()).executeScript("window.scroll(0, 200)");

		allCourses.getAppiumLink().click();
		getDriver().navigate().to("https://www.edureka.co/search/favourite");

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		getDriver().navigate().to("https://learning.edureka.co/mycourses");
		homePage.Logout();
		String actualText = "Your search \"favourite\" did not match any courses";
		Assert.assertEquals(actualText, expectedText, "The course was not added to wishlist");
	}
}
