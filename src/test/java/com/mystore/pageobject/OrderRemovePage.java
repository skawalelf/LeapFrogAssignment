package com.mystore.pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderRemovePage {
	WebDriver ldriver;

	//2. Create constructor
	public OrderRemovePage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);//driver that will be used to lookup the web element

	}

	@FindAll(@FindBy(xpath = "//button[@class='btn_primary btn_inventory']"))
    private List<WebElement> addToCart;

	@FindBy(xpath="//span[@class=\"fa-layers-counter shopping_cart_badge\"]")
	WebElement bucket;

	@FindBy(xpath="//div[@class=\"cart_quantity\"]")
	WebElement cartQuantity;

	@FindAll(@FindBy(xpath = "//button[text()=\"REMOVE\"]"))
    private List<WebElement> remove;

	//create actions methods for web elements

	public void clickOnAddToCart()
	{
		int i=0;
		for(WebElement wb: addToCart) {
			
			wb.click();
			i++;
		}
		
		System.out.println("No of times clicked:" +i);
	}

	public void clickOnBucket()
	{
		bucket.click();
	}

	public int checkQuantity()
	{
		String cartQuantityText = cartQuantity.getText();

        // Convert the text content to an integer
        int cartQuantity = Integer.parseInt(cartQuantityText);
        
        return cartQuantity;
		
	}
	
	public int clickOnRemove()
	{
		int i=0;
		for(WebElement wb: remove) {
			
			wb.click();
			i++;
		}
		
		System.out.println("No of times clicked:" +i);
		return i;
	}
	

}
