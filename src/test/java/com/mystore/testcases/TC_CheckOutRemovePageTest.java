package com.mystore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.pageobject.CheckOutRemovePage;
import com.mystore.pageobject.CheckoutPage;
import com.mystore.pageobject.OrderRemovePage;
import com.mystore.pageobject.indexPage;

public class TC_CheckOutRemovePageTest extends BaseClass {
	
	
	
	@Test(enabled = true)
	public void VerifyCheckOutRemoveValidation() throws IOException
	{

		logger.info("\n***************TestCase checkout remove items validation started*****************"); 

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
		
		CheckOutRemovePage corp =new CheckOutRemovePage(driver);
		
		corp.clickOnRemove();
		logger.info("User is able to remove all items");
		
		logger.info("***************TestCase check out remove item validation ends*****************"); 

	}
	

}
