Feature: Handle CRM Contact
Background: User logins
Given user is logged in

@RegressionTest
Scenario: Create Contact
When user create a new contact

@SmokeTest
Scenario: view contact details
When user view contact details

@FunctionalTest
Scenario: edit Contact details
When user edit Contact details

Scenario: delete a contact
When user delete a contact

@RegressionTest @SmokeTest
Scenario: user logout
When user logout 
