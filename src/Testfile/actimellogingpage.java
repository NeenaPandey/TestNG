package Testfile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POMfile.ActitimeLoginPage;

public class actimellogingpage {
	@Test
	public void actimelogingmethod() throws InterruptedException
	{
			System.setProperty("webdriver.chrome.driver","C:\\Data\\Java\\workspace-2\\driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("http://demo.actitime.com");
		ActitimeLoginPage login = new ActitimeLoginPage(driver);
		login.actitimethod();
		
	}
	

}
