package Testscripts3;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Runproperties 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		Properties file=new Properties();
		
		file.load(new FileInputStream("./run.properties"));
		
		String url= file.getProperty("url");
		String uname=file.getProperty("username");
		String pwd=file.getProperty("password");
		
		driver.get(url);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pwd);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		
	}
}
