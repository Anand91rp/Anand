package seltest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selen {
	
	public static void main(String[] args) {

	//Config the driver

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Testproject\\driver\\chromedriver.exe");
	
	//Launch the browser
	
	WebDriver driver = new ChromeDriver();
	
	//get - To navigate to the URL
	
	driver.get("https://www.facebook.com");
	
	//getTitle
	
	String title = driver.getTitle();
	System.out.println(title);
	
	//To getcurrentURL
	
	String cu = driver.getCurrentUrl();
	System.out.println(cu);
	
	
	//To locate using xpath
	
	WebElement mail = driver.findElement(By.id("email"));
	mail.sendKeys("Anu");
	
	//To locate using xpath with index
	
	WebElement pwd = driver.findElement(By.id("pass"));
	pwd.sendKeys("454515");
	
	//To verify the the one id, name or xpath
	
	
	
}
}
