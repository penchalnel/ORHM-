package com.OHRM;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OHRM_LogInTest {

	WebDriver driver=null;
	String Url="https://opensource-demo.orangehrmlive.com/";
	//String Username="Admin";
	//String Password="admin2";

		@Given("^Open Chrome browser and navigate to OrangeHRM Application Url$")
		public void Open_Chrome_browser_and_navigate_to_OrangeHRM_Application_Url() 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(Url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}

		//@When("^User enter Valid Username and valid Password and click on Login button$")
		@When("^User enter Valid \"([^\"]*)\" and valid \"([^\"]*)\" and click on Login button$")

		//public void User_enter_Valid_Username_and_valid_Password_and_click_on_Login_button() 
		public void User_enter_Valid_and_valid_and_click_on_Login_button(String arg1USERNAME, String arg2PASSWORD) 
		{
			WebElement username=driver.findElement(By.id("txtUsername"));
			username.sendKeys(arg1USERNAME);
			WebElement password=driver.findElement(By.id("txtPassword"));
			password.sendKeys(arg2PASSWORD);
			WebElement LogIn=driver.findElement(By.id("btnLogin"));
			LogIn.click();
		}

		@Then("^User should be able to Successfully login to OrangeHRM and Close the application$")
		public void User_should_be_able_to_Successfully_login_to_OrangeHRM_and_Close_the_application() throws IOException
		{
       try {
    	   String expected_text="Welcome Admin";
    	   System.out.println("The expected Title is :"+expected_text);
    	   
    	   String actual_text=driver.findElement(By.id("welcome")).getText();
    	   System.out.println("The actual Title is:"+actual_text);
    	   if(actual_text.contains(expected_text)) {
    		   System.out.println("Successfully Login-PASS");
    	   }
       }
      catch(Exception e) {
       if(driver.findElement(By.id("spanMessage")).getText().equals("Invalid credentials")){
    	   
    	   File Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	   FileUtils.copyFile(Screenshot, new File("./Screenshot/img.png"));
    	   System.out.println("LogIn Failed-FAIL");
    	   driver.quit();
       }
	
		}
		driver.close();
}}
