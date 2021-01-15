package Testfile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POMfile.ActitimeDeleteLeaveType;
import POMfile.ActititmeLeavetypeLogign;
import POMfile.loginlogout;

public class ActitimeDeleteLeaveTypeTest {
	@Test
	public void deleteleavemethod() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Data\\Java\\workspace-2\\driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("http://demo.actitime.com");

		loginlogout log = new loginlogout(driver);
		log.loginmethod();

		ActitimeDeleteLeaveType deletetype = new ActitimeDeleteLeaveType(driver);
		deletetype.DeleteLeaveMethod("Sick Leave India1");
		Thread.sleep(4000);
		log.logoutmethod();
		driver.close();
	}

}
