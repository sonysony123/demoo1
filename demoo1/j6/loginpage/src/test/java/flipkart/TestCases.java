package flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCases
{
public static void main(String[] args)
{
	System.setProperty("webdriver.gecko.driver","./sony/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	loginflipkart login = new loginflipkart(driver);
	driver.get("https://www.flipkart.com/");
	login.typeUsername("6362818729");
	login.typePassword("qwerty123");
	login.clickLoginButton();
	String url =driver.getCurrentUrl();
	if(url.equals("https://www.flipkart.com/essentials-store?otracker=hp_bannerads_1_deskt-homep-2499f_cvb_7KDTQI9HML2I"))
	{
   System.out.println("Admin login is Successful -Passed");
	}
	else
	{
		System.out.println("Admin login is UnSuccessful -Failed");
	}
	driver.close();
}
}
