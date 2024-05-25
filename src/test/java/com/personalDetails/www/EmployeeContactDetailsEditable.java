package com.personalDetails.www;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjectModel.LoginPageObjects;
import pageObjectModel.PersonalDetailsPageObject;
import resources.BaseClass;

public class EmployeeContactDetailsEditable extends BaseClass {

	@Test
	public void verifyFieldsEditable() throws InterruptedException, IOException {
		driverInitialize();

		Thread.sleep(2000);

		LoginPageObjects lpo = new LoginPageObjects(driver);

		lpo.enterUsername().sendKeys("Admin");

		Thread.sleep(2000);

		lpo.enterPassword().sendKeys("admin123");

		Thread.sleep(2000);

		lpo.clickLogin().click();
		
		Thread.sleep(2000);

		lpo.clickOnContactInfo().click();
		
		Thread.sleep(2000);
		
		PersonalDetailsPageObject pds=new PersonalDetailsPageObject(driver);
		
		pds.personalDetails().click();
		
		Thread.sleep(2000);
		pds.firstName().click();
		pds.firstName().clear();
		
		pds.firstName().sendKeys("varun");
		
		Thread.sleep(2000);
		
		Assert.assertNotNull(pds.firstName().getText());
		
		System.out.println("the TF is editable....");
	}

}




