package com.DataDriven_NewTours;

import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	WebDriver driver=null;
	String url="http://newtours.demoaut.com/";
	int rowCount=0;
    Workbook workbook=null;
    Sheet sheet=null;
    Row row=null;
  
	@BeforeTest
		public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	/*@AfterTest
	public void teardown() {
		driver.close();
	}*/
	
}
	

