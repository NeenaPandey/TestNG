package Testfile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import POMfile.ActitimeEditTypeOfWork;
import POMfile.loginlogout;

public class ActitimeEditTypeOfWorktest {
	@Test
	public void Editmethod() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Data\\Java\\workspace-2\\driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("http://demo.actitime.com");
		
		loginlogout log = new loginlogout(driver);
		log.loginmethod();
		
		ActitimeEditTypeOfWork editwork = new ActitimeEditTypeOfWork(driver);
		
		editwork.typeOfworkmethod("abc10 company");
		editwork.editwork("xyz10 company");
		
		log.logoutmethod();
		driver.close();
	}

}
