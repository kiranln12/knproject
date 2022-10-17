package scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.w3schools.com/js/js_popup.asp");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_confirm']"));
	Thread.sleep(2000);
WebElement confirm=	driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_confirm']"));
JavascriptExecutor js=(JavascriptExecutor)driver;

//js.executeScript("arguments[0].scrollIntoView(true)", confirm);
//js.executeScript("window.scrollBy(0,1000)");
//js.executeScript("window.scrollBy(0,3000)");
//js.executeScript("window.scrollBy(1000,4000)");
//js.executeScript("window.scrollBy(1000,4000)");
//js.executeScript("window.scrollBy(5000,4000)");// scrolls to extreame bottom
//js.executeScript("window.scrollBy(-1000,4000)");//scrolls to extream
//js.executeScript("window.scrollBy(-1000,2000)");
js.executeScript("window.scrollBy(-5000,0)");






}
}
