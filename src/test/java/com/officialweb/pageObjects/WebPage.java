package com.officialweb.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class WebPage {
	
	WebDriver ldriver;
	
	public WebPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}


	By logo = By.xpath("(//img[@class=\"img-fluid ps-1\"])[2]");
     public WebElement getLogo() {
         return ldriver.findElement(logo);
	}
     
	By numberUS= By.xpath("//p[@class =\"mb-0\"]//a[text()=\"+1 309 316 7929\"]");
	public WebElement USnumber() {
	     return ldriver.findElement(numberUS);	
		}
	
	By numberUK= By.xpath("//p[@class=\"mb-0\"]//a[text()=\"+44 789 703 1106\"]");
	public WebElement UKnumber() {
	     return ldriver.findElement(numberUK);
	}
	     
	By numberAus= By.xpath("//p[@class=\"mb-0\"]//a[text()=\"+ 61 4800 94870\"]");
	public WebElement Ausnumber() {
	     return ldriver.findElement(numberAus);
		}
	
	By buttonTalktous= By.xpath("//a[@class=\"nav-link active\" and text()=\"Talk to Us\"]");
	public WebElement Talktous() {
	     return ldriver.findElement(buttonTalktous);
		}
	By linkervice= By.xpath("//a[@class=\"nav-link test\" and text()=\"Services\"]");
	public WebElement service() {
	     return ldriver.findElement(linkervice);
	}
	
	By linkplatform= By.xpath("//a[@class=\"nav-link\" and text()=\"Platforms\"]");
	public WebElement Platforms() {
	     return ldriver.findElement(linkplatform);
	}
	
	By linkhirestaff = By.xpath("//a[@class=\"nav-link test\" and text()=\"Hire Staff\"]");
	public WebElement Hirestaff() {
	     return ldriver.findElement(linkhirestaff);
	}
	
	By linkindustry = By.xpath("//a[@class=\"nav-link\" and text()=\"Industry\"]");
	public WebElement Industry(){
	     return ldriver.findElement(linkindustry);
	}
	
	By linkproducts = By.xpath("//a[@class=\"nav-link\" and text()= \"Products\"]");
	public WebElement Products(){
	     return ldriver.findElement(linkproducts);
	}
	
	By linkresources = By.xpath("//a[@class=\"nav-link\" and text()= \"Resources\"]");
	public WebElement Resources(){
	     return ldriver.findElement(linkresources);
	}
	
	By linkcompany = By.xpath("//a[@class=\"nav-link\" and text()= \"Resources\"]");
	public WebElement Company(){
	     return ldriver.findElement(linkresources);
	}
	
	By imgbanner = By.xpath("//span[@class=\"text-white banner_first_p\" and text()=\"Global Salesforce Consulting Partners\"]");
			
	public WebElement Bannner(){
	     return ldriver.findElement(linkresources);
	}	
	
}
