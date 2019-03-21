package sony1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class app2Test {
  @Test
  public void f()
  
  {
	  System.setProperty("webdriver.gecko.driver","./sony/geckodriver.exe");
	      WebDriver driver = new FirefoxDriver();
	      
	      driver.get("https://www.atlassian.com/try/cloud/signup?bundle=jira-software");
	      WebElement emid = driver.findElement(By.cssSelector("input[id='accountName']")); 
	      emid.sendKeys("bhavyacgowdaa");
	      
	      
	      WebElement fn= driver.findElement(By.cssSelector("input[id='firstName']")); 
	      fn.sendKeys("bhavyac");
	      
	      WebElement ln = driver.findElement(By.cssSelector("input[id='lastName']")); 
	      ln.sendKeys("gowda");
	      
	      
	      WebElement mail= driver.findElement(By.cssSelector("input[id='email']")); 
	      mail.sendKeys("bhavya.channappagowda@accionlabs.com");
	      
	      
	      
	      WebElement pwd= driver.findElement(By.cssSelector("input[id='aod-password']")); 
	      pwd.sendKeys("accion@2018labs");
	      
	      
	   
	      
	  }
	}

 
