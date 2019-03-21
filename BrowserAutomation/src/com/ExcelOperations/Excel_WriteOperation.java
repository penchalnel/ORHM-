package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_WriteOperation {

	public static void main(String[] args) throws IOException {
		FileInputStream File=new FileInputStream("C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\src\\com\\ExcelFiles\\Single Testdata.xlsx");
               XSSFWorkbook workbook=new XSSFWorkbook(File);
               XSSFSheet sheet=workbook.getSheet("Sheet1");   
             Row  r=sheet.createRow(5);
             Cell c=r.createCell(3);
             c.setCellValue("Penchalaiah");  
             
             
             XSSFSheet Sheet0=workbook.getSheet("Sheet1");
         	Row r2=Sheet0.getRow(5);
         	Cell cell=r2.createCell(4);
          cell.setCellValue("Honey");
          FileOutputStream file1=new FileOutputStream("C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\src\\com\\ExcelFiles\\Single Testdata.xlsx");  
            workbook.write(file1);  
	}

}
