package Testfile;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import POMfile.googlesearch;

public class googlepage {
	
	@Test
	public void actimelogingmethod() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Data\\Java\\workspace-2\\driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		googlesearch search = new googlesearch(driver);
		System.out.println(java.time.LocalDateTime.now());
		Thread.sleep(5000);
		search.searchmethod();
		search.suggestion();
	}
}
