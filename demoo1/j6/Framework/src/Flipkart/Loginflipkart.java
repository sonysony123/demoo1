package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginflipkart 
{
 

	@FindBy(xpath="//input[@class=\"_2zrpKA\"]")
	private WebElement untb;
	
	@FindBy(xpath="//input[@type=\"password\"]")
	private WebElement pwtb;
	
	@FindBy(xpath="//button[@class=\"_2AkmmA _1LctnI _7UHT_c\"]")
	private WebElement loginbtn;

	private WebDriver driver;
	
	public void setusername(String uid)
	{

	untb.sendKeys(uid);
	}
	public void setpassword(String pwd)
	{
		pwtb.sendKeys(pwd);
	}	
	public void clickLogin()
	{
	loginbtn.click();
	
	}
	public void Loginflipkart  (WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this);
		
	}
}
