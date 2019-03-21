package com.ScreenshotCapture;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_ScreenshotCapture {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
		//WebDriver driver =null;
		
		driver = new ChromeDriver();//launch the Browser
		driver.get("http://www.facebook.com");
		takeScreenshot("Facebook_LoginPage");
		//Thread.sleep(10000);
		driver.manage().window().maximize();
	}
	
public static void takeScreenshot(String fileName) throws IOException {
	//1.take screenshot and store it as a file format
	
	File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//2.now copy the screenshot into desired location using copyfile method
	FileUtils.copyFile(file,new File("C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\Screenshot\\"+fileName+".jpeg"));
	driver.close();		
}
	
	}	
	


