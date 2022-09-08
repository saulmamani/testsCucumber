Feature: As a user i want to add several products to the cart to be able to delete them
  Background: User is logged into sauce demo web page
    Given I set the user name text box with "standard_user"
    And I set the password text box with "secret_sauce"
    And I click on the login button

    And I am in the home page
    And I click on the four products buttons
      | add-to-cart-sauce-labs-backpack | add-to-cart-sauce-labs-fleece-jacket | add-to-cart-sauce-labs-onesie | add-to-cart-sauce-labs-bike-light |
    And I click on the cart icon

  Scenario: Add four product to the cart
    Then I should have "4" products in the cart

  Scenario: Delete two product and verify in the cart
    When I click on two remove products buttons
      | remove-sauce-labs-bike-light | remove-sauce-labs-onesie |
    Then I should have "2" products in the cart

  Scenario: Check the sum of the products in the cart
    When  I click on checkout button
    And I fill the customer data with
      | Saul | Mamani | 76137269 |
    And I click on continue button
    And I verify that the sum is the correct

#    Examples:
#      | cantidades                             |
#      | 2     |
#      | 3    |
#      | 4        |