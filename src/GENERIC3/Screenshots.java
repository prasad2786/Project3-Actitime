package GENERIC3;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots 
{
	public void capturephoto(WebDriver driver) throws IOException
	{
		String photo="./screenshots/";
		Date d=new Date();
		String d1=d.toString();
		String date=d1.replace(":", "-");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(photo+date+".jpeg");
		FileHandler.copy(src,dst);
	}
}
