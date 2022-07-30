Feature: Test For Tide Deep Clean Option under Shop Products

  Scenario Outline: Test Tide Deep Clean
    Given I am in the Home page of Tide website
    When I hovered on Shop products
    And Clicked on Tide Deep Clean
    And changed the alphabetical order to <value>
    Then verify all the changes are correct or not

    Examples: 
      | value    |
      | title_za |
