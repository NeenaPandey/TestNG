package POMfile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ActitimeLoginPage {

	@FindBy(name="username")
	private WebElement username;
	@FindBy(name="pwd")
	private WebElement password;
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement checkbox;
	@FindBy(id="loginButton")
	private WebElement loginbutton;
	@FindBy(xpath="//a[.='Forgot your password?']")
	private WebElement forgottenpassword;
	@FindBy(xpath="//a[.='actiTIME Inc.']")
	private WebElement actitimelink;
	@FindBy(xpath="//a[@class='content tasks']")
	private WebElement task;
	@FindBy(xpath="//div[@class='title ellipsis']")
	private WebElement addnew;
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement createnewcustomer;
	//@FindBy(xpath="//input[@placeholder='Enter Customer Name'][2]")
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement customername;
	@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_tips']")
	private WebElement logout;
	
	public ActitimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void actitimethod() throws InterruptedException

	{
		username.sendKeys("admin");
		password.sendKeys("manager");
		checkbox.click();
		loginbutton.click();
		Thread.sleep(2000);
		task.click();
		addnew.click();
		createnewcustomer.click();
		Thread.sleep(2000);
		customername.sendKeys("muntu");
		

	}

	public void actitimeforgot()
	{
		forgottenpassword.click();
	}

	public void actitimelink()
	{
		actitimelink.click();
	}

	public void logOutlink()
	{
		logout.click();
	}

}
