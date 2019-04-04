package com.applicationx.qa.testcases.logintests;

import org.testng.Assert;
import org.testng.annotations.Test;


//Test class
public class LoginPageTest extends loginBaseClass{
	
	//Tests
	@Test(testName= "Verify Login Page Title",priority=1)
	public void loginPage_TitleIsDisplayed(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "CRMPRO Log In Screen","Unable to find the title");
	}
	
	@Test(priority=2)
	public void loginPage_CrmLogoImageIsDisplayed(){
		boolean flag = loginPage.validateCRMImage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginPage_SuccessReturnsHomePage(){
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=4)
	public void LoginPage_LoginButtonDisplayed() {
		Assert.assertTrue(loginPage.logInButtonDisplayed(), "Unable to find LogIn button");
		
	
	}

}
