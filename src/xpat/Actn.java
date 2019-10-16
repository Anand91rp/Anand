package xpat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actn {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Testproject\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		
		driver.get("http://www.greenstechnologys.com/mobile-application-testing-training-in-chennai.html");
		
		//Mouse over 1
		
		WebElement mov1 = driver.findElement(By.xpath("//a[text()='COURSES']"));
		
		Actions m1 = new Actions(driver);
		
		m1.moveToElement(mov1).perform();
		
		//Mouse over 2
					
       WebElement mov2 = driver.findElement(By.xpath("//span[text()='Oracle Training']"));

		m1.moveToElement(mov2).perform();
		
		//click
		
	   WebElement btn = driver.findElement(By.xpath("//span[text()='Oracle SQL ']"));

		btn.click();

}
}
