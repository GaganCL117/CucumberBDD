Feature: Search for Tide Powder Products

  Scenario: Search Tide Powers
    Given I am at the Home page of Tied website
    When I Enterd the Product name
    Then I should navigate to Powder Page
    And Click on Products
    And Click on Find Retailor
    Then Close the popup window
    And Verify Powder is Displayed or not
