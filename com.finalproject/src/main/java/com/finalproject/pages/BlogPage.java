package com.finalproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.finalproject.BaseClass.BaseClass;

public class BlogPage extends BaseClass {
	// page objects
	@FindBy(xpath = "//div[18]//a[1]//div[1]")
	WebElement softwareTestingLink;

	@FindBy(xpath = "//a[@class='ga-recent-blogs'][contains(text(),'Top 40 Test Automation Interview Questions You Nee')]")
	WebElement interviewQuestionsLink;

	// init objects
	public BlogPage() {
		PageFactory.initElements(getDriver(), this);
	}
	// page actions

	public WebElement getSoftwareTestingLink() {
		return softwareTestingLink;
	}

	public WebElement getInterviewQuestionsLink() {
		return interviewQuestionsLink;
	}

}
