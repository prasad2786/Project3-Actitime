package GENERIC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class genericopenurl 
{
	public WebDriver driver;
	static{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	}
//	@Parameters("browser")
	@BeforeTest
	public void openapp(String browser)
	{
	
	driver=new FirefoxDriver();
	
	driver.get("http://localhost/login.do");
	}
	
	@AfterTest
	public void closeapp()
	{
		driver.quit();
	}

}
