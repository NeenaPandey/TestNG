package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertclassDemo 
{
	public WebDriver diver;
	@Test
	
	public void democlass() 
	{
System.setProperty("webdriver.chrome.driver","C:\\Data\\Java\\workspace-2\\driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("http://demo.actitime.com");
		String expectedtitle="actiTIME - Login";
		String actualtitle =driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle);	//Assert.assertNotEquals
		System.out.println("neena");
	
	
	}
	@Test
	public void Muntu() {
		System.out.println("Ananya");
	}
	
		
	
}
	
