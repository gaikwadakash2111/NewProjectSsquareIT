package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement countryDropdown=driver.findElement(By.id("autosuggest"));
		
		countryDropdown.sendKeys("ind");
		
		Thread.sleep(2000);
		
		List<WebElement> options=driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		
//		for(int i=0; i<options.size(); i++)
//		{
//			if(options.get(i).getText().equalsIgnoreCase("india"))
//			{
//				options.get(i).click();
//			}
//		}
		
		countryDropdown.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		countryDropdown.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		countryDropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[@class='red-arrow-btn'])[1]")).click();
		Thread.sleep(2000);
		
		WebElement departCity=driver.findElement(By.xpath("//a[@value='GWL']"));
		departCity.click();
		Thread.sleep(2000);
		WebElement arrivalCity=driver.findElement(By.xpath("(//a[@value='IXJ'])[2]"));
		arrivalCity.click();
		
		List<WebElement> dates=driver.findElements(By.xpath("//td[@data-month='3']"));
		for(int i=0; i<dates.size(); i++)
		{
			if(dates.get(i).getText().equals("23"))
			{
				System.out.println(dates.get(i).getText());
				dates.get(i).click();
			}
			
		}
	}

}
