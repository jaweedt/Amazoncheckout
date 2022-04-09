package tests;
import org.openqa.selenium.*;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.SearchResultsPage;
import pageObjects.loginPage;
import resources.base;

public class Additems extends base {

	
	public WebDriver driver;
	List<WebElement> al = new ArrayList<WebElement>();
	
	@BeforeTest	
	public void initDriver()
	{
	 driver = driverInit();
	}
	
	
	@Test public void searchandadd() throws InterruptedException, AWTException
	{
		Login l = new Login();
		
		l.loginFlow(driver);
	
		driver.get("https://www.amazon.in/");
		HomePage hp = new HomePage(driver);
		hp.searchBox().sendKeys(Keys.chord("Football",Keys.ENTER));
		SearchResultsPage sp = new SearchResultsPage(driver);
		al =sp.getitem();
		
		Actions a = new Actions(driver);
		
		
		for(int i=0;i<4;i++)
		{
			
			a.keyDown(Keys.CONTROL).build().perform();
		al.get(i).click();
		a.keyUp(Keys.CONTROL).build().perform();
			
		} 
		
Set<String> s = driver.getWindowHandles();
Iterator<String> it = s.iterator();


it.next();
while(it.hasNext())
{
driver.switchTo().window(it.next());

try {
	sp.addToCart().click();
}
catch (NoSuchElementException e){
	
	System.out.println("Unavailable item");
	
}
	}


Checkout co = new Checkout();
co.checkoutfromcart(driver);





	
	
	
	
	
	
	}	
	
	
}
