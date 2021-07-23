package com.tutorialsninja.automation.stepdef;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HostnameVerifier;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.CheckoutPage;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.SeachResultPage;
import com.tutorialsninja.automation.pages.ShoppingCartPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Orders {
	HeadersSection headersection=new HeadersSection();
	LoginPage loginpage=new LoginPage();
	SeachResultPage Seachpage=new SeachResultPage();
	ShoppingCartPage shoppingcartpage=new ShoppingCartPage();
	CheckoutPage checkoutpage=new CheckoutPage();
	
	@Given("^I Login to the application$")
	public void i_Login_to_the_application() {
		Base.driver.get(Base.reader.getUrl());
		HeadersSection.navigatetologinpage();
		LoginPage.dologin();		
	}

	@When("^I add a product to bag and check$")
	public void i_add_a_product_to_bag_and_check() {
		HeadersSection.SearchAproduct();
		HeadersSection.NavigateToShopCart();
		Elements.click(ShoppingCartPage.Checkoutbutton);
	}

	@And("^I place an order$")
	public void i_place_an_order() {
	    CheckoutPage.checkoutProcess();
	}

	@Then("^I should see the ordered placed successfully$")
	public void i_should_see_the_ordered_placed_successfully(){
		Base.driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	    Assert.assertTrue(Elements.isDisplayed(HeadersSection.OrderSuccess));
	}
}
