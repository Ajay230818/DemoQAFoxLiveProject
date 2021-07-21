package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.config.PropertyFileReader;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;


public class Register {
	@Given("^I have launch the application$")
	public void I_have_launch_the_application()  {
	    Base.driver.get(Base.reader.getUrl());
	}

	@And("^I navigate to navigate to Registration page$")
	public void I_navigate_to_navigate_to_Registration_page() {
	    
	}

	@When("^I provide all the below details$")
	public void I_provide_all_the_below_details(DataTable arg1) {

	}

	@And("^I select the privacy policy$")
	public void I_select_the_privacy_policy()  {
	    
	}

	@And("^I click on continue button$")
	public void I_click_on_continue_button() {
	    
	}

	@Then("^I should see the user account is successfully registered$")
	public void I_should_see_the_user_account_is_successfully_registered() {
	   
	}
}
