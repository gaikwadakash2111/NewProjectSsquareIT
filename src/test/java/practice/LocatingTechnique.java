package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingTechnique {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

		driver.manage().window().maximize();

		Thread.sleep(3000);
		
		WebElement emailTextField=driver.findElement(By.xpath("//input[@id='email']"));
		emailTextField.sendKeys("akshaymeena");
		Thread.sleep(3000);
	    System.out.println(emailTextField.getAttribute("value"));
	}

}
