package com.mystore.pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutRemovePage {
	
	
	WebDriver ldriver;

	//2. Create constructor
	public CheckOutRemovePage(WebDriver rdriver)
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
	
	//button[@class="btn_secondary cart_button"]
	@FindAll(@FindBy(xpath = "//button[@class=\"btn_secondary cart_button\"]"))
     List<WebElement> remove;
	
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

	public void clickOnRemove()
	{
		for(WebElement ele : remove)
		{
			ele.click();
			
			
		}
	}
}
