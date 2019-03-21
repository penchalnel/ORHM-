package NewTours_Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTours_Register_Country_Select {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\BrowserAutomation\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver=new ChromeDriver();
		String url="http://newtours.demoaut.com/mercuryregister.php";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		register.click();
		WebElement Country=driver.findElement(By.name("country"));
		Select Selection=new Select(Country);
		Selection.selectByIndex(5);
		Thread.sleep(2000);
		Selection.selectByVisibleText("UGANDA");
		Thread.sleep(2000);
	Selection.selectByValue("125");
		
driver.close();
	}

}
