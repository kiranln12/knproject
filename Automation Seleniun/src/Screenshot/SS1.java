package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class SS1 {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Dell\\Downloads\\geckodriver-v0.31.0-win32\\geckodriver.exe");
	WebDriver driver =new FirefoxDriver();
	driver.get("https://www.facebook.com/");
Thread.sleep(2000);
File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File dest= new File("D:\\Software Testing\\Automation\\Selenium\\Screenshot.test3.jpg");
FileHandler.copy(source, dest);

}
}
