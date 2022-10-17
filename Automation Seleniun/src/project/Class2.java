package project;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Class2 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://paytm.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement ticket=driver.findElement(By.xpath("//div[@class=\"_2EGQY\"][4]"));
    JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", ticket);
	Thread.sleep(2000);
	Actions act= new Actions(driver);
	act.moveToElement(ticket).click().perform();
	Thread.sleep(2000);
	WebElement from=driver.findElement(By.xpath("//div[@data-reactid=\"149\"]//input"));
	from.click();
	from.sendKeys("CSMT");
	Thread.sleep(2000);
	WebElement source=driver.findElement(By.xpath("//div[text()='CSMT - C Shivaji Mah T']"));
	act.moveToElement(source).click().perform();
	Thread.sleep(2000);
	WebElement to=driver.findElement(By.xpath("//div[@data-reactid=\"162\"]//input"));
	to.click();
	to.sendKeys("Pune");
	Thread.sleep(2000);
	WebElement dest=driver.findElement(By.xpath("//div[text()='PUNE - Pune Jn']"));
	act.moveToElement(dest).click().perform();
	Thread.sleep(2000);
	WebElement calender=driver.findElement(By.xpath("//img[@data-reactid=\"178\"]"));
	act.moveToElement(calender).click().perform();
	Thread.sleep(2000);
	WebElement date=driver.findElement(By.xpath("//div[text()='25']"));
	date.click();
	Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@class=\"button button--default button--bold _1r6Q\"]")).click();
	Thread.sleep(2000);

    WebElement train=driver.findElement(By.xpath("//div[text()='csmt chennai ex']"));
	//train.click();
    js.executeScript("window.scrollBy(0,8000)");
	Thread.sleep(2000);
driver.findElement(By.xpath("//div[@class='_3fB4']")).click();
Thread.sleep(2000);





/*Date ss= new Date();
	//ss.toString().replace(0, 0)
	
	
	
	}
	static void screenshot(String filename) throws IOException {
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("D:\\Software Testing\\Automation\\Selenium\\Screenshot\""+filename+".jpg");
	FileHandler.copy(source, dest);
	}*/
}
}