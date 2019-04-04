package com.applicationx.qa.landingpage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.applicationx.qa.base.TestBase;
import com.applicationx.qa.pages.HomePage;
import com.applicationx.qa.pages.LandingPage;
import com.applicationx.qa.pages.LoginPage;

public class landingpageBaseClass extends TestBase{
	
	LandingPage landingpage;
	
	
	public landingpageBaseClass(){
		super();
	}
	
	//Execute before the test
	@BeforeMethod
	public void setUp(){
		
		initialization();
		
		landingpage = new LandingPage();
		
		
		//Get URL
	    driver.get(prop.getProperty("url"));
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl,"https://test.starmeup.com/en/landing-page-en-2/","Unable to verify the main url loaded");
	}
	

	//Execute after the tests
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
