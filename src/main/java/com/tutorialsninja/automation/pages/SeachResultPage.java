package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class SeachResultPage {
	
	public SeachResultPage() {
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(css="input[name='search']")
	public static WebElement SamSungSearch;
	
	@FindBy(css="input[id='button-search']+h2+p")
	public static WebElement ProdNotInCart; 
	
	@FindBy(xpath="//span[text()='Add to Cart']")
	public static WebElement AddtoCart;  
	
	
}
