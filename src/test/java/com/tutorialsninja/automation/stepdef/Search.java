package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.SeachResultPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Search {
	HeadersSection headersection=new HeadersSection();
	SeachResultPage searchresultpage=new SeachResultPage();
	
	@When("^i search for the product \"([^\"]*)\"$")
	public void i_search_for_the_product(String ProdName){
		Elements.TypeText(HeadersSection.Search,ProdName );
		Elements.click(HeadersSection.SearchIcon);
	}

	@Then("^I should see the product details displayed$")
	public void i_should_see_the_product_details_displayed(){
	    Assert.assertTrue(Elements.isDisplayed(SeachResultPage.SamSungSearch));
	}
	
	@Then("^I should see advisory message$")
	public void i_should_see_advisory_message(){
	    Assert.assertTrue(Elements.isDisplayed(SeachResultPage.ProdNotInCart));
	}

}
