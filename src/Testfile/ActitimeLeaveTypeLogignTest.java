package Testfile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POMfile.ActititmeLeavetypeLogign;
import POMfile.loginlogout;

public class ActitimeLeaveTypeLogignTest {
	@Test
	public void leavetype() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Data\\Java\\workspace-2\\driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("http://demo.actitime.com");

		loginlogout log = new loginlogout(driver);
		log.loginmethod();

		ActititmeLeavetypeLogign type = new ActititmeLeavetypeLogign(driver);
		type.leavetypemethod("Sick Leave India2");
		Thread.sleep(4000);

		type.leavetypemethod("Sick Leave India3");
		Thread.sleep(4000);
		log.logoutmethod();
		driver.close();
	}
}
