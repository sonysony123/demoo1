package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginScenarios
{
 @Test
 public void verifyApplicationTitle()
 {  
	 System.setProperty("webdriver.gecko.driver","./src1/geckodriver.exe");
 
	 WebDriver driver = new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get("https://learn-automation.com/");
	 String atitle = driver.getTitle();
	 
	 System.out.println("Title is" +atitle);
	 String etitle = "Selenium Webdriver Tutorials";
	 Assert.assertTrue(atitle.contains("Selenium Webdriver Tutorials"));
	 
	 System.out.println("Test completed");
 }

}
