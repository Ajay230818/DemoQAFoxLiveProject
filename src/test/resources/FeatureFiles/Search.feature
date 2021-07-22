Feature: To verify the Search functionality
	
	@Search @One
	Scenario: Search for products
		Given I launch the application
		When i search for the product "Samsung SyncMaster 941BW"
		Then I should see the product details displayed
		
	@Search @Two
	Scenario: Search for products
		Given I launch the application
		When i search for the product "Apple iphone"
		Then I should see advisory message
