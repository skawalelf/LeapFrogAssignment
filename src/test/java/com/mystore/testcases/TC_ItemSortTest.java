package com.mystore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.pageobject.OrderRemovePage;
import com.mystore.pageobject.OrderSortPage;
import com.mystore.pageobject.indexPage;

public class TC_ItemSortTest extends BaseClass {
	
	
	@Test(enabled = true)
	public void VerifySortOrder() throws IOException
	{

		logger.info("\n***************TestCase cart items sort started*****************"); 

		/*	driver.get(url);
		logger.info("Url opened");*/

		//Sign in 
		indexPage indexPg = new indexPage(driver);

		
		indexPg.clickOnUserName();
		indexPg.clickOnPassword();
		
		logger.info("user name and password entered");
		
		indexPg.clickOnLogin();
		
		logger.info("User is able to do login");

		//sort page
		OrderSortPage osp=new OrderSortPage(driver);
		
		logger.info("click on Name (A to Z) and fetch first value");
		
		String value1="Name (A to Z)";
		osp.clickOnDropDown(value1);
		
		String Beforesort= osp.getItemBeforeSort();
		
		logger.info("click on Name (z to a) and fetch last value");
		
		String value2="Name (Z to A)";
		osp.clickOnDropDown(value2);
		String Aftersort=osp.getItemAfterSort();
		
		
		logger.info("click on Price (low to high) and fetch first value");
		
		String value3="Price (low to high)";
		osp.clickOnDropDown(value3);
		
		String Beforesort1= osp.getItemBeforeSort();
		
		logger.info("click on Price (high to low) and fetch last value");
		
		String value4="Price (high to low)";
		osp.clickOnDropDown(value4);
		String Aftersort1=osp.getItemAfterSort();
			Assert.assertEquals(Beforesort, Aftersort);

		logger.info("***************TestCase sort cart items from the cart ends*****************"); 

	}

	
	
	
}
