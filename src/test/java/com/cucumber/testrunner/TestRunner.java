package com.cucumber.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:/JAVAWORKSPACE/CucumberPractice1/Features/hooks.feature", glue = "com.cucumber.stepDefinition", plugin = {
		"pretty", "html:test-output", "json:json_output/cucumber.json",
		"junit:junit_output/cucumber.xml" }, dryRun = false, monochrome = true, strict = false
// tags= {"~@FunctionalTest"}
)
public class TestRunner {

}
