Feature: As a user i want order products
  Background: User is logged into sauce demo web page
    Given I set the user name text box with "standard_user"
    And I set the password text box with "secret_sauce"
    And I click on the login button

  Scenario Outline: Order products for price
    When I am in the home page
    And I click select price dropdown with "<option>"
    Then I verify correct order
    Examples:
      | option |
      | lohi    |
      | hilo    |