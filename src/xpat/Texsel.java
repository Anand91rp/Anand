package xpat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Texsel {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Testproject\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://www.facebook.com/");
		
		
	
		//To get the attribute		
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("Anu");
		
		String att = mail.getAttribute("class");
		System.out.println(att);
		
		//To print the text present in the web site
				WebElement tx = driver.findElement(By.xpath("//span[text()='Create an account']"));
				String tex = tx.getText();
				System.out.println(tex);
				
				
				
				
		//To print the text present in the web site
				WebElement txs = driver.findElement(By.xpath("//div[contains(text(),'helps')]"));
				String texs = txs.getText();
				System.out.println(texs);
				
				
	}
}
