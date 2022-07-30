Feature: Test Tide Liquid Products Under Shop Products

  Scenario: Tide Liquid Products Sensitive option
    Given I am in Tide HomePage and hoverd on shop products
    When I clicked on Liquid Product
    Then Click on sensitive option
    And Verify sensitive page is displayed or not
