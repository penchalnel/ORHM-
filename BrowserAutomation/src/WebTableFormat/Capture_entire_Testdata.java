package WebTableFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_entire_Testdata {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
		WebDriver driver =null;
		String url="https://www.timeanddate.com/worldclock/";
		driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(10000);
		driver.manage().window().maximize();
		///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
		///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[1]/a
		///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]
//		String part1="/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody//tr[";
//		String part2="]/td[1]";
		for(int i=1;i<=36;i++) {
			for(int j=1;j<=8;j++) {
	String data=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td["+j+"]")).getText();
	System.out.print(data+" ");
			
			}
		System.out.println();	
			
			
			
			
			
			
			
			
			
		}
		

	}

}
