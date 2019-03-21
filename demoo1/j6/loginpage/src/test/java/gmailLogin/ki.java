package gmailLogin;

import org.testng.annotations.Test;

public class ki extends Baseclass
{

@Test
public void script(String substring)

	{
	LoginPage l1 = new LoginPage(driver);
	l1.setusername("6361818729");
	l1.setpassword("qwerty123");
	l1.clickLogin();
  Baseclass.verifybytitle(driver," Realme 2 - Buy Realme 2 Online at Low Prices In India | Flipkart.com", substring);
	driver.close();
	}
}
