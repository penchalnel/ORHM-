package com.MouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HelloSignIn_MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver=new ChromeDriver();
		String url="https://www.amazon.in/";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement helloSignIn=driver.findElement(By.id("nav-link-yourAccount"));
		Actions act=new Actions(driver);
		act.moveToElement(helloSignIn).perform();;
		driver.findElement(By.linkText("Your Orders")).click();
		driver.close();

	}

}
