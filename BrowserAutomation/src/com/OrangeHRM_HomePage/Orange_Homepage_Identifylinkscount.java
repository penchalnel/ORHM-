package com.OrangeHRM_HomePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_Homepage_Identifylinkscount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver=new ChromeDriver();
		String url="https://www.amazon.in/";
		driver.get(url);
		driver.manage().window().maximize();
		List<WebElement>Links=driver.findElements(By.tagName("a"));
		int LinksCount=Links.size();	
		System.out.println("The total no.of links on Amazon HomePage are:"+LinksCount);
		for(int i=0;i<LinksCount;i++) {
			if(Links.get(i).isDisplayed()) {
			String LinksName=Links.get(i).getText();
			System.out.println(LinksName);
			driver.close();
			}
			}
		}
		
		}
      
	

		
		

	


