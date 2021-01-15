package Testfile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POMfile.ActitimeEditcutomer;
import POMfile.loginlogout;

public class ActitimeEditCutomertest {

	@Test
	public void actitimeedit() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Data\\Java\\workspace-2\\driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("http://demo.actitime.com");
		
		loginlogout log = new loginlogout(driver);
		log.loginmethod();
		
		ActitimeEditcutomer edit = new ActitimeEditcutomer(driver);
		edit.editmethod();
		edit.CreateCustomer();
		Thread.sleep(2000);
		edit.customerEditMethod();
		edit.customerNameEditMethod();
		edit.customerNameClickMethod();
		
		log.logoutmethod();
	}
}
