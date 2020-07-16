package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitime {

	
		@FindBy(id="username")
		private WebElement uname;
		
		@FindBy(name="pwd")
		private WebElement pwd;
		
		@FindBy(xpath="//div[.='Login ']")
		private WebElement login;
		
		public Actitime(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void setunname(String s1)
		{
			uname.sendKeys(s1);
		}
		
		public void setpwd(String s1)
		{
			pwd.sendKeys(s1);
		}
		
		public void click()
		{
			login.click();
		}
	

}
