@AccountManagement
Feature: Account Management

  @CreateAccount
  Scenario Outline: Create an account using a valid email address
    Given I am on create an account page
    When I enter "<Firstname>" "<Lastname>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on create an account
    Then My account page is displayed


    Examples:
      | Firstname | Lastname | Email         | Password    | ConfirmPassword |
      | Ara       | Zee      | Ara@gmail.com | Arazee99@20 | Arazee99@20     |




  @SignIn
  Scenario Outline: Create registered customer login using a valid email address
    Given I am on signIn page
    When I enter "<Email>" "<Password>"
    And I click on sign in
    Then My registered customer account page is displayed

    Examples:
      | Email          | Password      |
      | Ara1@gmail.com | Arazee99@2020 |



