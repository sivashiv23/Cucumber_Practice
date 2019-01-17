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
Feature: To test the simple input field form
  I want to use this template for my feature file

  @tag1
  Scenario: To test the simple input field form
    Given User is in seleniumeasy page
    And user has to click the input forms
    And user has to click the simple form demo
    When User has to pass the text
    And User has to click on the show message
    Then User has to view the message typed

  
