package popup;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CBP {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.w3schools.com/js/js_popup.asp");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_confirm']")).click();
Thread.sleep(3000);
ArrayList<String>ar=new ArrayList<String>(driver.getWindowHandles());
System.out.println(ar.get(0));
System.out.println(ar.get(1));
System.out.println(ar.get(2));
String expR="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";

driver.switchTo().window(ar.get(1));
String ActR=driver.getCurrentUrl();

if(expR.equals(ActR)) {
	System.out.println("correct window");
}
else {
	System.out.println("wrong window");
	
}
Thread.sleep(3000);

driver.findElement(By.xpath("//a[text()='PYTHON']")).click();


}
}
