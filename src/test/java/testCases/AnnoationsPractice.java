package testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnoationsPractice {

	@Test
	public void m1()
	{
		System.out.println("i am method m1.......");
	}
	
	@Test
	public void z1()
	{
		System.out.println("i am method z1.......");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("this code will execute before each and every @Test annoted method...");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("this code will execute after execution of each and every @Test annoted method....");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("this code will execute before any annoted method.....");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("this code will execute after execution of all the annoted methods....");
	}
	
}
