@tag
Feature: Buyer Login Into Application
  As Buyer I want to login into application

  @tag1
  Scenario Outline: Buyer able to login into application with valid credentails
    Given Buyer navigate to Website
    When Buyer Enter <username> and <password>
    Then Buyer click on login button
    And Buyer navigate to Product Screen

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
      | standard_user12|secret_sauce|

  
