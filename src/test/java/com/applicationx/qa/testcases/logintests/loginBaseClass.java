package com.applicationx.qa.testcases.logintests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.applicationx.qa.base.TestBase;
import com.applicationx.qa.pages.HomePage;
import com.applicationx.qa.pages.LoginPage;

public class loginBaseClass extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	
	public loginBaseClass(){
		super();
	}
	
	//Execute before the test
	@BeforeMethod
	public void setUp(){
		
		initialization();
		
		loginPage = new LoginPage();
		homePage = new HomePage();
		
		//Get URL
	    driver.get(prop.getProperty("url"));
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl,"https://classic.crmpro.com/login.cfm","Unable to verify the main url loaded");
	}
	

	//Execute after the tests
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
