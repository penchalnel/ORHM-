package com.CurrentURLofFacebook.Java;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingURL_Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
		WebDriver driver=null;
		driver=new ChromeDriver();
		String Url="http://facebook.com";
		driver.get(Url);
		String actualUrl=driver.getCurrentUrl();
		System.out.println("The current Url of facebook application is:"+actualUrl);
       String expectedUrl="facebook.com";
       System.out.println("The expected_Url is:"+expectedUrl);
       if(actualUrl.contains(expectedUrl)) {
    	   System.out.println("Url matched-PASS");
       }
       else
       {
    	   System.out.println("Url not matched-FAIL");
       }
       driver.close();
	}

}
