package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class4 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);


	driver.manage().window().maximize();
	WebElement name= driver.findElement(By.xpath("//input[@type='text']"));
	 name.click();
	 name.sendKeys("9850818528");
	 Thread.sleep(2000);
		WebElement pass= driver.findElement(By.xpath("//input[@type=\"password\"]"));
		pass.click();
		Thread.sleep(2000);
		 pass.sendKeys("jaimataci");
		 WebElement login= driver.findElement(By.xpath("//button[@name=\"login\"]"));
		 login.click();
			Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@class=\"_9ai5\"]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		 Thread.sleep(3000);
		 WebElement email= driver.findElement(By.xpath("//input[@id=\"identify_email\"]"));
		 email.click();
		 email.sendKeys("9850818528");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[text()='Search']")).click();
		 Thread.sleep(3000);
		 driver.navigate().back();
		 Thread.sleep(3000);
		 driver.navigate().back();
		 Thread.sleep(3000);
		 driver.navigate().back();
		 driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		 Thread.sleep(3000);
		 WebElement FN=driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
		 //FN.click();
		 FN.sendKeys("riya");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("sharma");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("9874563254");
		 Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-label=\"New password\"]")).sendKeys("148795632");
		Thread.sleep(3000);
		WebElement day=driver.findElement(By.xpath("//select[@id=\"day\"]"));
Select s1=new Select(day);
s1.selectByIndex(7);
Thread.sleep(3000);
WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
Select s2=new Select(month);
s2.selectByIndex(7);
Thread.sleep(3000);
WebElement year=driver.findElement(By.xpath("//select[@id=\"year\"]"));
Select s3=new Select(year);
s3.selectByIndex(26);
Thread.sleep(3000);
driver.findElement(By.xpath("//span[@data-type='radio']//input[1]")).click();
driver.navigate().back();
driver.navigate().refresh();

Thread.sleep(3000);
 /*WebElement name1= driver.findElement(By.xpath("//input[@type='text']"));
name1.click();
name1.sendKeys("9850818528");
Thread.sleep(2000);
	WebElement pass1= driver.findElement(By.xpath("//input[@type=\"password\"]"));
	pass1.click();
	pass1.sendKeys("jaimatadi");*/

	//Thread.sleep(2000);
 //driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
	//Thread.sleep(2000);

//WebElement ar=driver.findElement(By.xpath("//div[@class=\"z6erz7xo on4d8346 jkp44r48 l10tt5db s8sjc6am myo4itp8 ekq1a7f9 pym4i58u ldembo95 mwa1sm0y hi696u2r qmqpeqxj e7u6y3za qwcclf47 nmlomj2f\"]"));
//ar.click();
//Thread.sleep(2000);


}
}
