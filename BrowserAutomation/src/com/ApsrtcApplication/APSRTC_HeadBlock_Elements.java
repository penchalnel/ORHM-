package com.ApsrtcApplication;

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

public class APSRTC_HeadBlock_Elements {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver=new ChromeDriver();
		String url="https://apsrtconline.in/oprs-web/";
		driver.get(url);
		driver.manage().window().maximize();
		
WebElement headerBlock=driver.findElement(By.className("menu-wrap"));
List<WebElement>headerLinks=headerBlock.findElements(By.tagName("a"));
int headerBlock_LinksCount=headerLinks.size();
System.out.println("The total number of links on the HeaderBlock are:"+headerBlock_LinksCount);
for(int k=0;k<headerBlock_LinksCount;k++) {
	
	String headerBlock_LinkName=headerLinks.get(k).getText();
	System.out.println(headerBlock_LinkName);
	headerLinks.get(k).click();
	
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println();
	
	File headerLinks_Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(headerLinks_Screenshot, new File("./Screenshot/"+headerBlock_LinkName+".PNG"));	
	driver.navigate().back();
	Thread.sleep(5000);
	
	headerBlock=driver.findElement(By.className("menu-wrap"));
	headerLinks=headerBlock.findElements(By.tagName("a"));
	
}

driver.close();
	}

}
