package com.tutorialsninja.automation.pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

import cucumber.api.DataTable;

public class RegisterPage {
	
	public RegisterPage() {
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(id="input-firstname")
	public static  WebElement FirstName;
	
	@FindBy(id="input-lastname")
	public static  WebElement LastName;
	
	@FindBy(id="input-email")
	public static  WebElement Email;	
	
	@FindBy(id="input-telephone")
	public static  WebElement Phone;	
	
	@FindBy(id="input-password")
	public static  WebElement Password;	
	
	@FindBy(id="input-confirm")
	public static  WebElement CPassword;	
	
	@FindBy(name="agree")
	public static  WebElement PrivacyPolicy;
			
	@FindBy(css="input[type='submit']")
	public static  WebElement ContinueButton; 
	
	@FindBy(xpath="//div[@id='account-register']/ul/li[3]/a")
	public static WebElement registerBreadCrumb;
	
	@FindBy(css="input[id='input-firstname']+div")
	public static WebElement FirstNameError;
	
	@FindBy(css="input[id='input-lastname']+div")
	public static WebElement LastNameError;
	
	@FindBy(css="input[id='input-email']+div")
	public static WebElement EmailError;
	
	@FindBy(css="input[id='input-telephone']+div")
	public static WebElement TelephoneWarning;
	
	@FindBy(css="input[id='input-password']+div")
	public static WebElement PasswordWarning;
	
	@FindBy(xpath="(//div[@id='account-register']/div)[1]")
	public static WebElement PrivacyErrorWarning;
	
	@FindBy(xpath="(//input[@name='newsletter'])[1]")
	public static WebElement SubscriptionNews;
	
	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement EmailAlreadyPresent;
	
	
	public static void enterAllDetails(DataTable dataTable){
		Map<String,String> map=dataTable.asMap(String.class, String.class);
		Elements.TypeText(RegisterPage.FirstName, map.get("FirstName"));
		Elements.TypeText(RegisterPage.LastName, map.get("LastName"));
		Elements.TypeText(RegisterPage.Email, System.currentTimeMillis()+map.get("Email"));
		Elements.TypeText(RegisterPage.Phone, map.get("Telephone"));
		Elements.TypeText(RegisterPage.Password, map.get("Password"));
		Elements.TypeText(RegisterPage.CPassword, map.get("Password"));
	}
	
	public static void enterAllDuplicateDetails(DataTable dataTable){
		Map<String,String> map=dataTable.asMap(String.class, String.class);
		Elements.TypeText(RegisterPage.FirstName, map.get("FirstName"));
		Elements.TypeText(RegisterPage.LastName, map.get("LastName"));
		Elements.TypeText(RegisterPage.Email, map.get("Email"));
		Elements.TypeText(RegisterPage.Phone, map.get("Telephone"));
		Elements.TypeText(RegisterPage.Password, map.get("Password"));
		Elements.TypeText(RegisterPage.CPassword, map.get("Password"));
	}
}
