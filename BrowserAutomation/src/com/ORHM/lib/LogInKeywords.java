package com.ORHM.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInKeywords {
	WebDriver driver=null;
	public void LaunchBrowser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
	driver=new ChromeDriver();
	}
	public void navigate() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	public void enterUsername() {
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	}
	
public void enterPassword() {
	driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");

	//*[@id="txtPassword"]
}

public void clickLogin() {
	driver.findElement(By.id("btnLogin")).click();
}

}
