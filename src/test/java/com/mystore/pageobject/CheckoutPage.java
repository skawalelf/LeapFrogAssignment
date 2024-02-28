package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

	WebDriver ldriver;

	//2. Create constructor
	public CheckoutPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);//driver that will be used to lookup the web element

	}

	@FindBy(xpath="//input[@value=\"CONTINUE\"]")
	WebElement Continue;
	
	//
	@FindBy(xpath = "//h3[@data-test=\"error\"]")
	WebElement errormessage;
	
	@FindBy(xpath="//span[@class=\"fa-layers-counter shopping_cart_badge\"]")
	WebElement bucket;
	
	@FindBy(xpath = "//input[@id=\"first-name\"]")
	WebElement firstname;
	
	@FindBy(xpath = "//input[@id=\"last-name\"]")
	WebElement lastname;
	
	@FindBy(xpath = "//input[@id=\"postal-code\"]")
	WebElement postalcode;
	
	
	@FindBy(xpath = "//a[text()=\"CHECKOUT\"]")
	WebElement checkout;
	
	
	public String clickOnContinue()
	{
		 Continue.click();
		 String actualerrormessage=errormessage.getText();
		 return actualerrormessage;
	}
	
	
	public void clickOnBucket()
	{
		bucket.click();
	}

	
	public String cickOnFirstName()
	{
		firstname.sendKeys("santosh");
		Continue.click();
		String actualerrormessage=errormessage.getText();
		return actualerrormessage;
	}
	
	
	public String cickOnLasttName()
	{
		firstname.sendKeys("kawale");
		Continue.click();
		String actualerrormessage=errormessage.getText();
		return actualerrormessage;
	}
	
	public void clickOnCheckOut()
	{
		checkout.click();
	}
	
	
	}
