
Feature: Customer Able to buy Product 
  I want to buy the product from application
  
  
    
   Scenario Outline: Buyer able to complete the Order flow
   
    Given Buyer navigate to Website
    When Buyer Enter <username> and <password>
    Then Buyer click on login button
    And Buyer navigate to Product Screen
    And Buyer Add Bag to Cart
    And Buyer Sorting the Product List
    Then Buyer Adding the Light Product To Cart
    And Buyer Adding the RedTShirt to cart
    Then Buyer able to CheckOutTheCart 
    And Buyer Adding the DeliveryLocations <firstname> and <lastname> and <zipcode>
    And Buyer able to Finish the Cart
    

    Examples: 
      | username      | password     |firstname | lastname | zipcode |
      | standard_user | secret_sauce | Rohith   | Vadde    | 507101|