package com.NewTours_Homepage;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_Homepage_Testlinks {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
		WebDriver driver =null;
		String url="http://www.newtours.demoaut.com/";
		driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(10000);
		driver.manage().window().maximize();
		
		
		List<WebElement>Links=driver.findElements(By.tagName("a"));
		int LinksCount=Links.size();
		System.out.println("The total Number of links on Newtours Homepage are:"+LinksCount);
		for(int i=0;i<Links.size();i++)
		{
			if(Links.get(i).isDisplayed()){
			String LinkName=Links.get(i).getText();
				
			System.out.println(i+" "+"The name of the link is:"+LinkName);
			Links.get(i).click();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
//			File Links_Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(Links_Screenshot, new File("./Screenshot/"+LinkName+".PNG"));
			
			driver.navigate().back();
			//recreating the arrayList
			Links=driver.findElements(By.tagName("a"));
			
			
	
		}
	}
driver.close();
}
}
