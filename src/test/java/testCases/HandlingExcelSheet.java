package testCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import pageObjectModel.LoginPageObjects;
import resources.BaseClass;

public class HandlingExcelSheet extends BaseClass{
	
	@Test
	public void fetchingDataFromExcel() throws IOException, InterruptedException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\Desktop\\orangeHRM_Data.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		XSSFRow row=sheet.getRow(0);
		
		XSSFCell cell=row.getCell(0);
		
		String username=cell.toString();
		// to convert into string
				
		XSSFCell cell1=row.getCell(1);
		
		String password=cell1.toString();
		//to convert into string
		
		//System.out.println(row.getCell(0));
		
		//System.out.println(row.getCell(1));
		
		driverInitialize();
		
        LoginPageObjects lpo=new LoginPageObjects(driver);
		
		lpo.enterUsername().sendKeys(username);  
		
	    Thread.sleep(2000);
	    
	    lpo.enterPassword().sendKeys(password);
	    
	    Thread.sleep(2000);
	    
	    lpo.clickLogin().click();
	    
	    Thread.sleep(2000);
		
	    
	}

}
