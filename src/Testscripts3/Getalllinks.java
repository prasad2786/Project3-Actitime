package Testscripts3;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GENERIC3.*;



public class Getalllinks extends genericopenurl
{
	@Test
	public void getlinks() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		List<WebElement> l1= driver.findElements(By.tagName("a"));
		int count = l1.size();
		System.out.println(count);
		Excels e1=new Excels();
		
		for (int i = 0; i < count; i++) 
		{
			
			String data=l1.get(i).getText();
			e1.writedata("Sheet1",i,data);
		}
		
		Thread.sleep(3000);
		
	}
}
