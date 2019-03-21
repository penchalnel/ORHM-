package com.FullNameRediffMail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffMail_UserRegistration {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
		WebDriver driver=null;
		driver=new ChromeDriver();
		String Url="https://register.rediff.com/register/register.php?FormName=user-details";
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//name3b6aec47
		//name776f7068
		//namea8c30698
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[starts-with(@name,'name')]")).sendKeys("Penchala");
		driver.close();
	}

}
