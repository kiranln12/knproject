import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class class2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://chrome.com/");
	Options op=driver.manage();
	Window wn=op.window();
	wn.maximize();
	Thread.sleep(2000);
	Dimension d1=new Dimension(100, 400);
	wn.setSize(d1);
	Thread.sleep(2000);
	Point p1=new Point(400,100);
	wn.setPosition(p1);
	Thread.sleep(2000);
	driver.quit();
	
}
}

