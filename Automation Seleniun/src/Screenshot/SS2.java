package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SS2 {
	static WebDriver driver;
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
    driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	screenshot("kit");
	screenshot("fb2");
	screenshot("fb3");


}
static void screenshot( String filename) throws IOException {
File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File dest=new File("D:\\Software Testing\\Automation\\Selenium\\Screenshot"+filename+".jpg");
FileHandler.copy(source, dest);

}

}
