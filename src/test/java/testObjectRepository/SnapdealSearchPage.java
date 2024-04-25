package testObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SnapdealSearchPage {
	
	WebDriver driver;
	
	
	//Locators....
	By btn_sortBy_loc=By.xpath("//*[@id=\"content_wrapper\"]/div[7]/div[5]/div[3]/div[1]/div/div[2]/div/span");
	
	By list_sortByListItem_loc=By.xpath("//*[@id='content_wrapper']/div[7]/div[5]/div[3]/div[1]/div/div[2]/ul/li");
	
	By text_startPrice_loc=By.name("fromVal");
	
	By text_endPrice_loc=By.name("toVal");
	
	By btn_go_loc=By.xpath("//*[@id=\"content_wrapper\"]/div[7]/div[4]/div/div[1]/div[2]/div[2]/div[3]/div/div[5]");
	
	By text_productsTitles_loc=By.className("product-title");
	
	By text_productPrices_loc=By.className("product-price");
	
	
	//Constructor....
	public SnapdealSearchPage(WebDriver driver) {
		this.driver=driver;
	}

	
	//Click on SortBy List box
	public void setSortBy() {
		driver.findElement(btn_sortBy_loc).click();
	}
	
	//Click on the Popularity from List Box
	public void setSortByListItem() {
		List<WebElement>list_sortByItems_element=driver.findElements(list_sortByListItem_loc);
		for(WebElement list:list_sortByItems_element) {
			if(list.getText().equals("Popularity")) {
				list.click();
				break;
			}
		}
	}
	
	//Select the price range between 700 to 1400
	public void setPriceRange() {
	    WebElement startPrice=driver.findElement(text_startPrice_loc);
	    		startPrice.clear();
	            startPrice.sendKeys("700");
	    WebElement endPrice=driver.findElement(text_endPrice_loc);
	    endPrice.clear();
	    endPrice.sendKeys("1400");
	}
	
	//Click on the Go Button
	public void setGo() {
		driver.findElement(btn_go_loc).click();
	}
	
	//Get and Print the First 5 Bluetooth Headphones names and prices in the console
	public void setPrintNameAndPrice() throws InterruptedException {
		

		List<WebElement>products=driver.findElements(By.className("product-title"));
		List<WebElement>prices=driver.findElements(By.className("product-price"));
		for(int i=0;i<5;i++) {
			if(i!=5) {
				System.out.println(products.get(i).getText()+"  "+prices.get(i).getText());
			}else {
				break;
			}
		  }
	    }

	}
	


