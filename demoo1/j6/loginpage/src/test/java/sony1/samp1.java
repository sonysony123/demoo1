package sony1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class samp1 {
	
	 public static void main(String[] args) {

	        RemoteWebDriver driver;
	        //driver = new FirefoxDriver();

	        System.setProperty("webdriver.gecko.driver", "./sony/geckodriver.exe");
	        driver = new FirefoxDriver();

	        driver.manage().window().maximize();
	        driver.get("http://my.naukri.com/manager/createacc2.php?othersrcp=16201&err=1");

	        WebElement single = driver.findElement(By.xpath("//*[@id='ugcourse']"));
	        Select dd = new Select(single);
	        String str = single.getText();
	        System.out.println(str);

	        //driver.quit();

}
}
