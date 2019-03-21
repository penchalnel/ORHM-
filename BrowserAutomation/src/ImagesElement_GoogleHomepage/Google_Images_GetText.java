package ImagesElement_GoogleHomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Images_GetText {

	public static void main(String[] args) {
		WebDriver driver = null;
		driver=new ChromeDriver();
		String url="http://google.com";
		driver.get(url);
		driver.findElement(By.className("gb_P")).click();
		
		
		

	}

}
