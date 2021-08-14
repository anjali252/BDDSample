Feature: CRM Login Feature

#Scenario: Free CRM Login test SCenario
#Given User is already on login page
##When User enters credentials
#
##Parameterization without example keywords
#When User enters "agrawalanjali65@gmail.com" and "Anjali25"
#Then User is on  Home Page
#Then close the browser

#Scenario Outline: Free CRM Login test SCenario using Parameterzating with examples keyword
#Given User is already on login page
#When User enters "<username>" and "<password>"
#Then User is on  Home Page
#Then close the browser
#
#Examples:
#|username|password|
#|agrawalanjali65@gmail.com|Anjali25|
#|khushi@gmail.com|Khushi24|

#Scenario: Free CRM Login test SCenario with data tables without table header
#Given User is already on login page
#When User enters credentials
#|agrawalanjali65@gmail.com|Anjali25|
#Then User is on  Home Page
#Then close the browser

Scenario: Free CRM Login test SCenario with data tables with table header
Given User is already on login page
When User enters credentials
|username|password|
|agrawalanjali65@gmail.com|Anjali25|
Then User is on  Home Page
Then close the browser