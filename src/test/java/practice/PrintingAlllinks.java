package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingAlllinks {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://login.salesforce.com/?locale=in");

		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());

		Thread.sleep(3000);
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		for(int i=0; i<links.size(); i++)
		{
			System.out.println(links.get(i).getText());
		}
	}

}
