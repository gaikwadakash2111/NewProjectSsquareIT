package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver driver; 

	public void driverInitialize() throws InterruptedException, IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\DELL\\eclipse-workspace\\SeleniumAutomation24thBatch\\src\\main\\java\\resources\\data.properties");

		Properties prop = new Properties();

		prop.load(fis);

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

			driver.manage().window().maximize();

			Thread.sleep(3000);
		}

		else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

			driver.manage().window().maximize();

			Thread.sleep(3000);
			
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

			driver.manage().window().maximize();

			Thread.sleep(3000);
		}
		
		else
		{
			System.out.println("Please check u have correct browser........");
		}
	}
   
}
