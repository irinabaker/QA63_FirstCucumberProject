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