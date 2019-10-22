package com.cucumber.stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
								
public class BaseHooks {
	@Before(order=0)
	public void setUp() {
		System.out.println("########### BEFORE EVERY SCENARIO ############");
	}

	@Before(value="@Second",order=1)
	public void beforeFirst()
	{
		System.out.println("----------------------------------------------");
	}
	
	@After(value="@Second",order=1)
	public void AfterFirst()
	{
		System.out.println("----------------------------------------------");
	}
	@After(order=0)
	public void tearDown() {
		System.out.println("***********AFTER EVERY SCENARIO ************");
	}
}
