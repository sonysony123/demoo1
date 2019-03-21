package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage 
{
WebDriver driver = null;

@FindBy(xpath="//input[@class=\"_2zrpKA\"]")
private WebElement untb;


public boolean verifyLoginPage()
{
	Boolean result = false;
	result = untb.isDisplayed();
	return result;
	
}
 
 
	
}
