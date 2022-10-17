package selectclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
// how to fetch all the option from list box
public class month {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
Thread.sleep(2000);
driver.findElement(By.xpath("//select[@id='month']"));
Thread.sleep(2000);
WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
Select s= new Select(month);

List<WebElement>list= s.getOptions();
ArrayList<String>ar= new ArrayList();
for(WebElement w:list) {
	System.out.println(w.getText());
	String data =w.getText();
	ar.add(data);
}
/*Collections.sort(ar);
System.out.println("*****");
for(String s1:ar) {
	System.out.println(s1);
	
}*/

	
}




}

