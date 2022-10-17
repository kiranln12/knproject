package project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class3 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@aria-label='Open Menu']")).click();
		Thread.sleep(2000);
Actions act=new Actions(driver);
WebElement s=driver.findElement(By.xpath("//a[text()='Amazon Prime Video']"));
act.moveToElement(s).click().perform();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@class=\'nav-sprite hmenu-close-icon\']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("h");
Thread.sleep(2000);
driver.findElement(By.xpath("//span[text()=\"air dryer\"]")).click();
	Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
Thread.sleep(2000);
WebElement img=driver.findElement(By.xpath("//img[@alt=\"Starting ₹6,999\"]"));
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].scrollIntoView(true)", img);
img.click();
Thread.sleep(2000);
WebElement s1=driver.findElement(By.xpath("//a[@title=\"Samsung Galaxy M13 (Midnight Blue, 4GB, 64GB Storage) | 6000mAh Battery | Upto 8GB RAM with RAM Plus\"]"));
act.doubleClick(s1).perform();

//driver.navigate().back();










	}
}