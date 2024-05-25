package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		List<WebElement> radioButtons=driver.findElements(By.xpath("//input[@name='radioButton']"));
	
//		
//		for(int i=0; i<radioButtons.size(); i++)
//		{
//			radioButtons.get(i).click();
//			Thread.sleep(2000);
//		}
//	
//		for(WebElement k:radioButtons)
//		{
//			k.click();
//			Thread.sleep(2000);
//		}
		
		WebElement radio1=driver.findElement(By.xpath("//input[@value='radio1']"));
		
		radio1.click();
		
		System.out.println(radio1.isDisplayed());
		System.out.println(radio1.isEnabled());
		System.out.println(radio1.isSelected());
		
		WebElement radio2=driver.findElement(By.xpath("//input[@value='radio2']"));
		radio2.click();
		Thread.sleep(3000);
		boolean output=radio1.isSelected();
		System.out.println(radio2.isSelected());
		
		if(output==false)
		{
			System.out.println("The radio button functionality is working fine.....");
		}
		else
		{
			System.out.println("The radio button functionality is not working fine.....");
		}
	}

}
