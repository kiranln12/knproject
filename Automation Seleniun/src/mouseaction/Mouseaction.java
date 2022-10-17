package mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_6b31gegj9g_e&adgrpid=60612964962&hvpone=&hvptwo=&hvadid=486380734074&hvpos=&hvnetw=g&hvrand=8354286746651237517&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=20462&hvtargid=kwd-49491430&hydadcr=14454_2154375&gclid=CjwKCAjwg5uZBhATEiwAhhRLHngRoqcpKVuBAMCXgyQa6F9VDGQC4cm5Ah9xPJZzfnd8ZYpeKExd3xoCPLoQAvD_BwE");
Thread.sleep(2000);
WebElement act= driver.findElement(By.xpath("//a[@href='/gp/browse.html?node=6648217031&ref_=nav_cs_fashion']"));
Actions a= new Actions(driver);
a.moveToElement(act).perform();
//a.contextClick().perform();
a.click().perform();
//a.doubleClick(act).perform();

}
}
