package Frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fram {
	
	public static void main(String[] args){

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Testproject\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		List<WebElement> frames =driver.findElements(By.tagName("iframe"));
		
		int frameCount = frames.size();
		System.out.println(frameCount);
		

		if(frameCount>1) {
			driver.switchTo().frame(0);
			WebElement mail = driver.findElement(By.id("email"));
			mail.sendKeys("mail");}
		
		if(frameCount>1) {
			driver.switchTo().frame(1);
			WebElement mail = driver.findElement(By.id("email"));
			mail.sendKeys("mail");}
		
		}
		

}
