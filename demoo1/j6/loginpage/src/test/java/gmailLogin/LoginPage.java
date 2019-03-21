package gmailLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{

	@FindBy(xpath="//input[@class=\"_2zrpKA\"]")
	private WebElement untb;
	
	@FindBy(xpath="//input[@type=\"password\"]")
	private WebElement pwtb;
	
	@FindBy(xpath="//button[@class=\"_2AkmmA _1LctnI _7UHT_c\"]")
	private WebElement loginbtn;
	
	public LoginPage  (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
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
	 
	}

