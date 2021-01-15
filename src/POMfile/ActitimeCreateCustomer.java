package POMfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeCreateCustomer {
	WebDriver driver;
	@FindBy(id="container_tasks")
	private WebElement taskbutton;
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addNewbutton;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement NewCustomer;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement customerName;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createCustomer;
	
	public ActitimeCreateCustomer(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createCustomerMethod() throws InterruptedException
	{
		taskbutton.click();
		addNewbutton.click();
		NewCustomer.click();
		Thread.sleep(2000);
		customerName.sendKeys("abcd");
		createCustomer.click();
	}
	

}
