package popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowserpop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.w3schools.com/js/js_popup.asp");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert']")).click();
	Thread.sleep(2000);
	String MW= driver.getWindowHandle();// it will give id of main window
	String expR= "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
	Set<String> s=driver.getWindowHandles();// it will give id of main and child window 

	for(String s1:s) {
		System.out.println(s1);// it will print the id of window
		driver.switchTo().window(s1);
		String actuR=driver.getCurrentUrl();
		if(expR.equals(actuR)) {
			System.out.println("correct window");
		}
		else {
			System.out.println("wrong window");
		}
	}
}
}
