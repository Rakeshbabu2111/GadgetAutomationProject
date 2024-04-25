package testObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SnapdealHomePage {
	
	WebDriver driver;
	
	//Locators...
	By text_searchBox_loc=By.id("inputValEnter");
	
	By btn_search_loc=By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[2]/button/span");
	
	    
	//Constructor
	public SnapdealHomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	// Set “Bluetooth headphone” in textbox
	public void setSearchBox(String strSearchItem) {
		
		driver.findElement(text_searchBox_loc).sendKeys(strSearchItem);
		
	}
	
	// Click on Search button
	public void clickSearchBtn() {
		
		driver.findElement(btn_search_loc).click();
		
	}
	
	

}
