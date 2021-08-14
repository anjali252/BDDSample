Feature: Handle CRM Deal

@FunctionalTest @SmokeTest 
Scenario: Create Deal
Given user is logged in
When user create a new deal

@RegressionTest
Scenario: view contact details
Given user is logged in
When user view deal details


Scenario: user logout
When user logout 