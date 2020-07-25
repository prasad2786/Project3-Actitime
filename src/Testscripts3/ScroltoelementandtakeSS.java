package Testscripts3;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import GENERIC3.*;

public class ScroltoelementandtakeSS extends genericopenurl
{
	@Test
	public void scrolltoelement() throws InterruptedException, IOException
	{
		WebElement ele=driver.findElement(By.xpath("//a[.='Sign Up']"));
		Thread.sleep(2000);
		Javascriptexecutor js=new Javascriptexecutor();
		
		js.scrolldown(driver, ele);
		Thread.sleep(2000);
		Screenshots sh=new Screenshots();
		sh.capturephoto(driver);
		
	}
}
