package com.mystore.pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrderSortPage {

	WebDriver ldriver;

	//2. Create constructor
	public OrderSortPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);//driver that will be used to lookup the web element

	}


	//To find total inventory items
	@FindAll(@FindBy(xpath = "//button[@class='btn_primary btn_inventory']"))
    private List<WebElement> inventory_items;
	
	////select[@class="product_sort_container"]
	
	@FindBy(xpath="//select[@class=\"product_sort_container\"]")
	WebElement sortDropDown;
	
	
	//This methosd is used to fetch first element before sort
	public String getItemBeforeSort()
	{
		//int size=inventory_items.size()
		String First_Item=inventory_items.get(0).getText();
		return First_Item;
	}
	
	
	//This methosd is used to fetch last element before sort
	public String getItemAfterSort()
	{
		int size=inventory_items.size();
		int last=size-1;
		String Last_Item=inventory_items.get(last).getText();
		return Last_Item;
	}
	public void clickOnDropDown(String value)
	{
		//int size=inventory_items.size()
		Select s= new Select(sortDropDown);
		
		s.selectByVisibleText(value);
	       
	}

		
	}
	
	
	

