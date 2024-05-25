package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstrProgram {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement firstName=driver.findElement(By.id("name"));
		
		firstName.click();
		
		firstName.sendKeys("Akashay");
	}

}
