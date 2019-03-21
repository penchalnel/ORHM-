package com.JqueryApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQuery_IdentifyingDragmeToMyTargetElement_Frame {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
			WebDriver driver = null;
			driver=new ChromeDriver();
			String url="https://jqueryui.com/droppable/";
			driver.get(url);
			driver.manage().window().maximize();
			driver.switchTo().frame(driver.findElement(By.className("demo-frame")));;
			Thread.sleep(5000);
		 WebElement drag_Element=driver.findElement(By.id("draggable"));
         WebElement drop_Element=driver.findElement(By.id("droppable"));
         Actions act=new Actions(driver);
         act.dragAndDrop(drag_Element, drop_Element).perform();
         driver.switchTo().defaultContent();
	}

}
