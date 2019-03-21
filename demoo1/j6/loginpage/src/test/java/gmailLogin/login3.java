package gmailLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login3
{
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./sony/geckodriver.exe");
	  	WebDriver driver = new FirefoxDriver();
	  	String baseUrl= "http://demo.guru99.com/selenium/deprecated.html";
        driver.get(baseUrl);
        driver.switchTo().frame("classFrame");
        driver.findElement(By.linkText("Deprecated")).click();
        driver.close(); 
    }
}


