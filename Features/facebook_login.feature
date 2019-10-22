Feature: Login Feature
Description: This feature test the login functionality of facebook

Scenario Outline: Login with valid username and password
Given user navigate to facebook
When Enter the "<username>" and "<password>"
And  user click on login button
Then login should be unsuccessfull

Examples:
|username       |password        |
|shobhitsharma61@gmail.com|aarush@123|
|pavanoltraining|Test@selenium123|
|pavanoltraining|selenium@123|
|pavanoltraining|Test@selenium123|