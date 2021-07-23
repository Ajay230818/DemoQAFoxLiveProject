package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class CheckoutPage {
	
	public CheckoutPage() {
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(id="button-payment-address")
	public static WebElement HomeAddress;
	
	@FindBy(id="button-shipping-address")
	public static WebElement ShippingAddress;
	
	@FindBy(id="button-shipping-method")
	public static WebElement ShippingMethod;
	
	@FindBy(css="input[type='checkbox']")
	public static WebElement PaymentMethodCheckbox;
	
	@FindBy(id="button-payment-method")
	public static WebElement Payment;

	@FindBy(id="button-confirm")
	public static WebElement checkOutContinue;
	
	public static void checkoutProcess(){
		Elements.click(CheckoutPage.HomeAddress);
		Elements.click(CheckoutPage.ShippingAddress);
		Elements.click(CheckoutPage.ShippingMethod);
		Elements.click(CheckoutPage.PaymentMethodCheckbox);
		Elements.click(CheckoutPage.Payment);
		Elements.click(CheckoutPage.checkOutContinue);
	}
}
