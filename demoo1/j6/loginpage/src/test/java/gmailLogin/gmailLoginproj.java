package gmailLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class gmailLoginproj
{
	

    WebDriver driver;


    By username=By.xpath("//input[@id='identifierId']");
    By next1=By.xpath("//span[text()='Next']");
    By password=By.xpath("//input[@type='password']");
    By next2=By.xpath("//span[text()='Next']");
    
 public gmailLoginproj(WebDriver driver)
    {
    	this.driver=driver;
    }
public void loginToGmail(String userid)
   {
	 driver.findElement(username).sendKeys(userid);
	
   }
public void clickNext1()
	{
	driver.findElement(next1).click();
	
	}
public void loginToGmail1(String pass)
	{
	driver.findElement(password).sendKeys(pass);
	
	}
public void clickNext2()
	{
	
	driver.findElement(next2).click();
	
	}	

}





	


