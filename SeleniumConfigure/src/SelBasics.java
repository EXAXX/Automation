
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelBasics {

	public static void main(String[] args) {
	System.out.println("Murugan is a Great");
	
	/*System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver-v0.23.0-win32\\geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();*/
	
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://gmail.com");
	driver.findElement(By.id("identifierId")).sendKeys("emurugan83@gmail.com");
	driver.findElement(By.id("identifierNext")).click();
	driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("Apple@123");
	//driver.findElement(By("password")).sendKeys("Apple@123");
	//driver.findElement(By.id("identifierNext")).click();
	
	/*System.setProperty("webdriver.ie.driver","C:\\Selenium\\IEDriverServer\\IEDriverServer.exe");
	InternetExplorerDriver driver = new InternetExplorerDriver();*/
	
	System.out.println("Murugan is a Great");
	}

}
