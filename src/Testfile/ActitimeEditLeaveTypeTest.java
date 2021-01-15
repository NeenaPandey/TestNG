package Testfile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POMfile.ActitimeEditLeaveType;
import POMfile.loginlogout;

public class ActitimeEditLeaveTypeTest {


	@Test
	public void editleavetype() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Data\\Java\\workspace-2\\driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("http://demo.actitime.com");

		loginlogout login = new loginlogout(driver);
		login.loginmethod();

		//ActititmeLeavetypeLogign leavetype = new ActititmeLeavetypeLogign(driver);
		//leavetype.leavetypemethod("sickleave1");
		//Thread.sleep(3000);

		ActitimeEditLeaveType editleave = new ActitimeEditLeaveType(driver);
		editleave.Editleavetype("Sick Leave India","Sick Leave UK");
		Thread.sleep(8000);
		login.logoutmethod();
		driver.close();



	}

}
