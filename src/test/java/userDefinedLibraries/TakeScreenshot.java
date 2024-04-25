package userDefinedLibraries;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshot {
	public static String filepath="C:\\Users\\2327178\\eclipse-workspace\\GadgetAutomation\\src\\test\\java\\Screenshots\\";;
	WebDriver driver;
	public TakeScreenshot(WebDriver driver) {
		this.driver=driver;
		
	}
	
	//Take Screenshot of the Page
		public void takeScreenshot(String fileName) {
			TakesScreenshot s=(TakesScreenshot)driver;
			DateFormat dateformat=new SimpleDateFormat("dd-mm-yyyy h-m-s");
			Date date=new Date();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			File src=s.getScreenshotAs(OutputType.FILE);
			File trg= new File(filepath+fileName+"_"+dateformat.format(date)+".png");
			try {
			FileUtils.copyFile(src,trg);
			}
			catch(IOException e) {
				
			}
			System.out.println("Screenshot is taken...");
		}
}
