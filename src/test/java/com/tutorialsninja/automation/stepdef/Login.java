package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.ForgotPasswordPage;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.MyAccountPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	HeadersSection headersection=new HeadersSection();
	LoginPage loginPage=new LoginPage();
	MyAccountPage myaccpage=new MyAccountPage();
	ForgotPasswordPage forgotPasswordPage=new ForgotPasswordPage();

	@Given("^I launch the application$")
		public void i_launch_the_application(){
		Base.driver.get(Base.reader.getUrl());
		}

	@And("^I navigate to account login page$")
		public void i_navigate_to_account_login_page(){
		Elements.Click(HeadersSection.MyAccount);
		Elements.Click(HeadersSection.Login);
		}

	@When("^I Login to application using Username \"([^\"]*)\" and password \"([^\"]*)\"$")
		public void i_Login_to_application_using_Username_and_password(String Username, String password)  {
			LoginPage.login(Username, password);	
		}

	@Then("^I Should see the user is able to login successfully$")
		public void i_Should_see_the_user_is_able_to_login_successfully() {
			Assert.assertTrue(Elements.isDisplayed(MyAccountPage.RegisterAfflicateAccount));
		}
	
	@Then("^I Should see error message is getting displayed$")
	public void i_Should_see_error_message_is_getting_displayed() {
		System.out.println(Elements.getText(LoginPage.MainWarning));
	    Assert.assertEquals(Elements.getText(LoginPage.MainWarning), "Warning: No match for E-Mail Address and/or Password.");
	}
	
	@When("^I resest the forgotten email \"([^\"]*)\"$")
	public void i_resest_the_forgotten_email(String Email) {
	    ForgotPasswordPage.ForgotpasswordReset(Email);
	}

	@Then("^I Should see message informing user that password is send to mail$")
	public void i_Should_see_message_informing_user_that_password_is_send_to_mail() throws Throwable {
		 Assert.assertEquals(Elements.getText(ForgotPasswordPage.ForgotMainWarning), "Warning: The E-Mail Address was not found in our records, please try again!");
	}

}
