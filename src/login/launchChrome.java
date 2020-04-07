package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class launchChrome {

	protected WebDriver driver;
	
	@Test

	public void launchChrome(){
		// Chromebrowser
	
	System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");	
	ChromeDriver driver = new ChromeDriver();
	// Launch application URL
	driver.get("http://newtours.demoaut.com/");
	//Enter login credential for login
	driver.findElement(By.name("userName")).sendKeys("emurugan83");
	driver.findElement(By.name("password")).sendKeys("London@123");
	driver.findElement(By.xpath("//INPUT[@type='image']")).click();
	driver.close();
	
	}
	
	
	
}
