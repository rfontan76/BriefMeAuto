package com.applicationx.qa.landingpage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.applicationx.qa.base.TestBase;
import com.applicationx.qa.pages.HomePage;
import com.applicationx.qa.pages.LandingPage;
import com.applicationx.qa.pages.LoginPage;

public class LandingPageTest extends landingpageBaseClass {
	
	LandingPage landingpage;
	
	public LandingPageTest(){
		super();
	}
	
		@Test(testName= "Verify_Select country",priority=1)
		 public void verifySelectCountry() throws InterruptedException {
			LandingPage.selectContry("Argentina");
		} 
		

}
