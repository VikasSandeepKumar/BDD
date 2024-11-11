Feature: Search and Place Order
  Scenario: Search Experience for the Product
    Given GreenCart Landing Page
    When User searched with Shortname "Tom" and extracted name of the product
    Then Searched for "Tom" shortname in offers page to check if product exist with same name
    And Validate product name in offers page matched with Landing Page
    Then Close the Browser