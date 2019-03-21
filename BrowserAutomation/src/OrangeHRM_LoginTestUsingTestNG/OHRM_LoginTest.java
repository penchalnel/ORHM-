package OrangeHRM_LoginTestUsingTestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OHRM_LoginTest {
    WebDriver driver = null; 
    String url="https://opensource-demo.orangehrmlive.com/";
    int rowCount=0;
    Workbook workbook=null;
    Sheet sheet=null;
    Row row=null;
  
	@BeforeTest
	public void setUp() throws IOException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		//FileInputStream file=new FileInputStream("C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\src\\com\\ExcelFiles\\MultipleTestData_ORHM.xlsx");
		FileInputStream file=new FileInputStream("C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\src\\com\\ExcelFiles\\MultipleTestData_ORHM11.xlsx");
		//FileOutputStream fileout=new FileOutputStream("C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\src\\com\\ExcelFiles\\MultipleTestData_ORHM.xlsx");
		
		workbook=new XSSFWorkbook(file);	
		
		sheet=workbook.getSheet("Sheet1");
		
		rowCount=sheet.getLastRowNum();
	}
	
		@Test
		public void LogIn() throws InterruptedException, IOException {
			
			for(int i=1;i<=rowCount;i++) {
				
			row=sheet.getRow(i);
			
			//Sheet.getRow(i);
			Cell usernamecell=row.getCell(0);
			Cell passwordcell=row.getCell(1);
					
			String Username=usernamecell.getStringCellValue();
			
			String Password=passwordcell.getStringCellValue();
						
			WebElement UsernameElement=driver.findElement(By.id("txtUsername"));
			UsernameElement.sendKeys(Username);
			WebElement PasswordElement=driver.findElement(By.id("txtPassword"));
			PasswordElement.sendKeys(Password);
		
		WebElement LOGIN=driver.findElement(By.id("btnLogin"));
		LOGIN.click();
			

		try {
			String expected_text="Welcome Admin";
		System.out.println("The expected text is:"+expected_text);
		
		//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		String actual_text=driver.findElement(By.id("welcome")).getText();

		
	System.out.println("The actual text is:"+actual_text);
	if(actual_text.contains(expected_text)) {
		System.out.println("Successfully Login-PASS");
		row.createCell(2).setCellValue("Successfully Login-PASS");
		FileOutputStream file1=new FileOutputStream("C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\src\\com\\ExcelFiles\\MultipleTestData_ORHM11.xlsx");
		workbook.write(file1);
	}}
	
			catch(Exception e) {
				String expected_AlertText="Invalid credentials";
				System.out.println("The expected Alert text is:"+expected_AlertText);
				//<span id="spanMessage">Invalid credentials</span>
				String actual_AlertText=driver.findElement(By.id("spanMessage")).getText();
					System.out.println("The actual Alert text is:"+actual_AlertText);
					if(actual_AlertText.contains(expected_AlertText)) {

		File Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshot, new File("./Screenshot/"+i+"_Iteration"+"erro_LogIn.PNG"));	
		
		System.out.println("LogIn Failed-FAIL");
		row.createCell(2).setCellValue("LogIn Failed-FAIL");
		
		FileOutputStream file1=new FileOutputStream("C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\src\\com\\ExcelFiles\\MultipleTestData_ORHM11.xlsx");
		workbook.write(file1);
		continue;
					}
			
			}
		//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		//<a href="/index.php/auth/logout">Logout</a>
		
	driver.findElement(By.id("welcome")).click();
	Thread.sleep(5000);
	WebElement Logout=driver.findElement(By.linkText("Logout"));
	Logout.click();
			}}
		@AfterTest
		public void teardown()
		{
			driver.close();
		}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

