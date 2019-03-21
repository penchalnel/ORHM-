package com.xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_LoginTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver=new ChromeDriver();
		String url="http://facebook.com";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(10000);
		TimeUnit sec = null;
		
		
		//<input type="email" class="inputtext" name="email" id="email" 
			//	data-testid="royal_email">
		//driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("sriniiii");
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sriniiii");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Hello");
		driver.manage().timeouts().implicitlyWait(10, sec);
		
		//*[@id="email"]
		
	//	<input type="password" class="inputtext" name="pass" id="pass"
			//	data-testid="royal_pass">
		
//driver.findElement(By.xpath("//*[@class='inputtext'and@data-testid='royal_pass']")).sendKeys("Hello");
	}

}
