package com.finalproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.finalproject.BaseClass.BaseClass;

public class MyProfile extends BaseClass{
	
	//page objets
	@FindBy(xpath="//a[@id='personal_details']//i[@class='icon-pr-edit']")
	private WebElement editProfile;
	
	@FindBy(xpath="//a[@id='professional_details']//i[@class='icon-pr-edit']")
	private WebElement editProfessionalDetails;
	
	@FindBy(xpath="//input[@name='currentrole']")
	private WebElement currentRole;
	
	@FindBy(xpath="//input[@placeholder='Name']")
	private WebElement userName;
	
	//init page elements to driver
	public MyProfile() {
		PageFactory.initElements(getDriver(), this);
	}

	//page actions
	public WebElement getEditProfile() {
		return editProfile;
	}

	public WebElement getEditProfessionalDetails() {
		return editProfessionalDetails;
	}

	public WebElement getCurrentRole() {
		return currentRole;
	}

	public WebElement getUserName() {
		return userName;
	}
	
	
	
}
