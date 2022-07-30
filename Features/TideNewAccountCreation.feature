Feature: Creat a new Tide User Account

  Scenario Outline: Test To Create New User Account
    Given I have given the Tide URL to check the new user account
    When I enterd invalid <UserName>, <Email> and <Password>
    And clicked on Create Account
    Then user should not be able to create account

    Examples: 
      | UserName   | Email                | Password    |
      | Johnson123 | Johnson123@gmail.com | John123son@ |
