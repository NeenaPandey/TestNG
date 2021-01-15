package POMfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimecreatetTypeOfWork {

	public WebDriver driver;

	@FindBy(id="username")
	private WebElement username;

	@FindBy(name="pwd")
	private WebElement password;

	@FindBy(id="loginButton")
	private WebElement login;

	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement menuicon;

	@FindBy(xpath="(//a[@class='item_link'])[5]")
	private WebElement typeofwork;

	@FindBy(xpath="//span[@unselectable='on']")
	private WebElement createtypeofwork;

	@FindBy(xpath="//input[@name='name']")
	private WebElement workname;

	@FindBy(xpath="//input[@type='submit']")
	private WebElement create;
	
	@FindBy(id="DiscardChangesButton")
	private WebElement CancelAndLeaveButton;

	@FindBy(xpath="//a[@id='logoutLink']")
	private WebElement logout;


	public	ActitimecreatetTypeOfWork(WebDriver driver)
	{

		this.driver= driver;
		PageFactory.initElements(driver, this);

	}

	public void typeofwork() throws InterruptedException
	{
		username.sendKeys("admin");	
		password.sendKeys("manager");
		login.click();
		Thread.sleep(2000);
		menuicon.click();
		Thread.sleep(2000);

		typeofwork.click();
		createtypeofwork.click();
		Thread.sleep(2000);
	}
	public void popup()
	{
		workname.sendKeys("abc company");
		create.click();

	}

	public void CancelAndLeave()
	{
		CancelAndLeaveButton.click();;

	}

	public void logout()
	{


		logout.click();


	}





}