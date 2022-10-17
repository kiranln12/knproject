package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multioptionlist {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://practice.cybertekschool.com/dropdown");
Thread.sleep(3000);
driver.manage().window().maximize();
WebElement lan=driver.findElement(By.xpath("//select[@name='Languages']"));
Thread.sleep(3000);
Select sel=new Select(lan);
sel.selectByValue("java");
Thread.sleep(2000);
sel.selectByValue("js");
Thread.sleep(2000);
sel.selectByIndex(2);//c#
Thread.sleep(2000);
sel.selectByValue("ruby");

WebElement fs=sel.getFirstSelectedOption();
System.out.println(sel.getFirstSelectedOption().getText());//java
List<WebElement>l1=sel.getOptions();
List<WebElement>l=sel.getAllSelectedOptions();
System.out.println(l.size());//6
System.out.println(l1.size());//6
for(int i=0; i<l1.size();i++) {
	System.out.println(l1.get(i).getText());
}
//System.out.println(fs);
System.out.println(fs.getText());
System.out.println(sel.isMultiple());
/*sel.deselectByVisibleText("Ruby");//ruby
sel.deselectByIndex(2);//c#
sel.deselectByIndex(4);//ruby
sel.deselectAll();*/

}
}
