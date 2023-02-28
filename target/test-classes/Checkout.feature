Feature: As a guest user I would like to proceed to checkout and compare prices
@smoke
  Scenario: Check that correct product is added to the Basket
    Given send keys "Little Women" in search field
    And click on Search button
    And save title of the first item
    And click on Add to cart button
    When click on Basket button
    Then product title is the same as saved title
@smoke
    Scenario: Check that prices are correct
      Given send keys "Little Women" in search field
      When click on Search button
      Then check all prices are valid