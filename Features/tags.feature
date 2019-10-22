@FunctionalTest
Feature: Tags functionality
Description : This feature is to test tags functionality

@SmokeTest
Scenario: Verify login
Given This is valid login test

@SmokeTest @End2EndTest
Scenario: Verify logout
Given This is logout test

@RegressionTest
Scenario: Verify search
Given This is search test

@RegressionTest
Scenario: Verify advance search
Given This is advance search test

Scenario: Verify prepaid rechange
Given This is valid login test

@End2EndTest
Scenario: Verify postpaid recharge
Given This is postpaid recharge test
