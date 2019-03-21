package com.Login_Fuctionality_OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_OHRM {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver=new ChromeDriver();
		 String Username="Admin";
		 String Password="admin123";
		String url="https://opensource-demo.orangehrmlive.com/";
		driver.get(url);
		WebElement UsernameElement=driver.findElement(By.id("txtUsername"));
		UsernameElement.sendKeys("Admin");
		WebElement PasswordElement=driver.findElement(By.id("txtPassword"));
		PasswordElement.sendKeys("admin123");
		WebElement LOGIN=driver.findElement(By.id("btnLogin"));
		LOGIN.click();
		String expected_LOGINText="Welcome";
		System.out.println("The expected text after Login Successful is:"+expected_LOGINText);
		//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		WebElement WelcomeAdminElement=driver.findElement(By.linkText("Welcome Admin"));
		String actual_LOGINText=WelcomeAdminElement.getText();
		System.out.println("The actual text after Login Successful is:"+actual_LOGINText);
		if(actual_LOGINText.contains(expected_LOGINText))
		{
			System.out.println("OrangeHRM Page successfully loged in-PASS");
		}
		else
		{
		System.out.println("OrangeHRM Page login unsuccessful-FAIL ");
		
		}
		//<input name="txtUsername" id="txtUsername" type="text">
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">	
		//<a href="/index.php/auth/logout">Logout</a>
	
		
		
		System.out.println();
		WelcomeAdminElement.click();
	    Thread.sleep(10000);
		WebElement Logout=driver.findElement(By.linkText("Logout"));	
		Logout.click();
		driver.quit();	
		
		
		
		
		
		

	}

}
