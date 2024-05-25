package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDowns {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement dropdownButton=driver.findElement(By.id("dropdown-class-example"));
		
		// located dropdown button
		
		Select  s=new Select(dropdownButton);
		
		s.selectByIndex(1);
		
		Thread.sleep(2000);
		
		s.selectByValue("option2");
		
		Thread.sleep(2000);
		
		s.selectByVisibleText("Option3");
		
		List<WebElement> options=s.getOptions();
		for(int i=0; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		System.out.println();
		
		//for each loop......
		for(WebElement k: options)
		{
			System.out.println(k.getText());
		}
	}

}
