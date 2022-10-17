package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']//tr"));
		List<WebElement> cells=driver.findElements(By.xpath("//table[@id='customers']//td"));
		List<WebElement> Hcells=driver.findElements(By.xpath("//table[@id='customers']//th"));
		for(int i=1; i<=rows.size(); i++) {
			List<WebElement>row_cells;
			if(i==1) {
				row_cells= driver.findElements(By.xpath("//table[@id='customers']//tr["+i+"]/th"));
			}
			else {
				row_cells= driver.findElements(By.xpath("//table[@id='customers']//tr["+i+"]/td"));
}
			for(int j=0; j<row_cells.size(); j++) {
				System.out.print(row_cells.get(j).getText()+"  ");
			}
			System.out.println();
		}
}
}