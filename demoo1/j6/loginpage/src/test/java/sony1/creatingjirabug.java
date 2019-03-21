package sony1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class creatingjirabug {
	
	
		public static void main(String[] args) throws InterruptedException {

			String URL = "https://accionqa.atlassian.net/secure/Dashboard.jspa";
			System.setProperty("webdriver.gecko.driver", "./sony/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get(URL);
			
	//click
			driver.findElement(By.xpath("//a[@class='css-t7y1k0']")).click();
			
			
	//username
		
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("bhavyagowdru96@gmail.com");

	//continue
			driver.findElement(By.xpath("//*[@id='login-submit']")).click();

			Thread.sleep(1500);
	//password
			driver.findElement(By.xpath("//*[@id='password']")).sendKeys("sonysony420");

	//login
			driver.findElement(By.xpath("//button[@id='login-submit']")).click();
			Thread.sleep(15000);
	//create
			driver.findElement(By.xpath("//span[@aria-label='Create (c)']")).click();
			
			Thread.sleep(3000);

			
						
			
	//summary
   driver.findElement(By.name("summary")).sendKeys("Error msg is not showing for valid data");
   Thread.sleep(3000);
   
  //description
   driver.findElement(By.id("description")).sendKeys(" *Steps To Reproduce:*\n"
   		+ "1) Go to https://www.facebook.com/.\n"
   		+ "2) Enter valid email-id in email field\n"
   		+ "3)  Enter invalid password in password field\n"   
   		+ "4)  Click on login button\n"
   		+ " *Expected Result:* Facebook should through an error message\n"
   		
   		+ " *Actual Result:* Error message is not displayed for invalid data\n");
   
   //Linked Issue
   Thread.sleep(3000);
   
   Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='issuelinks-linktype']")));
   dropdown.selectByIndex(2);	
		
//Assignee		
		
 driver.findElement(By.xpath("//a[@href='#assignee']")).click();
 //driver.findElement(By.xpath("//input[@id='create-issue-submit']")).click();
   
 
//driver.close();
 
 
		}
  

	}

	
	


