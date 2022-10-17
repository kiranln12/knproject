package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multilist2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://practice.cybertekschool.com/dropdown");
WebElement lan= driver.findElement(By.xpath("//select[@name='Languages']"));
Select s1= new Select(lan);
s1.selectByIndex(1);
Thread.sleep(1000);
s1.selectByValue("ruby");
Thread.sleep(1000);
s1.selectByVisibleText("C");
Thread.sleep(1000);
s1.selectByValue("java");
List<WebElement> fs=s1.getAllSelectedOptions();
System.out.println(fs.size());
for(int i=0; i<fs.size();i++) {
	System.out.println(fs.get(i).getText());
}

}
}