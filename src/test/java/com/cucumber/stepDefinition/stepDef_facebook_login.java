package com.cucumber.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class stepDef_facebook_login {

	WebDriver driver=null;
	@Given("^user navigate to facebook$")
	public void user_navigate_to_facebook() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}

	@When("^Enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_the_and(String arg1, String arg2) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(arg1);
		driver.findElement(By.id("pass")).sendKeys(arg2);
	}

	@And("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}

	@Then("^login should be unsuccessfull$")
	public void login_should_be_unsuccessfull() throws Throwable {
		if(driver.getCurrentUrl().equalsIgnoreCase(
				"https://www.facebook.com/login.php?login_attempt=1&lwv=110"))
		{
			Assert.assertTrue("Invalid Input-Error Page", true);
		}
		else
		{
			Assert.assertFalse(false);
		}
		driver.close();
	}
}
