package com.OrangeHRMValidationLoginFuctionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_PIM_AddEmployee_LoginTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver=new ChromeDriver();
		 String Username="Admin";
		 String Password="admin123";
		String url="https://opensource-demo.orangehrmlive.com/";
		driver.get(url);
		driver.manage().window().maximize();
			
		WebElement UsernameElement=driver.findElement(By.id("txtUsername"));
		UsernameElement.sendKeys("Admin");
		WebElement PasswordElement=driver.findElement(By.id("txtPassword"));
		PasswordElement.sendKeys("admin123");
		WebElement LOGIN=driver.findElement(By.id("btnLogin"));
		LOGIN.click();
		WebElement PIMElement=driver.findElement(By.id("menu_pim_viewPimModule"));
		PIMElement.click();
		
		WebElement AddEmployeeElement=driver.findElement(By.id("menu_pim_addEmployee"));
		AddEmployeeElement.click();
		
		
		String pageActualTitle=driver.getTitle();
		
		String pageExpectedTitle="OrangeHRM";
	    
	   
	    
	    if(pageActualTitle.contains(pageExpectedTitle)) {
	    	System.out.println("Page title has been validated Successfully with Contains method");
	    }
	    else 
	    {
	    	System.out.println("Page title has not been validated Successfully with equals Ignore Case");
	    } 
	    
	    
	    //List<WebElement> listOfLinks=driver.findElements(By.tagName("a"));
	    
	   // for(int i=0;i<listOfLinks.size();i++) {
	         // String LinkName=listOfLinks.get(i).getText();
	         // System.out.println(LinkName);
		
		WebElement FullNameElement=driver.findElement(By.id("firstName"));
		FullNameElement.sendKeys("Penchalaiah");
		WebElement LastNameElement=driver.findElement(By.id("lastName"));
		LastNameElement.sendKeys("Nelaturu");
		WebElement SaveElement=driver.findElement(By.id("btnSave"));
		SaveElement.click();
		
		WebElement EmpFirstName=driver.findElement(By.id("personal_txtEmpFirstName"));
		WebElement EmpLastName=driver.findElement(By.id("personal_txtEmpLastName"));
		
		//System.out.println(EmpFirstName.getAttribute("value"));
		//System.out.println(EmpFirstName.getAttribute("type"));
		//System.out.println(EmpFirstName.getAttribute("name"));
		
		
		//if(EmpFirstName.getAttribute("value").equalsIgnoreCase("penchalaiah")) {
			
		//}
		 
	    //if(pageActualTitle.equalsIgnoreCase(pageExpectedTitle)) {
	    	//System.out.println("Page title has been validated Successfully with equals Ignore Case");
	  //  } else 
	   // {
	    	//System.out.println("Page title has not been validated Successfully with equals Ignore Case");
	    //} 
		
		if(EmpFirstName.getAttribute("value").equalsIgnoreCase("Penchalaiah") && EmpLastName.getAttribute("value").equalsIgnoreCase("Nelaturu")) {
		     System.out.println("test case passed successfully");}
		else {
		    	 System.out.println("test case failed");
		}
		
		
	    if(pageActualTitle.equalsIgnoreCase(pageExpectedTitle)) {
	    	System.out.println("Page title has been validated Successfully with equals Ignore Case");
	    } else 
	    {
	    	System.out.println("Page title has not been validated Successfully with equals Ignore Case");
	    } 
	
		
		WebElement WelcomeAdminElement=driver.findElement(By.id("welcome"));
		WelcomeAdminElement.click();
		
		System.out.println("clicked");
		
		Thread.sleep(10000);
		WebElement LogoutElement=driver.findElement(By.linkText("Logout"));
		LogoutElement.click();
		Thread.sleep(10000);
		driver.close();
		}
	
		}
		
	


