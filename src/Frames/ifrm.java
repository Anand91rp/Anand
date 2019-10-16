package Frames;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ifrm {
	
	public static void main(String[] args){

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Testproject\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		
		driver.get("http://demo.guru99.com/test/guru99home/");

		
		driver.switchTo().frame("a077aase");
		WebElement image = driver.findElement(By.xpath("html/body/a/img"));
		
		image.click();
}
}