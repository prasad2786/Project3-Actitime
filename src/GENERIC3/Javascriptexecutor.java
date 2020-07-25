package GENERIC3;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Javascriptexecutor 
{
	public void scrolldown(WebDriver driver,WebElement ele) throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Point loc=ele.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy("+ x +","+ y +")");
		Thread.sleep(2000);
	}
}
