package com.cucumber.stepDefinition;

import cucumber.api.java.en.Given;

public class stepDef_tags {
	@Given("^This is valid login test$")
	public void this_is_valid_login_test() throws Throwable {
	   System.out.println("valid_login_test");
	}

	@Given("^This is logout test$")
	public void this_is_logout_test() throws Throwable {
	  System.out.println("logout_test");
	}

	@Given("^This is search test$")
	public void this_is_search_test() throws Throwable {
	   System.out.println("search_test");
	}

	@Given("^This is advance search test$")
	public void this_is_advance_search_test() throws Throwable {
	   System.out.println("advance_search_test");
	}

	@Given("^This is postpaid recharge test$")
	public void this_is_postpaid_recharge_test() throws Throwable {
	   System.out.println("postpaid_recharge_test");
	}
}
