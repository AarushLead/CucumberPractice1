package com.cucumber.stepDefinition;

import java.util.List;
import java.util.Map;

import com.cucumberpractice.selenium.LoginPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDef_login
{  
	LoginPage lp=new LoginPage();
	
	@Given("^open the browser \"([^\"]*)\"$")
	public void open_the_browser(String browser) throws Throwable {
	  lp.openbrowser(browser);
	}

	@When("^user navigate to \"([^\"]*)\"$")
	public void user_navigate_to(String url) throws Throwable {
	 lp.launchUrl(url);
	 lp.clickMyAccount();	
	}
	
	@And("^user enter the username and password$")
	public void user_enter_the_username_and_password(DataTable credentials) throws Throwable {
		List<Map<String, String>> data = credentials.asMaps(String.class, String.class);
	    lp.loginWithDataTablecredentials(data.get(0).get("USERNAME"), data.get(0).get("PASSWORD"));
	}

	@And("^click on login button$")
	public void click_on_login_button() throws Throwable {
		 lp.clickLoginbtn();
	}
	@Then("^username should be display on homepage$")
	public void username_should_be_display_on_homepage() throws Throwable {
	  lp.verifyHomePage();
	}
}
