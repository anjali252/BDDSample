Feature: Google Page Search
This feature is for verifying google page

Scenario: Search Java Tutorial
Given I launch google page
When I search Java Tutorial
Then Should display Java result page
And Close the browser

Scenario: Search Selenium Tutorial
Given I launch google page
When I search Selenium Tutorial
Then Should display Selenium result page
And Close the browser