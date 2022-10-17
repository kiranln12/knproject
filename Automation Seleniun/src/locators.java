import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	Thread.sleep(3000);
	driver.findElement(By.name("email")).sendKeys("kiranN");
	Thread.sleep(3000);
	driver.findElement(By.id("pass")).sendKeys("passward");
	Thread.sleep(3000);
	driver.findElement(By.name("login")).click();
	
}
}
