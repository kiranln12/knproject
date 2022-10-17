import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class4 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/accounts/emailsignup/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type=\'text\'][1]")).sendKeys("9815478965");
    //driver.navigate().refresh();
	driver.findElement(By.xpath("//input[@type=\'text\'][2]")).sendKeys("yadav");
}
}