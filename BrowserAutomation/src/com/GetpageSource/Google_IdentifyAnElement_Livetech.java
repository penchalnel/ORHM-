package com.GetpageSource;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_IdentifyAnElement_Livetech {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver=new ChromeDriver();
		String url="http://google.com/";
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String expected_Element="Gmail";
		System.out.println("The expected element is:"+expected_Element);
      String actual_PageSource=driver.getPageSource();
      System.out.println("The actual element is:"+actual_PageSource);
      if(actual_PageSource.contains(expected_Element)) {
    	  System.out.println("Element found-PASS");
      }
      else {
    	  System.out.println("Element not found-FAIL");
      }
      driver.close();
	}

}
