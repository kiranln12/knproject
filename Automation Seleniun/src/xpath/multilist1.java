package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multilist1 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver(); 
driver.get("http://practice.cybertekschool.com/dropdown");
	driver.findElement(By.xpath("//select[@name='Languages']"));
	WebElement list=driver.findElement(By.xpath("//select[@name='Languages']"));
	Select s=new Select(list);
	s.selectByIndex(0);
	s.selectByIndex(1);
	s.selectByIndex(3);
	WebElement fs=s.getFirstSelectedOption();
	System.out.println(fs.getText());//java
	List<WebElement>fs2=s.getOptions();
	List<WebElement> fs1=s.getAllSelectedOptions();
System.out.println(fs2.size());//6
	System.out.println(fs1.size());//3
	}
}