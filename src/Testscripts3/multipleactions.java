package Testscripts3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import GENERIC3.*;

public class multipleactions extends genericopenurl
{
	@Test
	public void test() throws InterruptedException
	{
		Actions builder=new Actions(driver);
		WebElement ele=driver.findElement(By.id("email"));
		Action actionseries=builder.moveToElement(ele).click().keyDown(ele,Keys.SHIFT).
				sendKeys(ele,"hello").keyUp(ele,Keys.SHIFT).doubleClick(ele).contextClick().build();
		
		actionseries.perform();
		
		Thread.sleep(5000);
	}
	
}
