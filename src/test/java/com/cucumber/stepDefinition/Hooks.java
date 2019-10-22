package com.cucumber.stepDefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Hooks
{
	@Given("^This is First step$")
	public void this_is_First_step() throws Throwable {
	  System.out.println("This is First Step");
	}

	@When("^This is second step$")
	public void this_is_second_step() throws Throwable {
		System.out.println("This is second Step");
	}

	@Then("^This is Third step$")
	public void this_is_Third_step() throws Throwable {
		System.out.println("This is third Step");
	}
}
