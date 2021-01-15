package POMfile;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActititmeLeavetypeLogign {
	
	public WebDriver driver;
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement settinglink;
	
	@FindBy(xpath="//a[.='Leave Types']")
	private WebElement leavetype;
	
	@FindBy(xpath="//span[.='Create Leave Type']")
	private WebElement createleavetype;
	
	@FindBy(id="leaveTypeLightBox_nameField")
	private WebElement leavetypename;
	
	@FindBy(xpath="//div[@class='buttonIcon']")
	private WebElement createdleavetype;
	

	public  ActititmeLeavetypeLogign(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void leavetypemethod(String LeaveType) throws InterruptedException
	{
		settinglink.click();
		Thread.sleep(2000);
		leavetype.click();
		Thread.sleep(2000);
		createleavetype.click();
		Thread.sleep(2000);
		leavetypename.sendKeys(LeaveType);
		createdleavetype.click();
	}
}
	


