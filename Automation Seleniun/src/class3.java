import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;


public class class3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
driver.get("https://chrome.com/");
Options op=driver.manage();
Window wn=op.window();
wn.maximize();
Thread.sleep(2000);
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());
driver.navigate().to("https://www.facebook.com/");
Thread.sleep(2000);
Navigation nv=driver.navigate();
nv.back();
Thread.sleep(3000);
Dimension d1=new Dimension(200,400);
wn.setSize(d1);
Thread.sleep(2000);
Point p1=new Point(100,500);
wn.setPosition(p1);
Thread.sleep(2000);
wn.maximize();
Thread.sleep(2000);
nv.forward();
nv.refresh();
Thread.sleep(2000);
driver.quit();
}
}
