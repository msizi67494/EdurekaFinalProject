package com.finalproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.finalproject.BaseClass.BaseClass;

public class AllCoursesPage extends BaseClass {
	// page objects
	@FindBy(id = "search-inp")
	public WebElement searchBtn;

	@FindBy(xpath = "//h3[contains(text(),'Selenium Certification Training')]")
	public WebElement seleniumCourseLink;

	@FindBy(xpath = "//i[@id='d_wishlist-icon-814']")
	public WebElement automationMastersProgramLink;

	@FindBy(xpath = "	//i[@id='d_wishlist-icon-797']")
	WebElement appiumLink;

//init elements

	public AllCoursesPage() {
		PageFactory.initElements(driver, this);
	}
//page actions

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getSeleniumCourseLink() {
		return seleniumCourseLink;
	}

	public WebElement getAutomationMastersProgramLink() {
		return automationMastersProgramLink;
	}

	public WebElement getAppiumLink() {
		return appiumLink;
	}

}
