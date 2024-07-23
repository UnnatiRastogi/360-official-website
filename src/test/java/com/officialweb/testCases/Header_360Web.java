package com.officialweb.testCases;


import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.officialweb.pageObjects.WebPage;

public class Header_360Web  extends BaseClass
{
	@Test
	public void UITest()
	{
	driver.get(baseURL);
	
	WebPage wp = new WebPage(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	Assert.assertTrue(wp.getLogo().isDisplayed(),"Logo is displayed on the screen");
	System.out.println("Logo is present");

	
	Assert.assertTrue(wp.USnumber().isDisplayed(),"The field is present");
	System.out.println("The field is present");
	
	Assert.assertTrue(wp.UKnumber().isDisplayed(),"The field is present");
	System.out.println("The field is present");
	
	Assert.assertTrue(wp.Ausnumber().isDisplayed(),"The field is present");
	System.out.println("The field is present");
	
	Assert.assertTrue(wp.Talktous(). isDisplayed(),"The button is present");
	System.out.println("The link is present");
	
	Assert.assertTrue(wp.service().isDisplayed(),"The link is present");
	System.out.println("The link is present");
	
	Assert.assertTrue(wp.Platforms().isDisplayed(),"The link is present");
	System.out.println("The link is present");
	
	Assert.assertTrue(wp.Hirestaff().isDisplayed(),"The link is present");
	System.out.println("The link is present");
	
	Assert.assertTrue(wp.Industry().isDisplayed(),"The link is present");
	System.out.println("The link is present");
	
	Assert.assertTrue(wp.Products().isDisplayed(),"The link is present");
	System.out.println("The link is present");
	
	Assert.assertTrue(wp.Resources().isDisplayed(),"The link is present");
	System.out.println("The link is present");
	
	Assert.assertTrue(wp.Company().isDisplayed(),"The link is present");
	System.out.println("The link is present");
	
	Assert.assertTrue(wp.Bannner().isDisplayed(),"The link is present");
	System.out.println("The Banner is present");
	
	
	
	
	
	

	
	
	
	
	
	

	}

}


