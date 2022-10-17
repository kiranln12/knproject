package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table6 {
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
		System.out.println(hcells.size()+cells.size());
		for(int i=0; i<hcells.size();i++) {
			System.out.println(hcells.get(i).getText());
		}
		for(int j=0; j<cells.size(); j++) {
			System.out.println(cells.get(j).getText());
		}
		System.out.println("********");
		for(WebElement w : hcells) {
			System.out.println(w.getText());
			}
		for(WebElement w1 : cells) {
			System.out.println(w1.getText());
		}
}
}