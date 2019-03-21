package gmailLogin;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class verifyGmailLogin 
{

	
@Test
	
public void verifyValidLogin() throws InterruptedException
	{
	     System.setProperty("webdriver.gecko.driver","./sony/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&flowName=GlifWebSignIn&flowEntry=AddSession");
		 gmailLoginproj login=new gmailLoginproj (driver);		 
		 
		 login.loginToGmail("bhavya.channappagowda@accionlabs.com");
		 Thread.sleep(2000);
		 login.clickNext1();
		 
		 Thread.sleep(2000);
		 login.loginToGmail1("accion@2018labs");
		 login.clickNext2();
		 driver.quit();
		 
		 
		 
		 
		 
    	}


}

	

