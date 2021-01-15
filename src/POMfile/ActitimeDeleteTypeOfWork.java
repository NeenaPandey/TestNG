package POMfile;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeDeleteTypeOfWork {
	WebDriver driver;
	
	
	@FindBy(xpath="//th[@class='listtblcolheader lastInRow']")
	private WebElement deleteRow;
	
	public void typeOfWorkDelete(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void workdeletemethod() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", deleteRow);		
			
				
		
		Alert al =driver.switchTo().alert();
		al.accept();
		
	}
	
}


