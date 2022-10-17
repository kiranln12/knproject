package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='prompt']")).click();
Thread.sleep(2000);
Alert alt=driver.switchTo().alert();

alt.accept();
alt.dismiss();
alt.sendKeys(null);
alt.getText();


}
}
