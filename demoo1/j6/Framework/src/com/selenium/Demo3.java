package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.gecko.driver","./src1/geckodriver.exe");	
	    WebDriver driver = new FirefoxDriver();

	  
	   driver.manage().window().maximize();
	  
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	   driver.get("https://www.gmail.com");
	   
	/*CASE- 1. Both User name and Password are entered correctly. 
	Check whether Email field exists or not */
	    try
	        {
	          WebElement a1 = driver.findElement(By.id("identifierId"));
	          System.out.println("---------Emaild exists --------------\n-----------------------");
	          a1.sendKeys("bhavya.channappagowda@accionlabs.com");
	         }
	    catch(Throwable e)
	         {
	         System.out.println("Emaild not found: " + e.getMessage());
	         }
	   
//Next
	    WebElement next = driver.findElement(By.xpath("//span[ text()= 'Next']"));
	    next.click();
	    
	    //Check whether Password field exists or not
	    Thread.sleep(2000);
	     try
	        {
		 WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	         System.out.println("----------Passwordd exits ------------\n-----------------------");
	         password.sendKeys("accion@2018labs");
	        }
	    catch(Throwable e)
	        {
		 System.out.println("Password not found: " + e.getMessage());
	        }
	     
//next2
	    WebElement next2 = driver.findElement( By.xpath("//span[text()='Next']"));
	   	 next2.click();
	    
	    WebElement signout = driver.findElement(By.xpath(""));
	    driver.close();
	  
	   
	    }
}






