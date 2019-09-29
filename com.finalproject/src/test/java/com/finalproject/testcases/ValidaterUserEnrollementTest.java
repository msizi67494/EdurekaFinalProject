package com.finalproject.testcases;

import org.testng.annotations.Test;

import com.finalproject.BaseClass.BaseClass;
import com.finalproject.pages.LoginPage;

public class ValidaterUserEnrollementTest extends BaseClass {

	LoginPage loginPage = new LoginPage();

	@Test
	public void validateUserEnrollment() {
		loginPage.LoginToPortal();
	}

}
