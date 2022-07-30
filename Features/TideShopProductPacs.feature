Feature: Shop Product for Pacs

  Scenario: Shop for Pacs
    Given I am at the Home page of Tide website
    When I hovered on Shop Products
    And Clicked on Pacs product
    Then Pacs product page should be visible
    And validate with Pacs Product is visible
