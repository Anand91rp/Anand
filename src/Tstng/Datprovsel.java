package Tstng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datprovsel {
	
	@Test(dataProvider = "fff")
	public void test1(String i,String s) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Testproject\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();	
	
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	

	WebElement src = driver.findElement(By.id("email"));
	WebElement des = driver.findElement(By.id("pass"));
	
	src.sendKeys(i);
	des.sendKeys(s);
	
	}
	
  @DataProvider(name="fff")

public Object[][] data() {
return new Object [][]	{{87,"rahu"},{76,"tavi"},{58,"gun"}};

//or for parellel execution
//@DataProvider(name="fff", parallel = true)

//public Object[][] data() {
//return new Object [][]	{{87,"rahu"},{76,"tavi"},{58,"gun"}};
//}
  
  
	
}
}
