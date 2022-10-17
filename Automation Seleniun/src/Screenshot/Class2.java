package Screenshot;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 extends Class1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		screenshot("kit");
		
}
}