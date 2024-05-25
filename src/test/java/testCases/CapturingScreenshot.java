package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import resources.BaseClass;

public class CapturingScreenshot extends BaseClass {

	@Test
	public void screenshot() throws InterruptedException, IOException {
		
		driverInitialize();

		Thread.sleep(2000);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
	    File src=ts.getScreenshotAs(OutputType.FILE);
	    
	    File dest=new File("C:\\Users\\DELL\\Desktop\\ScreenShots\\pic.png");
	    
	    Thread.sleep(2000);
	    
	    FileUtils.copyFile(src, dest);
	    
	    Thread.sleep(2000);
	    
	    System.out.println("Screenshot captured successfully.....!!");
	}

}
