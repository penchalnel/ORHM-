package com.BrowserAutomation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\new\\\\eclipse-workspace\\\\BrowserAutomation\\\\DriverFiles\\\\geckodriver.exe");
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://facebook.com");
		d.getTitle();
		d.close();
	
	}

}
