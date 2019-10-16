package Sereensst;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Srnshot {
	


	public static void main(String[] args) throws IOException{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Testproject\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://www.facebook.com/");
		
		//Type cast
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		
		//SS default location
		
		File src = tk.getScreenshotAs(OutputType.FILE);
		
		
		//Creating a new location
		
		File des = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Testproject\\screenshot\\anand.png");
		FileUtils.copyFile(src,des);
			
		

}
}