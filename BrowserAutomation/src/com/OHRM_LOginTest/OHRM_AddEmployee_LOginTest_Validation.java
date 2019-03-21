package com.OHRM_LOginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRM_AddEmployee_LOginTest_Validation {

	public static void main(String[] args)
	{
		
				System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
				WebDriver driver = null;
				driver=new ChromeDriver();
				 String Username="admin";
				 String Password="admin";
				String url="http://localhost/orangehrm/orangehrm-2.6/index.php";
				driver.get(url);
				driver.manage().window().maximize();
				
				
				WebElement UsernameElement=driver.findElement(By.name("txtUserName"));
				UsernameElement.sendKeys("admin");
				WebElement PasswordElement=driver.findElement(By.name("txtPassword"));
				PasswordElement.sendKeys("admin");
				WebElement LOGIN=driver.findElement(By.name("Submit"));
				LOGIN.click();
				WebElement PIMElement=driver.findElement(By.linkText("PIM"));
				PIMElement.click();
				
				//WebElement AddEmployeeElement=driver.findElement(By.xpath("//*[@id=\'pim\']/ul/li[2]/a/span"));
				//AddEmployeeElement.click();
				
				//<span class="drop current">PIM</span>
				/*String pageActualTitle=driver.getTitle();
				
				String pageExpectedTitle="OrangeHRM";
			    
			    
			    if(pageActualTitle.equalsIgnoreCase(pageExpectedTitle)) {
			    	System.out.println("Page title has been validated Successfully with equals Ignore Case");
			    } else 
			    {
			    	System.out.println("Page title has not been validated Successfully with equals Ignore Case");
			    } 
			    
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
				Thread.sleep(30000);
				driver.close();
				}
			
				}*/
				
			




	}

}
