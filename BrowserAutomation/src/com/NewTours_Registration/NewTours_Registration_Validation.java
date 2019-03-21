package com.NewTours_Registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_Registration_Validation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
		WebDriver driver =null;
		String url="http://www.newtours.demoaut.com/";
		driver = new ChromeDriver();
		driver.get(url);
		
		WebElement REGISTERElement=driver.findElement(By.linkText("REGISTER"));
		String REGISTERElementText=REGISTERElement.getText();
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.id("email")).sendKeys("pench");
		driver.findElement(By.name("password")).sendKeys("Nlrishika09@");
		driver.findElement(By.name("confirmPassword")).sendKeys("Nlrishika09@");
		driver.findElement(By.name("register")).click();
		driver.close();
		

		
	}

}
