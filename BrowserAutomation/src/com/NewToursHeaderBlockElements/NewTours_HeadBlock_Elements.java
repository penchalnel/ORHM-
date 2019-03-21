package com.NewToursHeaderBlockElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_HeadBlock_Elements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver=new ChromeDriver();
		String url="http://newtours.demoaut.com/";
		driver.get(url);
		driver.manage().window().maximize();
		
WebElement headerBlock=driver.findElement(By.className(""));
List<WebElement>headerLinks=headerBlock.findElements(By.tagName("a"));
int headerBlock_LinksCount=headerLinks.size();
System.out.println("The total number of Links on the HeaderBlock are:"+headerBlock_LinksCount);

	}

}
