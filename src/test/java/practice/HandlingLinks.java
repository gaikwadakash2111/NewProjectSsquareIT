package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class HandlingLinks {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://login.salesforce.com/?locale=in");

		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());

		Thread.sleep(3000);
		
		WebElement link1=driver.findElement(By.linkText("Forgot Your Password?"));
		
		link1.click();
		
		String s=driver.getTitle();
		
		Assert.assertEquals(s, "Forgot Your Password Page");
		
		
	}

}
