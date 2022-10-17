package scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(2000);
		WebElement tr= driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_prompt']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView(true)",tr);
		//js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("arguments[0].scrollIntoView(true)",tr);
}
}