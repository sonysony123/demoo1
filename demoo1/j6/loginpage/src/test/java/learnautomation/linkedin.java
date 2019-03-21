package learnautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class linkedin 

{
	WebDriver driver;
@Test(dataProvider="testdata")
public void loginToLinkedin(String username,String password) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./sony/geckodriver.exe");
 driver = new FirefoxDriver();

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.get("https://www.linkedin.com/uas/login");
driver.findElement(By.id("username")).sendKeys(username);
driver.findElement(By.id("password")).sendKeys(password);
driver.findElement(By.xpath("//button[text()='Sign in']")).click();

Thread.sleep(5000);	
Assert.assertTrue(driver.getTitle().matches("LinkedIn"),"Invalid credentials");
System.out.println("Login successful");
}

	@DataProvider(name="testdata")
	public Object[][] passData()
	
	{
		
		
	Object[][] data=new Object[3][2];
	data[0][0]= "bhavyagowdru96@gmail.com";
	data[0][1]= "accion@2018labs";
	
	data[1][0]="admin";
	data[1][1]="demo123";
	
	data[2][0]="admin2";
	data[2][1]="demo1234";
	
	
	return data;
	
	
}
}
	

	
	

