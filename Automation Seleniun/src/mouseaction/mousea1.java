package mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousea1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
Thread.sleep(2000);
WebElement dd=driver.findElement(By.xpath("//li[@id='credit2']"));
WebElement dd1=driver.findElement((By.xpath("//li[@class='placeholder']")));
Actions act=new Actions(driver);
act.dragAndDrop(dd, dd1).perform();
WebElement dd2=driver.findElement(By.xpath("//li[@data-id='2']"));
WebElement dd3=driver.findElement((By.xpath("//ol[@id='amt7']")));
act.dragAndDrop(dd2, dd3).perform();
WebElement dd4=driver.findElement(By.xpath("//li[@data-id='6']"));
WebElement dd5=driver.findElement((By.xpath("//ol[@id=\"loan\"]")));
act.dragAndDrop(dd4, dd5).perform();
WebElement dd6=driver.findElement(By.xpath("//li[@id='fourth'][2]"));
WebElement dd7=driver.findElement((By.xpath("//ol[@id='amt8']")));
act.dragAndDrop(dd6, dd7).perform();
}
}
