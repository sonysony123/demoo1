package sony1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  

  	System.setProperty("webdriver.gecko.driver","./sony/geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      
   driver.get("https://id.atlassian.com/login");
 
 //username 
   driver.findElement(By.cssSelector("input[id='username']")).sendKeys("bhavya.channappagowda@accionlabs.com");
   		
   //continue
   driver.findElement(By.cssSelector("button[id='login-submit']")).click();
   Thread.sleep(1500);

   //password		
   driver.findElement(By.cssSelector("input[id='password']")).sendKeys("sonysony123");
   		
   //login 
   driver.findElement(By.cssSelector("button[id='login-submit']")).click();
   		 
   driver.findElement(By.xpath("//span[contains(@ role,'img')]")).click();


   
  }
  
}
