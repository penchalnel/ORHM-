package com.Login_Fuctionality_OHRM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OrangeHRM_LoginFuncitonality_ExcelOperations {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver=new ChromeDriver();
		String url="https://opensource-demo.orangehrmlive.com/";
		driver.get(url);
		driver.manage().window().maximize();
		
		FileInputStream file=new FileInputStream("C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\src\\com\\ExcelFiles\\MultipleTestData_ORHM11.xlsx");

		XSSFWorkbook Workbook=new XSSFWorkbook(file);
		XSSFSheet Sheet=Workbook.getSheet("Sheet1");

		Row r=Sheet.getRow(1);
		Cell usernamecell=r.getCell(0);
		Cell passwordcell=r.getCell(1);
				
		String Username=usernamecell.getStringCellValue();
		
		String Password=passwordcell.getStringCellValue();
		
		//String url="https://opensource-demo.orangehrmlive.com/";
		//driver.get(url);
		WebElement UsernameElement=driver.findElement(By.id("txtUsername"));
		UsernameElement.sendKeys(Username);
		WebElement PasswordElement=driver.findElement(By.id("txtPassword"));
		PasswordElement.sendKeys(Password);
		WebElement LOGIN=driver.findElement(By.id("btnLogin"));
		LOGIN.click();
		
		
		String expected_LOGINText="Welcome";
		System.out.println("The expected text after Login Successful is:"+expected_LOGINText);
		//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		WebElement WelcomeAdminElement=driver.findElement(By.linkText("Welcome Admin"));
		String actual_LOGINText=WelcomeAdminElement.getText();
		System.out.println("The actual text after Login Successful is:"+actual_LOGINText);
		
		
	XSSFSheet Sheeto=Workbook.getSheet("Sheet1");
	Row r2=Sheeto.getRow(1);
	Cell cell=r2.createCell(2);
	
		
		FileOutputStream file1=new FileOutputStream("C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\src\\com\\ExcelFiles\\MultipleTestData_ORHM11.xlsx");		
		
		
		if(actual_LOGINText.contains(expected_LOGINText))			
			
		{
			cell.setCellValue("OrangeHRM Page successfully loged in-PASS");
			Workbook.write(file1);	
			file1.close();
			//System.out.println("OrangeHRM Page successfully loged in-PASS");
		}
		else
		{	
			cell.setCellValue("OrangeHRM Page login unsuccessful-FAIL ");
            Workbook.write(file1);			
			file1.close();
		   // System.out.println("OrangeHRM Page login unsuccessful-FAIL ");	
		}
		
		driver.close();
	}

}