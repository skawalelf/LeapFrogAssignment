package com.mystore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.pageobject.CheckoutPage;
import com.mystore.pageobject.OrderRemovePage;
import com.mystore.pageobject.indexPage;

public class TC_CheckOutPageTest extends BaseClass {
	
	
	@Test(enabled = true)
	public void VerifyCheckOutValidation() throws IOException
	{

		logger.info("\n***************TestCase checkout validation started*****************"); 

		/*	driver.get(url);
		logger.info("Url opened");*/

		//Sign in 
		indexPage indexPg = new indexPage(driver);

		
		indexPg.clickOnUserName();
		indexPg.clickOnPassword();
		
		logger.info("user name and password entered");
		
		indexPg.clickOnLogin();
		
		logger.info("User is able to do login");

		//product page
		OrderRemovePage orp= new OrderRemovePage(driver);
		

		orp.clickOnAddToCart();
		logger.info("Clicked on add to cart");

		orp.clickOnBucket();;
		logger.info("Clicked on bucket for proceeding to check out");
		
		int QTY=orp.checkQuantity();
		
		Assert.assertTrue(QTY > 0, "Cart quantity should be greater than zero");
		logger.info("Cart quantity is greater than zero");
		
		
		//checkout validation 
		
		CheckoutPage cop =new CheckoutPage(driver);
		
		cop.clickOnCheckOut();
		
		logger.info("Clicked on continue on check out page");
		
		String actualErrormessage=cop.clickOnContinue();
		System.out.println("Actual error messgae is:"+actualErrormessage);
		Assert.assertEquals(actualErrormessage, "Error: First Name is required");
		
		
		logger.info("Clicked on continue and enter first name check out page");
		cop.cickOnFirstName();
		String actualErrormessage2=cop.clickOnContinue();
		System.out.println("Actual error messgae is:"+actualErrormessage2);
		Assert.assertEquals(actualErrormessage2, "Error: Last Name is required");
		
		/*
		logger.info("Clicked on continue and enter lastname name check out page");
		cop.cickOnFirstName();
		cop.
		String actualErrormessage3=cop.clickOnContinue();
		System.out.println("Actual error messgae is:"+actualErrormessage3);
		Assert.assertEquals(actualErrormessage3, "Error: Postal Code is required");*/


		//	Assert.assertEquals(sucessMsg, "Your order on My Store is complete.");

		logger.info("***************TestCase check out validation ends*****************"); 

	}
	
	
	

}
