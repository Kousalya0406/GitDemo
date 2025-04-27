
@tag
Feature: Search and place the order for products
  

  
  Scenario: Search Experience for product search in both home and offers page
    Given User is on Greenkart Landing page
    When  User searched with Shortname "Tom" and extracted name of product
    Then User searched for same "Tom" shortname in offers page 
     And  validating the both page
     Then click on page
     
    
