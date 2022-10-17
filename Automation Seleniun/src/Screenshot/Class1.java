package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Class1 {
	static WebDriver driver;
	static void screenshot( String filename) throws IOException {
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Software Testing\\Automation\\Selenium\\Screenshot"+filename+".jpg");
		FileHandler.copy(source, dest);

		}
}
