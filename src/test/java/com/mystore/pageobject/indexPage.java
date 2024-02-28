package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class indexPage {
	//1. create object of webdriver
	WebDriver ldriver;

	//constructor
	public indexPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		

		PageFactory.initElements(rdriver, this);
	}


	//identify webelements
	/*@FindBy(linkText = "Sign in") 
	WebElement signIn;
	
	@FindBy(xpath="(//a[text()='T-shirts'])[2]")
	WebElement tshirtMenu;
	
	
	//identify action on webelement
	public void clickOnSignIn() {
		signIn.click();
	}
	
	public String getPageTitle()
	{
		return(ldriver.getTitle());
	}
	
	public void clickOnTShirtMenu()
	{
		tshirtMenu.click();
	}*/
	
	//identify webelements
		@FindBy(id = "user-name")
		WebElement userName;
		
		@FindBy(id="password")
		WebElement password;
		
		@FindBy(id="login-button")
		WebElement login;
	
	
		//identify action on webelement
		public void clickOnUserName() {
			userName.sendKeys("standard_user");
			//sendKeys("standard_user")
		}
		//identify action on webelement
		public void clickOnPassword() {
			 password.sendKeys("secret_sauce");
			 //sendKeys("secret_sauce")
				}
	
	
		public void clickOnLogin()
		{
			login.click();
		}
	
}
