package com.applicationx.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.applicationx.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//td[contains(text(),'User: Rodrigo')]")
	@CacheLookup
	WebElement userNameLabel;

	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	WebElement newContactLink;
	
	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement dealsLink;

	@FindBy(xpath = "//a[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
	@FindBy (xpath = "//a[contains(text(),'Sign Up')]")
	WebElement signUpLink;
	
	@FindBy (xpath = "//a[contains(text(),'Pricing')]")
	WebElement PricingLink;
	
	@FindBy (xpath = "//img[@class='img-responsive']")
	WebElement CRMLogo;
	/////////////////////////////////////////////////////
	

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Get Title
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	//Get UserName displayed YES/NO
	public boolean verifyCorrectUserName(){
		return userNameLabel.isDisplayed();
	}
	//Get SignUp Link displayed YES/NO
	public boolean verifySignUpLink() {
		return signUpLink.isDisplayed();
	}
	//Get CRM LogoImg displayed YES/NO
	public boolean CRMLogoisDisplayed(){
		return CRMLogo.isDisplayed();
	}	
	//Select CRM LogoImg 
		public void CRMLogoSelect(){
			 CRMLogo.click();
		}
		
    //Select CRM LogoImg displayed YES/NO
	public String CRMTestxt() {
		String text = CRMLogo.getText();
		return text;
				}
		
		
	//Select and Go to Contacts Page
	public ContactsPage clickOnContactsLink(){
		contactsLink.click();
		return new ContactsPage();
	}
	//Select and Go to Deals Page
	public DealsPage clickOnDealsLink(){
		dealsLink.click();
		return new DealsPage();
	}
	//Select and go to Tasks Page
	public TasksPage clickOnTasksLink(){
		tasksLink.click();
		return new TasksPage();
	}
	
	public void clickOnNewContactLink(){
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		newContactLink.click();
		
	}
}
