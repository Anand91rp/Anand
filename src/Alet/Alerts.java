package Alet;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Testproject\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		
		WebElement btn = driver.findElement(By.xpath("//input[@value='SIGN IN']"));
		btn.click();
		
		
		//Handle the Alert
		
		Alert al = driver.switchTo().alert();
		
		String text = al.getText();
		System.out.println(text);
		Thread.sleep(2000);
		al.accept();
		
		
//		//Confirm Alert
//		
//		//To press ok button
//		
//		al.accept();
//		
//		//To press cancel button
//		
//		al.dismiss();
//		
//		
//		//prompt Alert  //To press ok button al.sendkeys("ok");  al.accept();
//		
//		al.sendKeys("ok");
//		al.accept();
//		
//		//To press cancel button
//		
//		al.sendKeys("cancel");
//		al.dismiss();

}
}
