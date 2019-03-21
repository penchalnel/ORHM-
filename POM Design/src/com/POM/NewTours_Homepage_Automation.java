package com.POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewTours_Homepage_Automation extends BaseTest{
	@Test
	public void homepage() throws IOException {
		WelcomeMercuryTours wmt=PageFactory.initElements(driver, WelcomeMercuryTours.class);

		wmt.SignOn();
		driver.navigate().back();
		wmt.register();
		driver.navigate().back();
		FileInputStream File=new FileInputStream("C:\\Users\\new\\eclipse-workspace\\POM Design\\src\\com\\ApplicationTestdata\\Newtours_POM_Testdata.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook(File);
        XSSFSheet sheet=workbook.getSheet("Sheet1");   
      int rowCount=sheet.getLastRowNum();
      for(int i=1;i<=rowCount;i++) {
    	  Row r=sheet.getRow(i);  
    	 // System.out.println("Logging with "+r.getCell(0).getStringCellValue());
    	 // System.out.println(r.getCell(1).getStringCellValue());
    	  wmt.logIn(r.getCell(0).getStringCellValue(), r.getCell(1).getStringCellValue());
    	  String expected_Title="Find";
    	  System.out.println("The name of the expected title is:"+expected_Title);
    	  String actual_Title=driver.getTitle();
    	  System.out.println("The name of the actual title is:"+actual_Title);
    	  if(actual_Title.contains(expected_Title)) {
    		  r.createCell(2).setCellValue("Login successfully-PASS");
    	  }
    	  else {
    		  r.createCell(2).setCellValue("Login unsuccessful-FAIL");
    	  }
    	  driver.navigate().back();
    	  
    	  FileOutputStream file1=new FileOutputStream("C:\\Users\\new\\eclipse-workspace\\POM Design\\src\\com\\ApplicationTestdata\\Newtours_POM_Testdata.xlsx");  
          workbook.write(file1);  
      }
		
		
	}
	

}
