package flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginflipkart 

{
	WebDriver driver;
By User = By.xpath("//input[@class=\\\"_2zrpKA\\\"]");
By Password = By.xpath("//input[@type=\\\"password\\\"]");
By LoginButton = By.xpath("//button[@class=\\\"_2AkmmA _1LctnI _7UHT_c\\\"]");

public loginflipkart(WebDriver driver)
{
	this.driver =driver;
	
}
public void typeUsername(String Uname) {
	driver.findElement(User).sendKeys(Uname);
}

public void typePassword(String Pwd) {
	driver.findElement(Password).sendKeys(Pwd);
	
}
public void clickLoginButton()
{
	driver.findElement(LoginButton).click();
	
}
}
