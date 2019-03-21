package com.IdentifyingTitleJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdentifyingTitle_Facebook {

	public static void main(String[] args) {
		
		WebDriver driver =null;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\geckodriver.exe");
		
		driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.navigate().to("http://facebook.com");
		driver.get("http://facebook.com");
		String expected_Title="Facebook � log in or sign up";
		System.out.println("The expected Title of facebook is:"+expected_Title);
		String actual_Title=driver.getTitle();
		System.out.println("The Title of facebookHome page is:"+actual_Title);
		if(actual_Title.equals(expected_Title)) {
			System.out.println("Tittle matched-PASS");
		}
		else {
			System.out.println("Title not matched-FAIL");
		}
		
		driver.quit();
	}
}