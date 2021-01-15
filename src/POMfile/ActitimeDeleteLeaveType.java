package POMfile;



import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ActitimeDeleteLeaveType
{
	WebDriver driver;

	//@FindBy(xpath="//div[@class='leaveTypeNameText'][.='sickleave']/span/../../../../../../td[7]")
	@FindBy(xpath="//tr[@class='leaveTypeListRow inUse']")
	private List<WebElement> LeaveTypeRow;

	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement settinglink;
	
	@FindBy(xpath="//a[.='Leave Types']")
	private WebElement leavetype;
	
	public ActitimeDeleteLeaveType(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void DeleteLeaveMethod(String LeaveType) throws InterruptedException
	{
		
		settinglink.click();
		Thread.sleep(2000);
		leavetype.click();
		Thread.sleep(2000);
		
		WebElement DeleteRow = driver.findElement(By.xpath("//div[@class='leaveTypeNameText'][.='"+ LeaveType +"']/span/../../../../../../td[7]"));
		Actions builder = new Actions(driver);
		Action a1 = builder.moveToElement(DeleteRow).click(DeleteRow).build();
		Thread.sleep(2000);
		a1.perform();
		Thread.sleep(4000);
		Alert al = driver.switchTo().alert();
		al.accept();
		
		
		/*
		for (int i=1; i <= LeaveTypeRow.size();i++)
		{
			WebElement TableRow = driver.findElement(By.xpath("(//tr[@class='leaveTypeListRow']/td[3])["+ i +"]"));
			
			if (TableRow.getText().equalsIgnoreCase(LeaveType))
			{
				WebElement DeleteRow = driver.findElement(By.xpath("(//tr[@class='leaveTypeListRow']/td[7])["+ i +"]"));
				
				Actions builder = new Actions(driver);
				Action a1 = builder.moveToElement(DeleteRow).click(DeleteRow).build();
				Thread.sleep(2000);
				a1.perform();
				Thread.sleep(4000);
				Alert al = driver.switchTo().alert();
				al.accept();
				break;
			}

		}
		 */
		

	}

}



