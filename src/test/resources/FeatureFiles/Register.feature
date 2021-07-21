Feature: Registration functionality scenarios
	
	@Register @One
	Scenario: Verify whether the user is able to register into the application by providing all the details
		Given I have launch the application
		And I navigate to navigate to Registration page
		When I provide all the below details
			| FirstName |  Parthiv                  |
			| LastName  |  Ajay                     |
			| Email     |  parthivajay145@gmail.com |
			| Telephone |  9872678178               |
			| Password  |  Aiop@0671                |
		And I select the privacy policy
		And I click on continue button
		Then I should see the user account is successfully registered