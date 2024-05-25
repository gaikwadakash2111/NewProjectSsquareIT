package practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CS {
	
	@Test
	public void capturingSc() throws InterruptedException, IOException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mvnrepository.com/artifact/commons-io/commons-io/2.16.1");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\DELL\\Desktop\\ScreenShots\\pic.png");
		
		FileUtils.copyFile(src, dest);
		
		System.out.println("Screenshot captured....!!");
	}

}
