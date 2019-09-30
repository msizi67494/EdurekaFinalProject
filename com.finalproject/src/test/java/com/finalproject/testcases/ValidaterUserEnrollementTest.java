package com.finalproject.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.finalproject.BaseClass.BaseClass;
import com.finalproject.pages.HomePage;
import com.finalproject.pages.LoginPage;

public class ValidaterUserEnrollementTest extends BaseClass {

	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	Boolean verifyCourse;
	Boolean expected = true;

	@Test
	public void validateUserEnrollment() {
		loginPage.LoginToPortal();
		((JavascriptExecutor)getDriver()).executeScript("window.scroll(0,300)");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String courseVerification = homePage.getVerificationText().getText();
		System.out.println(courseVerification);

		if (courseVerification.equalsIgnoreCase("Ongoing")) {
			verifyCourse = true;

		} else {
			verifyCourse = false;
		}
		System.out.println(verifyCourse);

		Assert.assertEquals(verifyCourse, expected);
		homePage.Logout();
	}

}
