package WebTableFormat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingFirstColomndata {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
		WebDriver driver =null;
		String url="https://www.timeanddate.com/worldclock/";
		driver = new ChromeDriver();
		driver.get(url);
		//Thread.sleep(10000);
		driver.manage().window().maximize();
		///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[1]
		///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]/a
															
	List<WebElement>totalRows=driver.findElements(By.xpath("//table[@class='zebra fw tb-theme']/tbody/tr")); 	
	
    for(int i=1;i<=totalRows.size();i++) {
    	System.out.println();
    	List<WebElement>totalColumns=driver.findElements(By.xpath("//table[@class='zebra fw tb-theme']/tbody/tr["+i+"]/td"));
    	for(int j=0;j<totalColumns.size();j++) {    		
    		String cellvalue=totalColumns.get(j).getText();
    		System.out.print("| "+cellvalue+"|"); 	
    	}
    	
    }
    	
	}

}
