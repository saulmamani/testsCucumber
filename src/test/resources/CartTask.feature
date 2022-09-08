Feature: As a user i want to add several products to the cart to be able to delete them
  Background: User is logged into sauce demo web page
    Given I set the user name text box with "standard_user"
    And I set the password text box with "secret_sauce"
    And I click on the login button

  Scenario: Add four product to the cart
    When I am in the home page
    And I click on the four products buttons
      | add-to-cart-sauce-labs-backpack | add-to-cart-sauce-labs-fleece-jacket | add-to-cart-sauce-labs-onesie | add-to-cart-sauce-labs-bike-light |
    And I click on the cart icon
    Then I should be four products in the cart



#    Examples:
#      | products                             |
#      | add-to-cart-sauce-labs-backpack      |
#      | add-to-cart-sauce-labs-bike-light    |
#      | add-to-cart-sauce-labs-onesie        |
#      | add-to-cart-sauce-labs-fleece-jacket |