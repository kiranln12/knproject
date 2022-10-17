package selectclass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class month4 {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[@name='birthday_year']"));
	WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
Select sel= new Select(year);
List<WebElement>list=sel.getOptions();
//ArrayList<long>ar=new ArrayList();

	for(WebElement w:list) {
		System.out.println(w.getText());
	}
	
	}
}