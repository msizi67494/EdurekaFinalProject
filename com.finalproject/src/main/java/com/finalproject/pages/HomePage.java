package com.finalproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.finalproject.BaseClass.BaseClass;

public class HomePage extends BaseClass {

	Actions action = new Actions(getDriver());

//page objects
	@FindBy(xpath = "//div[@class='col-lg-6 col-md-6 col-sm-6 col-xs-6 text-left batch_status']")
	private WebElement verificationText;

	@FindBy(xpath = "//span[@class='user_name']")
	WebElement profileUsername;

	@FindBy(xpath = "//a[contains(text(),'Log Out')]")
	WebElement LogoutLink;
	
	@FindBy(xpath = "//a[@class='dropdown-item'][contains(text(),'My Profile')]")
	WebElement myProfileLink;

	@FindBy(xpath = "//button[contains(text(),'Courses')]")
	WebElement coursesBtn;

	@FindBy(xpath = "//a[@class='dropdown-item'][contains(text(),'All Courses')]")
	WebElement allCoursesLink;

//init method
	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}

//page actions
	public WebElement getVerificationText() {
		return verificationText;
	}

	public void Logout() {

		action.moveToElement(profileUsername).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		action.build().perform();

		action.moveToElement(LogoutLink).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		action.build().perform();

	}

	public void navigateToAllCourses() {

		action.moveToElement(coursesBtn).click().build().perform();

		coursesBtn.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		action.moveToElement(allCoursesLink).click().build().perform();

	}
	
	public void NavigateToMyProfile() {
		action.moveToElement(profileUsername).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		action.build().perform();

		action.moveToElement(myProfileLink).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		action.build().perform();
	}

}
