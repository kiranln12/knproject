package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Banking {
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.demo.guru99.com/V4/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement username =driver.findElement(By.xpath("//input[@type='text']"));
	username.click();
	username.sendKeys("mngr444367");
	Thread.sleep(2000);
	WebElement passward =driver.findElement(By.xpath("//input[@type=\"password\"]"));
	passward.click();
	passward.sendKeys("jyqeheg");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	Thread.sleep(3000);
	driver.quit();
}
}