package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class class1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
//driver.findElement(By.xpath("//input[@type=\'text\']")).sendKeys("9850818528");
//Thread.sleep(3000);
//driver.findElement(By.xpath("//input[@type=\'password\']")).sendKeys("jaimotadi");
//Thread.sleep(3000);
//driver.findElement(By.xpath("//button[@value=\'1\']")).click();
Thread.sleep(3000);
String t= driver.findElement(By.linkText("Forgotten password?")).getText();
System.out.println(t);
}
}
