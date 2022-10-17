package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ss3 {
 static WebDriver driver ;
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver =new ChromeDriver();

	driver.get("https://www.amazon.in/");
Date dt=new Date();
String filename=dt.toString().replace(":","_").replace(" ","_")+".png";
System.out.println(dt);
	//screenshot("bus");
	screenshot(filename);

}
    static void screenshot(String filename) throws IOException {
    File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest= new File("D:\\Software Testing\\Automation\\Selenium\\Screenshot"+filename);
	FileHandler.copy(source, dest);
	}
	
	
}