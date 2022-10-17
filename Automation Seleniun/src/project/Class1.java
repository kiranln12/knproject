package project;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class1 {
public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
	    WebElement w1=driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.moveToElement(w1).click().perform();
		Thread.sleep(3000);
        w1.sendKeys("j");
        Thread.sleep(3000);
		WebElement w=driver.findElement(By.xpath("//a[text()=\"AVA Tutorial\"]"));
        w.click();
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@title='JavaScript Tutorial']")).click();
        Thread.sleep(3000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
   		js.executeScript("window.scrollBy(0,3500)");
        driver.findElement(By.xpath("//a[text()='JS Popup Alert']")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_confirm']")).click();
        Thread.sleep(2000);
        ArrayList<String> A=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(A.get(2));
        Thread.sleep(2000);

        /*Set<String> s1=driver.getWindowHandles();
       for(String w2: s1) {
    	   System.out.println(w2);
       }*/
       
     WebElement frame=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
          driver.switchTo().frame(frame);
          Thread.sleep(2000);
       driver.findElement(By.xpath("//button[text()='Try it']")).click();
       Thread.sleep(2000);
       Alert alt=driver.switchTo().alert();
       alt.accept();
       Thread.sleep(2000);
       driver.switchTo().parentFrame();
       driver.findElement(By.xpath("//a[@title='Change Theme']")).click();
       Thread.sleep(2000);
       driver.close();
       driver.switchTo().window(A.get(1));
       driver.close();
       Thread.sleep(2000);
       driver.switchTo().window(A.get(0));
       WebElement html=driver.findElement(By.xpath("//a[@href='/html/default.asp'][1]")); 
       Thread.sleep(2000); 
       act.moveToElement(html).click().perform();
       
		js.executeScript("window.scrollBy(0,3000)");
        
}
}
