package sony1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class creatinggmail
{
	public static void main(String[] args) throws InterruptedException
	
	{
		String URL ="https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin";
		System.setProperty("webdriver.gecko.driver","./sony/geckodriver.exe");
		WebDriver driver=new  FirefoxDriver();
		driver.get(URL);
		
		//email
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("bhavya.channappagowda@accionlabs.com");
		
		//Next
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(1000);
		
		//password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("accion@2018labs");
		
		//Next1
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		//google app click
		driver.findElement(By.xpath("//a[@href='https://www.google.co.in/intl/en/about/products']")).click();
		
		//gmail app
		driver.findElement(By.xpath("//span[text()='Gmail']")).click();
		Thread.sleep(1000);
		
		//compose
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		Thread.sleep(3000);
		
		//To receipts
	      driver.findElement(By.xpath("//textarea[@role='combobox']")).sendKeys("lakshmi.shetty@accionlabs.com");
	      
	  	Thread.sleep(2500);
	     //subject
	      driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("Todays Status");
	  	Thread.sleep(3000);
	      
	      //body
	      driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("1) Integrated Gmail through automation\n"
	      		+ "2) No Issue\n"
	      		+ "3) whats tomorrows task?\n");
	      
	      driver.findElement(By.xpath("//div[text()='Send']")).click();
	      
	      
	      
	      
	      
	      
	
	}
	
}
