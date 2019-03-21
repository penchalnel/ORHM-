package com.OrangeHRMPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_Homepage_IdentifyLinksCount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver=new ChromeDriver();
		 String Username="Admin";
		 String Password="admin123";
		String url="https://opensource-demo.orangehrmlive.com/";
		driver.get(url);
		WebElement UsernameElement=driver.findElement(By.id("txtUsername"));
		UsernameElement.sendKeys("Admin");
		WebElement PasswordElement=driver.findElement(By.id("txtPassword"));
		PasswordElement.sendKeys("admin123");
		WebElement LOGIN=driver.findElement(By.id("btnLogin"));
		LOGIN.click();

		//<b>Admin</b>
		//<b>PIM</b>
		//<b>Leave</b>
		//<b>Time</b>
		List<WebElement>Links=driver.findElements(By.tagName("a"));
		int LinksCount=Links.size();	
		System.out.println("The total no.of links on OrangeHRM HomePage are:"+LinksCount);
		for(int i=0;i<LinksCount;i++) {
			if(Links.get(i).isDisplayed()) {
			String LinksName=Links.get(i).getText();
			System.out.println(LinksName);
			}
		}
		driver.close();
		}
      
	}


