Feature: Login Feature
Description: This feature test the login functionality

Scenario: Login with valid username and password
Given open the browser "chrome"
When user navigate to "http://practice.automationtesting.in/"
And user enter the username and password
|USERNAME       |PASSWORD        |
|pavanoltraining|Test@selenium123|
And click on login button
Then username should be display on homepage

