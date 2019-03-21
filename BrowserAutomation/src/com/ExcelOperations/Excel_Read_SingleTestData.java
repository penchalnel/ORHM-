package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_SingleTestData {

	public static void main(String[] args) throws IOException {
		
FileInputStream file=new FileInputStream("C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\src\\com\\ExcelFiles\\SingleTestdata.xlsx");

XSSFWorkbook Workbook=new XSSFWorkbook(file);
XSSFSheet Sheet=Workbook.getSheet("Sheet1");

Row r=Sheet.getRow(0);
Cell c=r.getCell(0);

String data=c.getStringCellValue();
System.out.println(data);


	}

}
