package testCases;

import org.testng.annotations.Test;

public class SettingPriorities {

	@Test
	public void driverInitialize()
	{
		System.out.println("code to intialize the driver/browser.......");
	}
	
	@Test(dependsOnMethods = "driverInitialize")
	public void enterURL()
	{
		System.out.println("code to enter/launch the url.......");
	}
	
}
