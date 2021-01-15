package POMfile;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeEditcutomer {
	public WebDriver driver;
	
	@FindBy(id="username")
	private WebElement username;

	@FindBy(name="pwd")
	private WebElement password;

	@FindBy(id="loginButton")
	private WebElement login;

	@FindBy(id="container_tasks")
	private WebElement task;

	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnew;

	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement createcustomer;

	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement EnterCustomerName;
	
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name']")
	private WebElement EnterCustomerNameEdit;
	
	@FindBy(xpath="(//div[.='Neena'])[2]")
	private WebElement customerName;

	@FindBy(xpath="//div[.='Neena'][@class='nameLabel']")
	private WebElement customerNameLabel;
	
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement customercreated;

	@FindBy(xpath="(//div[.='Neena'])[1]")
	private WebElement customerEditButton;

	@FindBy(xpath="(//div[.='Neena']/../..//div[@class='editButton'])[2]")
	private WebElement customerNameEditButton;
	
	@FindBy(xpath="(//div[@class='action'])[1]")
	private WebElement ActionsMenu;


	public ActitimeEditcutomer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver, this);
	}

	public void editmethod() throws InterruptedException

	{

		Thread.sleep(2000);
		task.click();
		Thread.sleep(2000);
	}
	
	public void CreateCustomer() throws InterruptedException

	{

		addnew.click();
		createcustomer.click();
		Thread.sleep(2000);
		EnterCustomerName.sendKeys("Neena");
		customercreated.click();
	}
	

	public void customerEditMethod() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", customerEditButton);
		Thread.sleep(2000);
	}

	public void customerNameEditMethod() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", customerNameEditButton);
		Thread.sleep(2000);
	}
	public void customerNameClickMethod() throws InterruptedException
	{	
		Actions objCustomer = new Actions(driver);
		objCustomer.moveToElement(customerNameLabel).build().perform();
		objCustomer.click(customerNameLabel);
		Thread.sleep(2000);
		customerNameLabel.click();
		Thread.sleep(2000);
		EnterCustomerNameEdit.click();
		Thread.sleep(2000);
		System.out.println(EnterCustomerNameEdit.getText());
		EnterCustomerNameEdit.sendKeys(Keys.CONTROL,"a");
		EnterCustomerNameEdit.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		EnterCustomerNameEdit.sendKeys("Neena Pandey");
		ActionsMenu.click();
		
	}

}
