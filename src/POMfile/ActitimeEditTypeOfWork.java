package POMfile;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeEditTypeOfWork {
	public WebDriver driver;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement menuicon;
	
	@FindBy(xpath="(//a[@class='item_link'])[5]")
	private WebElement typeofwork;
	
	@FindBy(xpath="//span[@unselectable='on']")
	private WebElement createtypeofwork;
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement workname;
	
	@FindBy(xpath="//input[@value='   Create Type of Work   ']")
	private WebElement savework;
	
	
	@FindBy(xpath="//input[@value='   Save Changes   ']")
	private WebElement saveworkChanges;
	
	
	@FindBy(xpath="//input[@onchange='nameChanged(this);']")
	private WebElement editTypeOfWork;
	
	
	@FindBy(xpath="//a[@id='logoutLink']")
	private WebElement logout;
	
	
	public ActitimeEditTypeOfWork(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void typeOfworkmethod(String strworkname) throws InterruptedException
	{
		Thread.sleep(2000);
		menuicon.click();
		Thread.sleep(2000);

		typeofwork.click();
		createtypeofwork.click();
		Thread.sleep(2000);
		workname.sendKeys(strworkname);

		savework.click();
		
		List<WebElement> WorkList = driver.findElements(By.tagName("a"));
				
		for (WebElement e : WorkList)
		{
			if (e.getText().equalsIgnoreCase(strworkname))
			{
				System.out.println("Matched with:" + e.getText().toString());
				
				Actions builder = new Actions(driver);
				Action a1 = builder.moveToElement(e).click(e).build();
				Thread.sleep(8000);
				a1.perform();
				break;
			}
			
		}
	}
	
	public void editwork(String strworkname) throws InterruptedException
	{
		editTypeOfWork.sendKeys(Keys.CONTROL,"a");
		editTypeOfWork.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		editTypeOfWork.sendKeys(strworkname);
		Thread.sleep(2000);
		saveworkChanges.click();
	}
	
	public void logout()
	{
		logout.click();
	}

}
