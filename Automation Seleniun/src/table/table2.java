package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']//tr"));//7
		System.out.println(rows.size());
		List<WebElement> Hcells=driver.findElements(By.xpath("//table[@id='customers']//th"));//3
        System.out.println(Hcells.size());
		List<WebElement> cells=driver.findElements(By.xpath("//table[@id='customers']//td"));//18
        System.out.println(cells.size());
        System.out.println(Hcells.size()+cells.size());//21
        for(WebElement cell:Hcells ) {
        	System.out.println(cell.getText());// return the header text company contact country
        }
        for(WebElement cell2:cells) {
        	System.out.println(cell2.getText());//return the all row text  
        }
}
}