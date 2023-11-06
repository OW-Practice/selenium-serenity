Feature: Login to the application
  As a user i want to login sucessfully

  Background: 

  # Given user is on home page
  Scenario Outline: user login with valid application
    When user enter <email> username
    Then user enter <password> password
    And user should be able to login

    Examples: 
      | email         |  | password  |
      | joe@gmail.con |  | AS login |
