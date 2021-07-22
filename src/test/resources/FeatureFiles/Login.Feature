Feature: Login functionality Scenario
	
	@Login @One
	Scenario: Whether User is able to application with valid credentials
		Given I launch the application
		And I navigate to account login page
		When I Login to application using Username "parthivajay145@gmail.com" and password "Aiop@0671"
		Then I Should see the user is able to login successfully
		
	@Login @Two
	Scenario: Verify Whether User is not able to login with invalid credentials
		Given I launch the application
		And I navigate to account login page
		When I Login to application using Username "parthivajay35145@gmail.com" and password "Aiop@063271"
		Then I Should see error message is getting displayed
		
	@Login @Three
	Scenario:  Verify Whether User is not able to login without providing credentials
		Given I launch the application
		And I navigate to account login page
		When I Login to application using Username "" and password ""
		Then I Should see error message is getting displayed
		
	@Login @Four
	Scenario:  Verify Whether User is  able to rest the forgotten password
		Given I launch the application
		And I navigate to account login page
		When I resest the forgotten email "parthivajay145@gmail.com"
		Then I Should see message informing user that password is send to mail
		
		
	 
