package POMfile;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeDeleteCustomer {
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(id="loginButton")
	private WebElement login;
	
	@FindBy(id="container_tasks")
	private WebElement task;
	

	
	@FindBy(xpath="//div[.='All Customers']")
	private WebElement allcustomers;
	
	@FindBy(xpath="//div[@title='Android calibration']")
	
	private WebElement anroid;
	
	@FindBy(xpath="(//div[@class='actionButton'])[9]")
	private WebElement actionbutton;
	
	@FindBy(xpath="(//div[.='Delete'])[4]")
	private WebElement delete;
	
	@FindBy(xpath="(//div[@class='hideButton_panelContainer'])[3]")
	private WebElement crossbutton;
	

	@FindBy(xpath="//a[@class='logout']")
	private WebElement logout;

	
	
	
	public ActitimeDeleteCustomer(WebDriver driver)
	{
	//this.driver = driver;
	PageFactory.initElements(driver, this);
	
	}
	
	public void editmethod() throws InterruptedException
	{
		username.sendKeys("admin");
		password.sendKeys("manager");
		login.click();
		Thread.sleep(2000);
		task.click();
		allcustomers.click();
		Thread.sleep(2000);
		anroid.click();
		Thread.sleep(2000);
		actionbutton.click();
		delete.click();
		crossbutton.click();
		
	
	}
	
	
	
	public void logoutmethod()
	{
		logout.click();

	
	}
		
		
	}

	
	
	
	
	
	


