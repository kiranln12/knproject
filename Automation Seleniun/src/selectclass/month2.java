package selectclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class month2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
driver.findElement(By.xpath("//select[@id='month']"));
WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
Select s1=new Select(month);
List<WebElement>list=s1.getOptions();
ArrayList<String> ar= new ArrayList();

for(WebElement w:list) {
	System.out.println(w.getText());
	//String data=w.getText();
	ar.add(w.getText());
}
Collections.sort(ar);
System.out.println("***");
for(String s:ar) {
	System.out.println(s);
}
System.out.println("***");
for(int i=ar.size()-1; i>0; i--) {
	System.out.println(ar.get(i));
}
}
}
