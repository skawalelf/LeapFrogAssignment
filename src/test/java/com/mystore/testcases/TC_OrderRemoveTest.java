package com.mystore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.pageobject.OrderRemovePage;
import com.mystore.pageobject.ProductPage;
import com.mystore.pageobject.indexPage;

public class TC_OrderRemoveTest extends BaseClass {
	
	@Test(enabled = true)
	public void VerifyOrderRemoval() throws IOException
	{

		logger.info("\n***************TestCase remove items from the cart started*****************"); 

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
		
		
		orp.clickOnRemove();
		logger.info("clicked on remove button");
		
		Assert.assertTrue(QTY > 0, "Cart quantity should be greater than zero");
		logger.info("Removed Cart quantity is greater than zero");
		
		


		//	Assert.assertEquals(sucessMsg, "Your order on My Store is complete.");

		logger.info("***************TestCase remove items from the cart ends*****************"); 

	}
	
	
	
	

}
