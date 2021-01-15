package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
public	WebDriver driver;
@Test
public void softdemoMethod()
{
	System.setProperty("webdriver.chrome.driver","C:\\Data\\Java\\workspace-2\\driver\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.get("http://demo.actitime.com");
	String expectedtitle="neena";
	String actualtitle=driver.getTitle();
	SoftAssert s = new SoftAssert();
	s.assertEquals(actualtitle, expectedtitle);
	System.out.println("ABC COmpany");

}

		@Test
		public void muntu()
		{
			System.out.println("XYZ COmpany");
		}
}
