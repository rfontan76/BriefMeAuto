package com.applicationx.qa.testcases;

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

public class LandingPageTest extends TestBase {
	
	LandingPage landingpage;
	
	public LandingPageTest(){
		super();
	}
	
	//Execute before the test
		@BeforeMethod
		public void setUp(){	
			initialization();
			landingpage = new LandingPage();
		    driver.get("http://www.facebook.com");
		}
		
		@Test(testName= "Verify Login Page Title",priority=1)
		 public static void selectMonth() throws InterruptedException {
				
			Select month = new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
			month.selectByVisibleText("Arg");
			
			Thread.sleep(5000);
		} 
		
		
		
		//Execute after the tests
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}


}
