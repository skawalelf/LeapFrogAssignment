package com.mystore.pageobject;

import java.util.List;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

	WebDriver ldriver;
	private WebDriverWait wait;
	//2. Create constructor
	public ProductPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);//driver that will be used to lookup the web element
		//this.wait = new WebDriverWait(ldriver, Duration.ofSeconds(10));
	}

	//Identify the elements present in the login page

	//button[@name='Submit']
	//@FindBy(xpath="//button[@class=\"btn_primary btn_inventory\"]")
	//WebElement addToCart;

	@FindAll(@FindBy(xpath = "//button[@class='btn_primary btn_inventory']"))
    private List<WebElement> addToCart;

	@FindBy(xpath="//span[@class=\"fa-layers-counter shopping_cart_badge\"]")
	WebElement bucket;

	@FindBy(xpath="//div[@class=\"cart_quantity\"]")
	WebElement cartQuantity;


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
	
	
	
}
