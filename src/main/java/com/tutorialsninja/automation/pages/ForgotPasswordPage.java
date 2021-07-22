package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class ForgotPasswordPage {
	
	public ForgotPasswordPage() {
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(xpath="(//a[text()='Forgotten Password'])[1]")
	public static WebElement ForgotPassword;
	
	@FindBy(id="input-email")
	public static WebElement ForgotEmailId;
	
	@FindBy(css="input[type='submit'][value='Continue']")
	public static WebElement ForgotContinueButton; 
	
	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement ForgotMainWarning;
	
	public static void ForgotpasswordReset(String Email){
		Elements.Click(ForgotPassword);
		Elements.TypeText(ForgotPassword,Email);
		Elements.click(ForgotContinueButton);
	}
}
