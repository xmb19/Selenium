Feature: Amazon.com

  Scenario: Amazon.com Adding Product
    Given User is on home page
    When  Click accept all cookies
    When  Click search bar
    When  Write the product name search bar
    When  Click search button
    When  Filter for Apple
    When  Filter for Shipped by Amazon
    When  Click the first product
    When  Add to cart
    When  Check at cart page
