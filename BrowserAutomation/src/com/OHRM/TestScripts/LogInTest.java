package com.OHRM.TestScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.ORHM.lib.LogInKeywords;

public class LogInTest {
	@Test
	public void LogIn() throws IOException
	{
		LogInKeywords keys=new LogInKeywords();
	
	FileInputStream file=new FileInputStream("C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\src\\com\\ExcelTestdataFile\\OHRM ACTION KEYWORD.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(file);
	XSSFSheet sh=wb.getSheet("Sheet1");
	Row r=null;
	int rowcount=sh.getLastRowNum();
	for(int i=1;i<=rowcount;i++) {
		r=sh.getRow(i);
		String runmode=r.getCell(4).getStringCellValue();
		if(runmode.equals("Y")) {
			String keyword=r.getCell(3).getStringCellValue();
			if(keyword.equals("LaunchBrowser")) {
				keys.LaunchBrowser();	
		}
			else if(keyword.equals("navigate")) {
			keys.navigate();
			}
			
			else if(keyword.equals("enter username")) {
				keys.enterUsername();
			}
			else if(keyword.equals("enter password" )) {
				keys.enterPassword();	
			}
			
			else if(keyword.equals("Click Login")) {
				keys.clickLogin();
			}
		}
		
	}
	
	
	}
	

}
