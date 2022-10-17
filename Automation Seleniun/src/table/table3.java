package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']//tr"));
		List<WebElement> cells=driver.findElements(By.xpath("//table[@id='customers']//td"));
		List<WebElement> Hcells=driver.findElements(By.xpath("//table[@id='customers']//th"));
for(int i=0; i<Hcells.size(); i++) {
	System.out.println(Hcells.get(i).getText());
}
for(int i=0; i<cells.size(); i++) {
	System.out.println(cells.get(i).getText());
}
		
	
	
	
	}
}