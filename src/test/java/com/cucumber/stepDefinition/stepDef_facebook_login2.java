package com.cucumber.stepDefinition;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDef_facebook_login2 {
    
	WebDriver driver=null;
	@Given("^user navigate to facebook \"([^\"]*)\"$")
	public void user_navigate_to_facebook(String url) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	}

	@When("^login with username and password$")
	public void login_with_username_and_password(DataTable credentials) throws Throwable
	{   
		for(Map<String, String> data :credentials.asMaps(String.class, String.class))
		{
		driver.findElement(By.id("email")).sendKeys(data.get("username"));
		driver.findElement(By.id("pass")).sendKeys(data.get("password"));
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		}
	}

	@Then("^Login should be successfull$")
	public void login_should_be_successfull() throws Throwable {
	System.out.println("success");
		driver.close();
	}
}
