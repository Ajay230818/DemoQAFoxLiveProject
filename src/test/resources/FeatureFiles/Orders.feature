Feature: Orders placing in Ninja Site

  @Orders @One
  Scenario: Verify whether user is able to place order
    Given I Login to the application
    When I add a product to bag and check
    And I place an order
    Then I should see the ordered placed successfully
   

