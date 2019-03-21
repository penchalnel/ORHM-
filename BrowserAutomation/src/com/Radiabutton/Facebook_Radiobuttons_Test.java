package com.Radiabutton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Radiobuttons_Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
		WebDriver driver=null;
		driver=new ChromeDriver();
		String Url="http://facebook.com";
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//<input type="radio" name="sex" value="1" id="u_0_9">
		//<input type="radio" name="sex" value="2" id="u_0_a">
		
	WebElement radiobutton=driver.findElement(By.id("u_0_9"));
	radiobutton.getAttribute("value");
	radiobutton.click();

	WebElement radiobutton1=driver.findElement(By.id("u_0_a"));
	radiobutton1.getAttribute("value");
	radiobutton1.click();
	
	System.out.println(radiobutton.getAttribute("value") );
	System.out.println(radiobutton1.getAttribute("value"));
	driver.close();
	}
}
	