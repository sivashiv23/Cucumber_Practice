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
Feature: To test the pay bill function

Background:
Given The user should generate the new card
Then store the card details 
 

  @tag1
  Scenario: To test the paying function
    Given The user is in gurutelecom home page
    And user navigates to payment gateway page
    When User should choose the quantity of the item
    And User click on buynow option
    Then User enters the 	card number,expiration month,expiration year,cvv code
    And User clicks on pay 
    And The message Payment successfull! is displayed

 
