package com.Radiabutton;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Echoecho_Radiobuttons_ClickOperation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver=new ChromeDriver();
		String url="http://www.echoecho.com/htmlforms10.htm";
		driver.get(url);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//<td class="table5"><!-- perl mysql php web host -->
		//<br><br><input type="radio" name="group1" value="Milk"
		//> Milk<br><input type="radio" name="group1" value="Butter" checked=""
		//> Butter<br><input type="radio" name="group1" value="Cheese"
	///html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td	
		
 WebElement radioButtonsBlock=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
	List <WebElement>radiobuttons= radioButtonsBlock.findElements(By.name("group1"));
	
	System.out.println(radiobuttons.size());
	
		for(int i=0;i<radiobuttons.size();i++) {
			
			//String Block_radiobuttonName=radiobuttons.get(i).getText();
			radiobuttons.get(i).click();
			
			for(int k=0;k<radiobuttons.size();k++) {
						
	//System.out.println(radiobuttons.get(k).getAttribute("Checked"));
	Thread.sleep(10000);	
System.out.println(radiobuttons.get(k).getAttribute("value")+" "+radiobuttons.get(k).getAttribute("Checked"));
	
		}
		}
		driver.close();
		}
	
	}
