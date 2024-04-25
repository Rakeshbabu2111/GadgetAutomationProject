package testScenario;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import testObjectRepository.SnapdealHomePage;
import testObjectRepository.SnapdealSearchPage;
import userDefinedLibraries.DriverSetup;
import userDefinedLibraries.TakeScreenshot;

public class TestSnapdealPage {
	
	public static WebDriver driver;	
	public static String browser="Chrome";
	public static DriverSetup driversetup;
	TakeScreenshot takesscreenshot;	
	SnapdealHomePage objHomePage;
	SnapdealSearchPage objSearchPage;
	
	public static void driverconfig(String browser)
    {
	 	//Instantiate driver 
    	driver=DriverSetup.driverInstantiate(browser);   
    }
	
	public void test_HomePage() {
        objHomePage=new SnapdealHomePage(driver);
		objHomePage.setSearchBox("Bluetooth headphone");
		objHomePage.clickSearchBtn();
	
	}
	public void test_searchPage() throws IOException, InterruptedException {
		objSearchPage=new SnapdealSearchPage(driver);
		objSearchPage.setSortBy();
		objSearchPage.setSortByListItem();
		objSearchPage.setPriceRange();
		objSearchPage.setGo();
		Thread.sleep(5000);
		objSearchPage.setPrintNameAndPrice();	
		takesscreenshot=new TakeScreenshot(driver);
		takesscreenshot.takeScreenshot("Bluetooth headphone");
		
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {	
		driversetup=new DriverSetup();
		TestSnapdealPage testsnapdealpage=new TestSnapdealPage();
		driverconfig(browser);
		testsnapdealpage.test_HomePage();
		testsnapdealpage.test_searchPage();
		DriverSetup.driverTearDown();
	
	}
	

}
