Feature: Login

  @positive
  Scenario: Login with correct data
    Given User launches Chrome browser
    When User opens ilcarro Home Page
    And User clicks on Login link
    And User enters correct data
    And User clicks on Yalla button
    Then User verifies SuccessMessage is displayed
    And User quites browser

  @wrongPassword
  Scenario Outline: Login with correct email and wrong password
    Given User launches Chrome browser
    When User opens ilcarro Home Page
    And User clicks on Login link
    And User enters correct email and wrong password
      | email   | password   |
      | <email> | <password> |
    And User clicks on Yalla button
    Then User verifies ErrorMessage is displayed
    And User quites browser
    Examples:
      | email         | password    |
      | manuel@gm.com | manuel1234! |
      | manuel@gm.com | MANUEL1234! |
      | manuel@gm.com | Ьфтгуд1234! |
      | manuel@gm.com | Manuel12341 |