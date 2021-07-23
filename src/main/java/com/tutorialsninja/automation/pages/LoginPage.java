package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.javascript.host.media.rtc.webkitRTCPeerConnection;
import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class LoginPage {
	
	public LoginPage() {
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(id="input-email")
	public static WebElement UserName;
	
	@FindBy(id="input-password")
	public static WebElement PassWord;
	
	@FindBy(css="input[type='Submit'][value='Login']")
	public static WebElement LoginButton;
	
	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement MainWarning;
	
	
	public static void login(String Username,String Password){
		Elements.TypeText(UserName, Username);
		Elements.TypeText(PassWord, Password);
		Elements.click(LoginButton);
	}
	
	public static void dologin(){
		Elements.TypeText(LoginPage.UserName,Base.reader.getUserName() );
		Elements.TypeText(LoginPage.PassWord,Base.reader.getPassword() );
		Elements.click(LoginPage.LoginButton);
	}

}
