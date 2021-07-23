package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class HeadersSection {
	
	public HeadersSection() {
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(xpath="//span[text()='My Account']")
	public static WebElement MyAccount;
	
	@FindBy(linkText="Register")
	public static WebElement Register;
	
	@FindBy(linkText="Login")
	public static WebElement Login;
	
	@FindBy(css="input[class$='input-lg']")
	public static WebElement Search;
	
	@FindBy(xpath="//span[@class='input-group-btn']//following-sibling::button")
	public static WebElement SearchIcon;
	
	@FindBy(xpath="//span[text()='Shopping Cart']")
	public static WebElement ShoppingCart; 
			
	@FindBy(xpath="//div[@id='common-success']/ul/li[4]/a[text()='Success']")
	public static WebElement OrderSuccess;
	
	public static void navigatetologinpage(){
		Elements.click(HeadersSection.MyAccount);
		Elements.click(HeadersSection.Login);
	}
	
	public static void SearchAproduct(){
		Elements.TypeText(SeachResultPage.SamSungSearch, Base.reader.getProduct());
		Elements.Click(HeadersSection.SearchIcon);
		Elements.click(SeachResultPage.AddtoCart);
	}
	
	public static void NavigateToShopCart(){
		Elements.click(ShoppingCart);
	}
}
