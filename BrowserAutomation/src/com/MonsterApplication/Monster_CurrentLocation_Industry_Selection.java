package com.MonsterApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Selection;

public class Monster_CurrentLocation_Industry_Selection {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver=new ChromeDriver();
		String url="https://my.monsterindia.com/sponsered_popup.html";
		driver.get(url);
		driver.manage().window().maximize();
WebElement CurrentLocation=driver.findElement(By.className("border_grey1"));
Select selection=new Select(CurrentLocation);
selection.selectByIndex(4);
WebElement Industry=driver.findElement(By.id("id_industry"));
Select selection1=new Select(Industry);
selection1.selectByIndex(1);
Thread.sleep(2000);
selection1.selectByValue("4");
Thread.sleep(2000);
selection1.selectByVisibleText("Automotive/ Ancillaries");
Thread.sleep(2000);
selection1.selectByVisibleText("Banking/ Financial Services");
selection1.deselectAll();
		
	}

}
