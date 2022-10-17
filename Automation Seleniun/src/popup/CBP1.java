package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CBP1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.w3schools.com/js/js_popup.asp");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_confirm']")).click();
Thread.sleep(2000);
//driver.findElement(By.xpath("//a[href='tryit.asp?filename=tryjs_prompt']"))
//'href="tryit.asp?filename=tryjs_prompt'




}
}
