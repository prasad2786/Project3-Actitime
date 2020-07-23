package Testscripts3;

import org.testng.annotations.Test;

import GENERIC3.*;
import POM3.Actitime;
import POM3.Entertimetrack;


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
