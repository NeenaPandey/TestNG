package POMfile;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeEditLeaveType {
	WebDriver driver;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement settinglink;

	@FindBy(xpath="//a[.='Leave Types']")
	private WebElement leavetype;

	@FindBy(xpath="//div[@class='leaveTypeNameText']/span")
	private List<WebElement> editLeaveType;

	@FindBy(xpath="//input[@id='inputDiv']")
	private WebElement NewLeaveTypeName;
	
	@FindBy(xpath="(//div[@class='applyButton'])[2]")
	private WebElement NewLeaveTypeSaveButton;

	
	public ActitimeEditLeaveType(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void Editleavetype(String OldLeaveName, String NewLeaveName) throws InterruptedException
	{	
		settinglink.click();
		Thread.sleep(2000);
		leavetype.click();
		Thread.sleep(2000);

		for (WebElement e : editLeaveType)
		{
			if (e.getText().equalsIgnoreCase(OldLeaveName))
			{
				System.out.println("Matched with:" + e.getText().toString());

				Actions builder = new Actions(driver);
				Action a1 = builder.moveToElement(e).click(e).build();
				Thread.sleep(4000);
				a1.perform();

				Thread.sleep(3000);

				NewLeaveTypeName.sendKeys(Keys.CONTROL,"a");
				NewLeaveTypeName.sendKeys(Keys.DELETE);
				Thread.sleep(3000);
				NewLeaveTypeName.sendKeys(NewLeaveName);
				Thread.sleep(4000);
				NewLeaveTypeSaveButton.click();
				break;
			}

		}

	}

}
