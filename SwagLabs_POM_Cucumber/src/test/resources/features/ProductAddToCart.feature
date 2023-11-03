@tag
Feature: Buyer Adding Product To Cart
  As Buyer I want to add Back Bag to Cart

  @tag1
  Scenario Outline: Buyer able to Add Bag to Cart
    Given Buyer navigate to Website
    When Buyer Enter <username> and <password>
    Then Buyer click on login button
    And Buyer navigate to Product Screen
    And Buyer Add Bag to Cart

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
