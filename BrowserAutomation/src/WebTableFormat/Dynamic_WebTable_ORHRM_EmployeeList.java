package WebTableFormat;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_WebTable_ORHRM_EmployeeList {

	public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver=new ChromeDriver();
		 String Username="Admin";
		 String Password="admin123";
		String url="https://opensource-demo.orangehrmlive.com/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement UsernameElement=driver.findElement(By.id("txtUsername"));
		UsernameElement.sendKeys("Admin");
		WebElement PasswordElement=driver.findElement(By.id("txtPassword"));
		PasswordElement.sendKeys("admin123");
		WebElement LOGIN=driver.findElement(By.id("btnLogin"));
		LOGIN.click();
		
		WebElement PIMElement=driver.findElement(By.linkText("PIM"));
		PIMElement.click();
		driver.findElement(By.xpath("//*[@id='menu_pim_viewEmployeeList']")).click();
		
		List<WebElement>totalrows=driver.findElements(By.tagName("tr"));
		System.out.println("total row size is :  "+totalrows.size());
		//336
		List<WebElement>totalcolumns=driver.findElements(By.tagName("td"));
		
		//System.out.println("totalcolumns size in entire table is :  "+totalcolumns.size());

		for(int i=1;i<totalrows.size();i++) {
			System.out.println();
			//8
			List<WebElement>totalcolsinspecificrow=(List<WebElement>) totalrows.get(i).findElements(By.tagName("td"));
			//System.out.println("totalcolumns size in "+i+" is :"+totalcolsinspecificrow.size());
			for(int j=0;j<totalcolsinspecificrow.size();j++) {
				String cellData=totalcolsinspecificrow.get(j).getText();
				//if(!cellData.equals("")) {
				         System.out.print(cellData+" ");
				}
			System.out.println();
			}
		driver.close();
		}
	
	
	}		




