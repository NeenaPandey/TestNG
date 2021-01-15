package Testfile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POMfile.ActitimecreatetTypeOfWork;
import POMfile.ActitimeDeleteTypeOfWork;

public class ActitimeDeleteTypeOfWorktest {
	@Test
	public void deletetypeofwork() throws InterruptedException

	{
		System.setProperty("webdriver.chrome.driver","C:\\Data\\Java\\workspace-2\\driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("http://demo.actitime.com");

		ActitimecreatetTypeOfWork work = new 	ActitimecreatetTypeOfWork(driver);
		work.typeofwork();
		work.popup();

		ActitimeDeleteTypeOfWork work1 = new ActitimeDeleteTypeOfWork();
		work1.workdeletemethod();
		
	}
}
