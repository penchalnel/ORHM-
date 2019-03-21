package WebTableFormat;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_WebTable {

	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver=new ChromeDriver();
		String url="https://www.timeanddate.com/worldclock/";
		driver.get(url);
		driver.manage().window().maximize();
		
		FileInputStream file = new FileInputStream("C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\src\\com\\ExcelFiles\\MultipleTest Data.xlsx");
		 XSSFWorkbook workbook = new XSSFWorkbook(file);
		 XSSFSheet sheet = workbook.getSheet("Sheet1");
		 
		 String data=null;
		 Row row = null;
		 Cell cell = null;
WebElement table = driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table"));
               List<WebElement>rows=table.findElements(By.tagName("tr"));
               for(int i=0;i<rows.size();i++) {
               	 row =sheet.createRow(i);
               List<WebElement>Cols=rows.get(i).findElements(By.tagName("td"));
               for(int k=0;k<Cols.size();k++) {
               	  data= Cols.get(k).getText();
               	  cell=row.createCell(k);
               	 // cell.setCellType(cell.CELL_TYPE_STRING);
               	  cell.setCellValue(data);
               	  FileOutputStream file1 = new FileOutputStream("C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\src\\com\\ExcelFiles\\MultipleTest Data.xlsx");
               	  workbook.write(file1);
               	  file.close();
               	  System.out.print(data+" ");
               }
               	System.out.println();        
               }              
	}
}



