package com.finalproject.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.finalproject.BaseClass.BaseClass;

public class LoginPage extends BaseClass {
	
 // web object
	
	@FindBy(xpath ="//a[@class='signin top-signin giTrackElementHeader hidden-xs']")
	WebElement lgnText;
	
	@FindBy(id="si_popup_email")
	WebElement username;
	
	@FindBy(id="si_popup_passwd")
	WebElement password;
	
	@FindBy(xpath="//button[@class='clik_btn_log btn-block']")
	WebElement lgnButton;
	
//page initialization // initializing object to driver object
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
//page actions
	public void LoginToPortal() {

		Actions action = new Actions(getDriver());
		
		action.moveToElement(lgnText).click();
		action.build().perform();
		
		System.out.println("Testing====================");
		
		//moving to login username and password pop - up
		action.moveToElement(username).click().sendKeys("msizi.ndlela5@gmail.com");
		
		try { Thread.sleep(2000);
		} catch (InterruptedException e) {e.printStackTrace();}
		action.build().perform();
		
		action.moveToElement(password).click().sendKeys("Msizi67494!");
		
		try { Thread.sleep(2000);
		} catch (InterruptedException e) {e.printStackTrace();}
		action.build().perform();
		
		action.moveToElement(lgnButton).click();
		
		try { Thread.sleep(2000);
		} catch (InterruptedException e) {e.printStackTrace();}
		action.build().perform();
		
		
	}
}
