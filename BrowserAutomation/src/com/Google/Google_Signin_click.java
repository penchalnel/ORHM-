package com.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Signin_click {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
		WebDriver driver =null;
		String url="http://www.google.com";
		driver = new ChromeDriver();
		driver.get(url);
	driver.findElement(By.id("gb_70")).click();
	//driver.findElement(By.className("gb_P")).click();
	//driver.findElement(By.linkText("Sign in")).click();
		//driver.findElement(By.partialLinkText("Sign")).click();
	//driver.findElement(By.className("gb_P")).click();
	driver.close();
		

	}

}
