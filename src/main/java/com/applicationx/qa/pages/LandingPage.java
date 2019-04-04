package com.applicationx.qa.pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.applicationx.qa.base.TestBase;

public class LandingPage extends TestBase{
	
	String country;
	
	//Page Factory - OR:
    @FindBy(xpath="//select[@name='country-list']")
    List<WebElement> countryList;
	
	
	//Initializing the Page Objects:
	public LandingPage(){
		PageFactory.initElements(driver, this);
	}
	
	public static void selectContry(String countryName) throws InterruptedException {
		
		Select month = new Select(driver.findElement(By.xpath("//select[@name='country-list']")));
		month.selectByVisibleText(countryName);
		
		Thread.sleep(5000);
	} 
	/*public void selectCountry(String countryname) {
		System.out.println(countryList.size());
		
		int count = countryList.size();
	
		for(int i=0; i<count;i++) {
			System.out.println(countryList.get(i).getText());
			if(countryList.get(i).getText() == countryname) {
				System.out.println("Lo encontre!!!");
				countryList.get(i).click();
				break;
			
			}
		}
	}*/

}

