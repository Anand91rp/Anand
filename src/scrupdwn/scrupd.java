package scrupdwn;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrupd {

	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Testproject\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		WebElement tamil = driver.findElement(By.xpath("//a[text()='tamil']"));
		
			WebElement mail = driver.findElement(By.id("email"));
			
			
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			js.executeScript("argument[0].scrollIntoView(true)",tamil);
			
			Thread.sleep(3000);
			
			js.executeScript("argument[0].scrollIntoView(false)",mail);
			
}
}