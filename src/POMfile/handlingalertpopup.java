package POMfile;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class handlingalertpopup {
@FindBy(name="username")
private WebElement username;

@FindBy(name="pwd")
private WebElement password;

@FindBy(id="loginButton")
private WebElement login;

@FindBy(id="container_tasks")
private WebElement task;

@FindBy(xpath="//div[@class='title ellipsis']")
private WebElement addnew;

@FindBy(xpath="//div[@class='item createNewCustomer']")
private WebElement newcustomer;

@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
private WebElement customername;

@FindBy(xpath="//div[@class='greyButton cancelBtn']")
private WebElement cancel;


public handlingalertpopup(WebDriver driver)
{
PageFactory.initElements(driver, this);
}

public void handlemehod(WebDriver driver) throws InterruptedException
{
username.sendKeys("admin");	
password.sendKeys("manager");
login.click();
Thread.sleep(3000);
task.click();
addnew.click();
newcustomer.click();
Thread.sleep(2000);
customername.sendKeys("abcde");
cancel.click();

Alert al=driver.switchTo().alert();
al.accept();
}


}
