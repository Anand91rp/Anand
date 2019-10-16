package xpat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drgdrp {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Testproject\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		

		WebElement src1 = driver.findElement(By.id("credit2"));
		WebElement des1 = driver.findElement(By.id("bank"));
		
		Actions acc = new Actions(driver);
		
		acc.dragAndDrop(src1, des1).perform();
		
		WebElement src2 = driver.findElement(By.id("fourth"));
		WebElement des2 = driver.findElement(By.id("amt7"));

		
		acc.dragAndDrop(src2, des2).perform();	
		
		
}
}