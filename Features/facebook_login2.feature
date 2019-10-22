Feature: Login Feature
Description: This feature test the login functionality of facebook

Scenario: Login with valid username and password
Given user navigate to facebook "https://www.facebook.com/"
When login with username and password

|username       |password        |
|nishusharma772@gmail.com|mylovenonu|
|nishusharma772@gmail.com|mylovenonu|

Then Login should be successfull
