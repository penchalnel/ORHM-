package com.KeyBoardOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook_LoginTest_KeyboardOperations {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver=new ChromeDriver();
		String url="https://www.facebook.com//";
		driver.get(url);
		driver.manage().window().maximize();
driver.findElement(By.id("email")).sendKeys("");
Actions act=new Actions(driver);
act.sendKeys(Keys.TAB).perform();
act.sendKeys("").perform();
act.sendKeys(Keys.ENTER).perform();
	}

}
