package com.NewTours_Homepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validating_RegisterLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver=new ChromeDriver();
		String url="http://newtours.demoaut.com/";
		driver.get(url);
		driver.manage().window().maximize();
		
		//<a href="mercuryregister.php">REGISTER</a>
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		
		
		String expected_Url=register.getAttribute("href");
		register.click();
		System.out.println("The expected URL address is:"+expected_Url);
		
		String actual_Url=driver.getCurrentUrl();
		System.out.println("The actual URL address is:"+actual_Url);
		
		if(actual_Url.equals(expected_Url)) {
			System.out.println("URL's matched-PASS");
		}
		else {
			System.out.println("URL's not matched-FAIL");
		}
		driver.close();
}

}
