package WebTableFormat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_Register_Country_ExportDataintoExcel {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
		WebDriver driver =null;
		String url="http://www.newtours.demoaut.com/";
		driver = new ChromeDriver();
		driver.get(url);
		//Thread.sleep(10000);
		driver.manage().window().maximize();
		
		WebElement register=driver.findElement(By.linkText("REGISTER"));
        register.click();
       WebElement Country =driver.findElement(By.name("country"));
       List<WebElement>Countries=Country.findElements(By.tagName("option"));
       
       
       int Countrycount=Countries.size();
     
       System.out.println("The number of Countries in Country DropDown are:"+Countrycount);
       
       FileInputStream file=new FileInputStream("C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\src\\com\\ExcelFiles\\MultipleTestData1.xlsx");
       XSSFWorkbook workbook=new XSSFWorkbook(file);
       XSSFSheet sheet=workbook.getSheet("Sheet1");
       for(int k=0;k<Countries.size();k++) {
    	   Row r=sheet.createRow(k);
    	   Cell c=r.createCell(0);
    	   String CountryName=Countries.get(k).getText();
    	   System.out.println(CountryName);
    	   c.setCellValue(CountryName);
    	   
    	   
    	   FileOutputStream file1=new FileOutputStream("C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\src\\com\\ExcelFiles\\MultipleTestData1.xlsx");
    	
    	  workbook.write(file1); 
    	   
    	   
       }
       
       

	}

}
