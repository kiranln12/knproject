package project;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.w3schools.com/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	//implicit
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // syntax for selenium version 3.14
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // // syntax for selenium version 4
	//driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	//explicit
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	WebElement ele= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
	//wait.until(ExpectedConditions.)
	//fluent
	Wait <WebDriver> fwait= new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(10)) // maximum waiting time
			.pollingEvery(Duration.ofSeconds(3))  //frequency
			.ignoring(NoSuchElementException.class); //condition
	WebElement ele1= fwait.until(new Function<WebDriver,WebElement>(){
		public WebElement apply (WebDriver driver) {
			return driver.findElement(By.xpath(""));
		}
	});  //limited time period
	
				
	
}
}
