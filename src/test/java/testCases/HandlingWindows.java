package testCases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandlingWindows {
	
	@Test
	public void handlingWindow() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement windowButton=driver.findElement(By.id("openwindow"));
		
		windowButton.click();
		
		//System.out.println(driver.getWindowHandle());
		
		//System.out.println(driver.getWindowHandles());
		
	    Set<String> obj=driver.getWindowHandles();
	    
	    Iterator<String> it=obj.iterator();
	    
	    String parent_window=it.next();
	    
	    String child_window=it.next();
	    
	    Thread.sleep(2000);
	    
	    System.out.println(driver.getCurrentUrl());
	    
	    driver.switchTo().window(child_window);
	    
	    Thread.sleep(2000);
	    
	    System.out.println(driver.getCurrentUrl());
		
	    driver.findElement(By.linkText("CONTACT")).click();
	    
	    Thread.sleep(2000);
	    
	    //System.out.println(driver.getTitle());
	    
	    //String expectedTitle="QAClick Academy - A Testing Academy to Learn, Earn and Shine";
	    
	    //String actualTitle=driver.getTitle();
	    
	    //Assert.assertEquals(expectedTitle, actualTitle);
	    
	    driver.manage().window().maximize();
	    
	    WebElement contactPageBanner=driver.findElement(By.xpath("//div[@class='page-banner-cont']"));
	    
	    Assert.assertTrue(contactPageBanner.isDisplayed());
	    
	    System.out.println("test case passed.....");
	    
	    Thread.sleep(2000);
	    
	    driver.switchTo().window(parent_window);
	    
	    System.out.println(driver.getCurrentUrl());
	    
	    driver.quit();
	}

}
