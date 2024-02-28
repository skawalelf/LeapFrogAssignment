package com.mystore.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.pageobject.OrderSortPage;
//import com.mystore.pageobject.OrderConfirmationPage;
//import com.mystore.pageobject.OrderPaymentPage;
import com.mystore.pageobject.CheckoutPage;
import com.mystore.pageobject.OrderRemovePage;
import com.mystore.pageobject.ProductPage;
//import com.mystore.pageobject.SearchResultPage;
import com.mystore.pageobject.indexPage;
//import com.mystore.pageobject.myAccountPage;
//import com.mystore.pageobject.registeredUserAccount;



public class TC_ProductPageTest  extends BaseClass  {
/*
	@Test(enabled=true)
	public void VerifySearchProduct() throws IOException
	{
		String searchKey = "T-shirts";
		logger.info("\n***************TestCase Search Product started*****************"); 

		//Sign in 
		indexPage indexPg = new indexPage(driver);
		indexPg.clickOnSignIn();


		//Enter account details- email and password
		myAccountPage pg = new myAccountPage(driver);
		pg.enterEmailAddress(emailAddress);

		logger.info("User Email and Password entered.");
		pg.enterPassword(password);

		pg.clickSignIn();
		logger.info("Sign In link clicked");

		//Enter searchkey in search box
		registeredUserAccount productPg = new registeredUserAccount(driver);
		productPg.EnterDataInSearchBox(searchKey);
		productPg.ClickOnSearchButton();

		// Get Name of Searched Product
		SearchResultPage resultPg = new SearchResultPage(driver);

		String SearchResultProductname=resultPg.getSearchResultProductName();


		//Verify that correct Product is displaying after search

		if(SearchResultProductname.contains(searchKey))
		{
			logger.info("Search Product testcase - Passed"); 
			Assert.assertTrue(true);

			productPg.clickOnSignOut();

		}
		else
		{
			logger.info("Search Product testcase - Failed");
			captureScreenShot(driver,"VerifySearchProduct");
			Assert.assertTrue(false);

		} 

		logger.info("***************TestCase Search Product ends*****************"); 

	}
*/

	@Test(enabled = true)
	public void VerifyBuyProduct() throws IOException
	{

		logger.info("\n***************TestCase Buy Product started*****************"); 

		/*	driver.get(url);
		logger.info("Url opened");*/

		//Sign in 
		indexPage indexPg = new indexPage(driver);

		
		indexPg.clickOnUserName();
		indexPg.clickOnPassword();
		
		logger.info("user name and password entered");
		
		indexPg.clickOnLogin();
		
		logger.info("User is able to do login");


		ProductPage prodPg = new ProductPage(driver);
		

		prodPg.clickOnAddToCart();
		logger.info("Clicked on add to cart");

		prodPg.clickOnBucket();;
		logger.info("Clicked on bucket for proceeding to check out");
		
		int QTY=prodPg.checkQuantity();
		
		Assert.assertTrue(QTY > 0, "Cart quantity should be greater than zero");
		
		


		//	Assert.assertEquals(sucessMsg, "Your order on My Store is complete.");

		logger.info("***************TestCase BuyProduct ends*****************"); 

	}

/*
	@Test
	public void verifyAddToWishlistWithoutLogin() throws IOException
	{
		logger.info("\n***************TestCase verifyAddToWishlistWithoutLogin started*****************"); 

		indexPage indexPage = new indexPage(driver);
		indexPage.clickOnTShirtMenu();

		ProductPage prodPage = new ProductPage(driver);
		prodPage.mouseOverOnTshirtProduct();

		prodPage.clickOnAddToWishList();

		String actualAlertMsg = prodPage.getTextOfAlertForWishList();
		String expectedAlertMsg = "You must be logged in to manage your wishlist.";

		if(actualAlertMsg.equals(expectedAlertMsg))
		{
			logger.info("verifyAddToWishlistWithoutLogin - passed"); 
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("verifyAddToWishlistWithoutLogin - failed"); 
			captureScreenShot(driver,"verifyAddToWishlistWithoutLogin");
			Assert.assertTrue(false);
		}

	}
	*/
}
