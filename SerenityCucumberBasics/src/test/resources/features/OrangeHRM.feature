Feature: OrangeHRM login
  As a user I want to login into OrangeHRM application

  Scenario Outline: User Login to OrangeHRM
    Given user navigate to OrangeHRM URL
    When user entered <username> and <password> into respective fields
    And user click on submit Login button
    Then user logged into OrangeHRM application

    Examples: 
      | username |  | password |
      | Admin    |  | admin123 |
