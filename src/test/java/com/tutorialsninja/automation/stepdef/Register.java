package com.tutorialsninja.automation.stepdef;

import java.util.Map;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.AccountSuccess;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.RegisterPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;


public class Register {
	
	HeadersSection headersSection=new HeadersSection();
	RegisterPage registerPage=new RegisterPage();
	AccountSuccess accountSuccess=new AccountSuccess();
	
	@Given("^I have launch the application$")
	public void I_have_launch_the_application()  {
	    Base.driver.get(Base.reader.getUrl());
	}

	@And("^I navigate to navigate to Registration page$")
	public void I_navigate_to_navigate_to_Registration_page() {
	    Elements.Click(HeadersSection.MyAccount);
	    Elements.Click(HeadersSection.Register);
	}

	@When("^I provide all the below details$")
	public void I_provide_all_the_below_details(DataTable dataTable) {
		RegisterPage.enterAllDetails(dataTable);
	}

	@And("^I select the privacy policy$")
	public void I_select_the_privacy_policy()  {
		Elements.click(RegisterPage.PrivacyPolicy);
	}

	@And("^I click on continue button$")
	public void I_click_on_continue_button() {
		Elements.click(RegisterPage.ContinueButton);
	}

	@Then("^I should see the user account is successfully registered$")
	public void I_should_see_the_user_account_is_successfully_registered() {
		
		Assert.assertTrue((Elements.isDisplayed(AccountSuccess.SuccessBreadScrumb)));

	}
	
	@Then("^I should see User account is not created successfully$")
	public void i_should_see_User_account_is_not_created_successfully()  {
	    Assert.assertTrue(Elements.isDisplayed(RegisterPage.registerBreadCrumb)); 
	}

	@And("^I should see the error messages informing the users to fill the mandatory fields$")
	public void i_should_see_the_error_messages_informing_the_users_to_fill_the_mandatory_fields() {
	    Assert.assertTrue(Elements.isDisplayed(RegisterPage.FirstNameError));
	    Assert.assertTrue(Elements.isDisplayed(RegisterPage.LastNameError));
	    Assert.assertTrue(Elements.isDisplayed(RegisterPage.EmailError));
	    Assert.assertTrue(Elements.isDisplayed(RegisterPage.TelephoneWarning));
	    Assert.assertTrue(Elements.isDisplayed(RegisterPage.PasswordWarning));
	    Assert.assertTrue(Elements.isDisplayed(RegisterPage.PrivacyErrorWarning));
	}  
	
	@And("^I select for Subscribe to Newsletter Option$")
	public void I_select_for_Subscribe_to_Newsletter_Option() {
		Elements.click(RegisterPage.SubscriptionNews);
	}
	
	@When("^I provide all the below duplicate details$")
	public void I_provide_all_the_below_duplicate_details(DataTable dataTable){
		RegisterPage.enterAllDuplicateDetails(dataTable);
	}
	
	@Then("^User will get an error message$")
	public void User_will_get_an_error_message(){	
		Assert.assertNotEquals(RegisterPage.EmailAlreadyPresent,"Warning: E-Mail Address is already registered!");
	}

}
