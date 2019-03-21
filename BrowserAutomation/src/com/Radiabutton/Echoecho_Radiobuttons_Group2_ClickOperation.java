package com.Radiabutton;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Echoecho_Radiobuttons_Group2_ClickOperation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver=new ChromeDriver();
		String url="http://www.echoecho.com/htmlforms10.htm";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//> Cheese<hr><input type="radio" name="group2" value="Water"
		//> Water<br><input type="radio" name="group2"
		//value="Beer"> Beer<br><input type="radio" name="group2" value="Wine" checked=""
		//> Wine<div align="center"></div><br></td>
			
	WebElement Block=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));	
    List<WebElement>radiobuttons=Block.findElements(By.name("group2"));
    int radiobutton_Count=radiobuttons.size();
    System.out.println("The total number of radiobuttons are:"+radiobutton_Count);
    for(int i=0;i<radiobuttons.size();i++) {
		
	String Block_radiobuttonName=radiobuttons.get(i).getText();
		radiobuttons.get(i).click();
		
	
		for(int k=0;k<radiobuttons.size();k++) {
					
System.out.println(radiobuttons.get(k).getAttribute("Checked"));
		}
		
System.out.println(Block_radiobuttonName+" "+"Name of the radio button:"+radiobuttons.get(i).getAttribute("value"));

	}
	
	driver.close();

}


	}


