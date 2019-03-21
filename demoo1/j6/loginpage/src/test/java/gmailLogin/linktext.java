package gmailLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linktext
{
	public static void main(String[] args)
	{
		
	System.setProperty("webdriver.gecko.driver","./sony/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	
	String baseUrl = "http://demo.guru99.com/test/accessing-link.html";					
   			
    		
    driver.get(baseUrl);					
    driver.findElement(By.partialLinkText("here")).click();					
    System.out.println("Title of page is: " + driver.getTitle());							
    driver.quit();			
}		
}

