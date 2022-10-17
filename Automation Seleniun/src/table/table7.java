package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table7 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		List<WebElement>rows=driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(rows.size());
		List<WebElement>cells=driver.findElements(By.xpath("//table[@id='customers']//tr/td"));
		System.out.println(cells.size());
		List<WebElement>hcells=driver.findElements(By.xpath("//table[@id='customers']//tr/th"));
		System.out.println(hcells.size());
		for(int i=1; i<=rows.size(); i++) {
			List<WebElement>rowcells;
			if(i==1) {
			rowcells=driver.findElements(By.xpath("//table[@id='customers']//tr["+i+"]/th"));
		}
			else {
				rowcells=driver.findElements(By.xpath("//table[@id='customers']//tr["+i+"]/td"));
               }
			for(int j=0; j<rowcells.size(); j++) {
				System.out.print(rowcells.get(j).getText()+"  ");
				}
			System.out.println();
		
}
	}
}