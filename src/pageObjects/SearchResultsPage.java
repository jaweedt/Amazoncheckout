package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage {

	
		
		WebDriver driver;
		
		public SearchResultsPage(WebDriver driver){
			
			this.driver=driver;
		}
			
			
			
		By items =By.xpath("//div/h2/a/span");
		By add= By.id("add-to-cart-button");
		
			
			
			
			
			
			
			public List<WebElement> getitem()
			{
				return driver.findElements(items);
				
				
			}
	
			public WebElement addToCart()
			{
				return driver.findElement(add);
				
				
			}
}



