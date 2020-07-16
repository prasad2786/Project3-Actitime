package Testscripts;

import org.testng.annotations.Test;

import POM.Actitime;
import POM.Entertimetrack;
import GENERIC.*;


public class Testlogin extends genericopenurl
{

	@Test
	public void test1() throws InterruptedException 
	{
		
		Actitime p1=new Actitime(driver);
		
		p1.setunname("admin");
		p1.setpwd("manager");
		p1.click();
		
		Entertimetrack t1=new Entertimetrack(driver);
		t1.logout();

	}

}
