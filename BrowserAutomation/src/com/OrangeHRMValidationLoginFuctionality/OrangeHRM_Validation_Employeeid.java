package com.OrangeHRMValidationLoginFuctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_Validation_Employeeid {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver=new ChromeDriver();
		 String Username="Admin";
		 String Password="admin123";
		String url="https://opensource-demo.orangehrmlive.com/index.php/pim/addEmployee";
		driver.get(url);
		driver.manage().window().maximize();
			
		WebElement UsernameElement=driver.findElement(By.id("txtUsername"));
		UsernameElement.sendKeys("Admin");
		WebElement PasswordElement=driver.findElement(By.id("txtPassword"));
		PasswordElement.sendKeys("admin123");
		WebElement LOGIN=driver.findElement(By.id("btnLogin"));
		LOGIN.click();
		WebElement FullNameElement=driver.findElement(By.id("firstName"));
		FullNameElement.sendKeys("Penchalaiah");
		WebElement LastNameElement=driver.findElement(By.id("lastName"));
		LastNameElement.sendKeys("Nelaturu");
		
		WebElement Employeeid=driver.findElement(By.id("employeeId"));
		
		//<input class="formInputText valid" maxlength="10" type="text" name="employeeId" value="0010" id="employeeId">
		//*[@id="employeeId"]
		
		
		String expected_Title=Employeeid.getAttribute("value");
		System.out.println("The expected Title is:"+expected_Title);
		
		WebElement SaveElement=driver.findElement(By.id("btnSave"));
		SaveElement.click();
		
		WebElement Employeeid1=driver.findElement(By.id("personal_txtEmployeeId"));
		String actual_Title=Employeeid1.getAttribute("value");
		
		System.out.println("The actual Title is :"+ actual_Title);
		
		if(actual_Title.equals(expected_Title)) {
			
	  System.out.println("Currect Employeeid is displayed-PASS");
		}
		else {
			System.out.println("Incorrect Employeeid is displayed-FAIL");
		}
driver.close();
	}	
}

