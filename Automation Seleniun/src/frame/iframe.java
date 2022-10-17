package frame;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.w3schools.com/js/js_popup.asp");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert']")).click();
	Thread.sleep(2000);
//ArrayList<String>ar=new ArrayList<String>(driver.getWindowHandles());
//driver.switchTo().window(ar.get(1));
Thread.sleep(2000);
driver.findElement(By.xpath("//a[@title='Change Theme']")).click();
 WebElement tryitframe= driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
 //driver.switchTo().frame(tryitframe);
	//driver.switchTo().parentFrame();
 driver.switchTo().defaultContent();
	Thread.sleep(2000);

	driver.findElement(By.xpath("//a[@title='Change Theme']")).click();

}
}
