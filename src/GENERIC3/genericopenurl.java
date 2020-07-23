package GENERIC3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class genericopenurl 
{
	public WebDriver driver;
	static{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	}

	@BeforeTest
	public void openapp() throws InterruptedException
	{
	
	driver=new FirefoxDriver();
	
	driver.get("http://flipkart.com");
	
	Thread.sleep(3000);
	}
	
	@AfterTest
	public void closeapp()
	{
		driver.quit();
	}

}
