Feature: OrangeHRM login
  As a user I want to login into OrangeHRM application

  Background: 
    Given user navigate to OrangeHRM <URL>

  Scenario Outline: User Login to OrangeHRM
    When user entered <username> and <password> into respective fields
    And user click on submit Login button
    Then user logged into OrangeHRM application

    Examples: 
      | URL                                                                |  | username |  | password |
      | https://opensource-demo.orangehrmlive.com/web/index.php/auth/login |  | Admin    |  | admin123 |
