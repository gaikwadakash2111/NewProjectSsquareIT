package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		System.out.println("URL for 1st page ="+driver.getCurrentUrl());
		
		System.out.println("Title for 1st page ="+driver.getTitle());
		
		System.out.println(driver.getWindowHandle());
		
		//driver.manage().window().minimize();
		
		Thread.sleep(2000);
		
        //driver.manage().window().maximize();
		
		//driver.navigate().refresh();
		
		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		Thread.sleep(4000);
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getWindowHandle());
		
		driver.navigate().back();
		
		Thread.sleep(4000);
		
		driver.navigate().forward();
		
		driver.quit();
	}

}
