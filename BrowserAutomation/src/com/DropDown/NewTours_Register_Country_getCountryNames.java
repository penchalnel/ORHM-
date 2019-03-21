package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_Register_Country_getCountryNames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver=new ChromeDriver();
		String url="http://newtours.demoaut.com/mercuryregister.php";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement register=driver.findElement(By.linkText("REGISTER"));
        register.click();
       List<WebElement>Country=driver.findElements(By.tagName("option"));
       int Countrycount=Country.size();
     
       System.out.println("The number of Countries in Country DropDown are:"+Countrycount);
       for(int k=0;k<Country.size();k++) {
    	   Country.get(k).click();
    	   if(Country.get(k).isSelected()){
    		   System.out.println("Element is active");
    	   }
    	   else {
    		   System.out.println("Element is inactive");
       }
    	   String CountryName=Country.get(k).getText();
    	   System.out.println(k+" "+"The Name of the Country is:"+CountryName);
       }
driver.close();
}
}
