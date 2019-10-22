package com.cucumberpractice.selenium;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPage 
{   
	WebDriver driver=null;
	public void openbrowser(String browser)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		if(browser.equalsIgnoreCase("chrome"))
		{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
	}
	public void launchUrl(String url)
	{
		driver.get(url);
	}
	public void clickMyAccount()
	{
		driver.findElement(By.linkText("My Account")).click();
	}
	public void loginWithCredentials(String userName,String password)
	{
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(password);
	}
	public void loginWithDataTablecredentials(String d1,String d2)
	{
		driver.findElement(By.id("username")).sendKeys(d1);
		driver.findElement(By.id("password")).sendKeys(d2);
	}
	public void clickLoginbtn()
	{
		driver.findElement(By.name("login")).click();
	}
	public void verifyHomePage()
	{
		String exptxt=driver.findElement(By.xpath("//strong[contains(text(),'pavanoltraining')]")).getText();
		Assert.assertEquals("Text Verified", "pavanoltraining", exptxt);
		driver.close();
	}
	
	public void verifyLogin()
	{
		String errorTxt=driver.findElement(By.xpath("//strong[contains(text(),'ERROR')]")).getText();
		if(errorTxt.contains("Error"))
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
 