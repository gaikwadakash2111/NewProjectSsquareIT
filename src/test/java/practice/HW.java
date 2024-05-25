package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HW {
	
	@Test
	public void handlingWindows() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("openwindow")).click();
		
		Thread.sleep(3000);
		
		//System.out.println(driver.getWindowHandle());
		
		//System.out.println(driver.getWindowHandles());
		
		System.out.println(driver.getCurrentUrl());
		
		Set<String> obj=driver.getWindowHandles();
		
		Iterator<String> it=obj.iterator();
		
		String parent_window=it.next();
		
		String child_window=it.next();
		Thread.sleep(2000);
		
		driver.switchTo().window(child_window);
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		
		
		
	}

}
