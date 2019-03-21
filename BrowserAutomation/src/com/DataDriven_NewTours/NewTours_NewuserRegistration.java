package com.DataDriven_NewTours;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NewTours_NewuserRegistration extends BaseTest {
	@Test(priority=0)
	public void register() {
		//<a href="mercuryregister.php">REGISTER</a>
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		register.click();	
	}
	@Test(priority=1)
	public void userRegistration() throws IOException {
		FileInputStream file=new FileInputStream( "C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\src\\com\\ExcelFiles\\NewTours_UserRegistration.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rowCount=sheet.getLastRowNum();
		for(int p=1;p<=rowCount;p++) {
			Row r=sheet.getRow(p);
			r.getCell(0).getStringCellValue();
	
			driver.findElement(By.name("firstName")).sendKeys(r.getCell(0).getStringCellValue());
			driver.findElement(By.name("lastName")).sendKeys(r.getCell(1).getStringCellValue());
			
			double x=r.getCell(2).getNumericCellValue();
			long y=(long)x;
		    String phone=Long.toString(y);
				
			driver.findElement(By.name("phone")).sendKeys(phone);
     		driver.findElement(By.name("userName")).sendKeys(r.getCell(3).getStringCellValue());
			driver.findElement(By.name("address1")).sendKeys(r.getCell(4).getStringCellValue());
			//driver.findElement(By.name("address2")).sendKeys(r.getCell(5).getStringCellValue());
			driver.findElement(By.name("city")).sendKeys(r.getCell(5).getStringCellValue());
			driver.findElement(By.name("state")).sendKeys(r.getCell(6).getStringCellValue());
			
			double n=r.getCell(7).getNumericCellValue();
			long b=(long)n;
			String postalCode=Long.toString(b);
			
			
			driver.findElement(By.name("postalCode")).sendKeys(postalCode);
		
			driver.findElement(By.name("country")).sendKeys(r.getCell(8).getStringCellValue());
			driver.findElement(By.name("email")).sendKeys(r.getCell(9).getStringCellValue());
			driver.findElement(By.name("password")).sendKeys(r.getCell(10).getStringCellValue());
			driver.findElement(By.name("confirmPassword")).sendKeys(r.getCell(11).getStringCellValue());
			driver.findElement(By.name("register")).click();
			
			
		String expected_username=r.getCell(9).getStringCellValue();
		System.out.println("The expected username is:"+expected_username);
		
		String actual_registerusernametext=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
			System.out.println("The actual username is :"+actual_registerusernametext);
			
		if(actual_registerusernametext.contains(expected_username)) {
			
			System.out.println("Successfully registered-PASS");
			r.createCell(12).setCellValue("Successfully registered-PASS");
			
		}
		else {
			System.out.println("Unsuccessful registration-FAIL");
			r.createCell(12).setCellValue("Unsuccessful registration-FAIL");
		}
		
		FileOutputStream file1=new FileOutputStream("C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\src\\com\\ExcelFiles\\NewTours_UserRegistration.xlsx");
		workbook.write(file1);
		driver.navigate().back();
		}
		
		
	}
	

}
