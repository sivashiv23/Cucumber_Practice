#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Add Tariff Plan

  @tag1
  Scenario Outline: To add tariff plan
    Given The user is in gurutelecom home page
    And The user navigates to add tariff plan page
    When the user fills the tariff details "<Monthrent>", "<Freeloc>", "<FreeInt>", "<Freesms>", "<Loccharge>", "<Intcharge>","<SMScharge>"
    And the user clicks the submit button
    Then the user must see the message plan added

    Examples: 
      | Monthrent | Freeloc | FreeInt | Freesms | Loccharge | Intcharge | SMScharge |
      |       500 |     100 |     200 |     300 |       400 |       500 |        50 |
      |       500 |     100 |     200 |     300 |       400 |       500 |        50 |
    
