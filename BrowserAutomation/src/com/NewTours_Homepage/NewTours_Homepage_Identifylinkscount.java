package com.NewTours_Homepage;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_Homepage_Identifylinkscount {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
		WebDriver driver =null;
		String url="http://www.newtours.demoaut.com/";
		driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(10000);
		driver.manage().window().maximize();
		//<a href="mercurysignon.php">SIGN-ON</a>
		//<a href="mercuryregister.php">REGISTER</a>
		//<a href="mercuryunderconst.php">SUPPORT</a>
		//<input type="text" name="userName" size="10">
		//<a href="mercurywelcome.php">Home</a>
		List<WebElement>Links=driver.findElements(By.tagName("a"));
		int LinksCount=Links.size();
		System.out.println("The total Number of links on Newtours Homepage are:"+LinksCount);
		for(int i=0;i<Links.size();i++)
		{
			String LinkName=Links.get(i).getText();
		
			System.out.println(i+" "+"The name of the link is:"+LinkName);
		}
		driver.quit();
		
	}

}
