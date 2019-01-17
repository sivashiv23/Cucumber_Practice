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
Feature: To test the Check credit function

  @tag1
  Scenario: To test the check credit function
    Given User should be in guru telecom homepage
    And user navigate to the payment gateway project
    And user clicks on the check credit balance
    When user has to provide the card number 
    And user click on submit
    Then user should see the credit balance on the provided card number

 
