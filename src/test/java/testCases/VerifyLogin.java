package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjectModel.LoginPageObjects;
import resources.BaseClass;

public class VerifyLogin extends BaseClass{

	@Test
	public void verifyLoginButton() throws InterruptedException, IOException
	{
		driverInitialize();
		
		Thread.sleep(2000);
		
		LoginPageObjects lpo=new LoginPageObjects(driver);
		
		lpo.enterUsername().sendKeys("Admin");  
		
	    Thread.sleep(2000);
	    
	    lpo.enterPassword().sendKeys("admin123");
	    
	    Thread.sleep(2000);
	    
	    lpo.clickLogin().click();
	    
	    Thread.sleep(2000);
	   
	    //apply the assertion here...
	    
//	    String titleExpected="OrangeHRM";
//	    
//	    String titleActual=driver.getTitle();
//	    
//	    Assert.assertEquals(titleExpected, titleActual);
//	    
//	    System.out.println("You have sucessfully login");
	    
	    WebElement dashboard=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span"));
	    Thread.sleep(2000);
	    Assert.assertTrue(dashboard.isDisplayed());
	    Thread.sleep(2000);
	    System.out.println("You have sucessfully login");
	}
}
