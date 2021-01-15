package POMfile;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginlogout
{
	public WebDriver driver;
	
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement login;
	
	@FindBy(xpath="//a[@id='logoutLink']")
	private WebElement logout;
	
	
	public loginlogout (WebDriver driver)
	{
		
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
	}
	
	public void loginmethod() throws InterruptedException
	{
		username.sendKeys("admin");
		password.sendKeys("manager");
		login.click();
		Thread.sleep(2000);
	}
	
	public void logoutmethod()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",logout);
		
	}
		
			
			
			
			
		}
		
	
	
	
	
	
			
	


