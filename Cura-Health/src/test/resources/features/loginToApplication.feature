Feature: Login to the application
  As a user i want to login sucessfully

  Scenario: user login with valid application
    Given user is on home page
    When user enter admin as username
    Then user enter asdf as password
    And user should be able to login

   