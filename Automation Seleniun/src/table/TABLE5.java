package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TABLE5 {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	driver.manage().window().maximize();
	List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']//tr)"));
	System.out.println(rows.size());
	List<WebElement>cells=driver.findElements(By.xpath("//table[@id='customers']//td)"));
	System.out.println(cells.size());
	List<WebElement>Hcells=driver.findElements(By.xpath("//table[@id='customers']//th"));
	System.out.println(Hcells.size());
	System.out.println(cells.size()+Hcells.size());
	
	
	
}
}