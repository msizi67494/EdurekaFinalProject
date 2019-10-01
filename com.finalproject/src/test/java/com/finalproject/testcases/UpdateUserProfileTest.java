package com.finalproject.testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.finalproject.BaseClass.BaseClass;
import com.finalproject.pages.HomePage;
import com.finalproject.pages.LoginPage;
import com.finalproject.pages.MyProfile;

public class UpdateUserProfileTest extends BaseClass {
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	MyProfile profile = new MyProfile();
	Actions action = new Actions(getDriver());
	
	@Test(alwaysRun = true)
	public void editProfile() throws InterruptedException {
		loginPage.LoginToPortal();
		homePage.NavigateToMyProfile();
		
		Thread.sleep(3000);
		action.moveToElement(profile.getEditProfile()).click().build().perform();
		Thread.sleep(3000);
		
		profile.getUserName().sendKeys("Msizi Sakhile Ndlela");
		Thread.sleep(3000);
		profile.getCurrentRole().sendKeys("Software Quality Assurannce Enthusiast");
		Thread.sleep(3000);
	}
	
//	@Test(priority = 1)
//	public void editProfessionalDetails() {
//		
//	}
}
