package gmailLogin;

import static org.testng.Assert.assertEquals;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass
{
static WebDriver driver;

   static
{
	System.setProperty("webdriver.gecko.driver","./sony/geckodriver.exe");
	driver= new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebDriverWait wait = new WebDriverWait(driver,10);
	
}
	
   @BeforeClass
   public void openFlipkart()
   {
	   driver.get("https://www.flipkart.com/");
	   
   }
   
 
   @AfterClass
   public void closeFlipkart()
   {
	   driver.close();
   }
   public static void verifybytitle(WebDriver driver,String etitle,String substring)
   
   {
	WebDriverWait wait =new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.titleContains(substring));
	String atitle=driver.getTitle();
	assertEquals(atitle,etitle);
	
   }


}
   
   
