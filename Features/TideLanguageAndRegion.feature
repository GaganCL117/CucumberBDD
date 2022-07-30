Feature: Test Tide Language and Regions option

  Scenario: Language and Regions
    Given I am in the Tide Home Page
    When I clicked on Region Options
    Then Region or country Selection list should appear
    And verify with the selected Region
