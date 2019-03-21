package com.GmailApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GMAIL_HeadBlock_Elements {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
			WebDriver driver = null;
			String Email="penchalnel1989@gmail.com";
			String Password="naaupiri1005";
			driver=new ChromeDriver();
			String url="https://mail.google.com/mail/u/0/?tab=rm#inbox";
			driver.get(url);
			driver.manage().window().maximize();
			WebElement EmailElement=driver.findElement(By.id("identifierId"));
			EmailElement.sendKeys("penchalnel1989@gmail.com");
			WebElement NextElement=driver.findElement(By.className("RveJvd snByac"));
	        NextElement.click();
			WebElement PasswordElement=driver.findElement(By.name("password"));
			EmailElement.sendKeys("naaupiri1005");
			
			WebElement NextElement1=driver.findElement(By.linkText("Next"));
	        NextElement1.click();
			
	       // <span class="RveJvd snByac">Next</span>
			
	}

}
