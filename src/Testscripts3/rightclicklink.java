package Testscripts3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import GENERIC3.*;

public class rightclicklink 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		WebElement ele=driver.findElement(By.xpath("//a[.='Forgotten account?']"));
		
		Actionsgeneric a1=new Actionsgeneric();
		a1.rightclick(driver, ele);
		
	}
}
