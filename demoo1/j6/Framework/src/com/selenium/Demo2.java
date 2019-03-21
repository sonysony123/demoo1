package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2

{ 

 public String baseUrl = "http://demo.guru99.com/test/radio.html";
 public WebDriver driver;
	
  @BeforeTest
  public void setBaseURL()
  {
	  System.setProperty("webdriver.gecko.driver","./src1/geckodriver.exe");	
	  driver = new FirefoxDriver();
	  driver.get(baseUrl);
	  
  }
	
@Test 
public void verifyHomePageTitle()
{
	String expectedTitle ="Radio Button & Check Box Demo";
	String actualTitle =driver.getTitle();
	Assert.assertEquals(actualTitle,expectedTitle);
}

@AfterTest


public void endSession()
{
	driver.quit();
	
}
}
