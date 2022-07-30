Feature: Test Stain Removal Option

  Scenario: Stain Removal under Shop Products
    Given I am at Tide Home page hovered on Shop Products
    When I clicked on Stain Removal Option
    Then I should be able to navigate to stain Removal page
    And Verify weather Stain Removal Page is visible or not
