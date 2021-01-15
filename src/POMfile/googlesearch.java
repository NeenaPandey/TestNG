package POMfile;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class googlesearch 
{
@FindBy(xpath="(//span[@class='CwaK9'])[3]")
private WebElement agree;

@FindBy(xpath="//input[@title='Search']")
private WebElement searchtext;

@FindBy(xpath="(//span[text()='selenium'])[4]")
private List<WebElement> selenium;

public googlesearch(WebDriver driver)
{
PageFactory.initElements(driver, this);
}

public void searchmethod() throws InterruptedException
{
System.out.println(java.time.LocalDateTime.now());
agree.click();	
Thread.sleep(2000);
searchtext.sendKeys("selenium");
Thread.sleep(3000);
}
public void suggestion()
{
for(int i=0;i<selenium.size();i++)
{
	if
	
	(selenium.get(i).getText().equalsIgnoreCase("selenium webdrive"))
	{
		selenium.get(i).click();
	}
}
	
}
}




