package GENERIC3;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actionsgeneric 
{
	
	public void rightclick(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	
	public void doubleclick(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	public void hover(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		
	}
	
	public void openinnewtab(WebElement ele,WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.sendKeys(Keys.CONTROL).click(ele).perform();
	}
	
	
}
