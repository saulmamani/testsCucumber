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
    Then I should be "4" products in the cart

  Scenario: Delete two product and verify to the cart
    When I click on two remove products buttons
      | remove-sauce-labs-bike-light | remove-sauce-labs-onesie |
    Then I should be "2" products in the cart


#    Examples:
#      | products                             |
#      | add-to-cart-sauce-labs-backpack      |
#      | add-to-cart-sauce-labs-bike-light    |
#      | add-to-cart-sauce-labs-onesie        |
#      | add-to-cart-sauce-labs-fleece-jacket |