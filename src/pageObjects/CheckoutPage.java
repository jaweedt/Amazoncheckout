package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {
	
	  public WebDriver driver;  
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
	}

	    
	By cart = By.id("nav-cart");
	By checkout = By.name("proceedToRetailCheckout");
	By fullName = By.id("address-ui-widgets-enterAddressFullName");
	By mobile = By.id("address-ui-widgets-enterAddressPhoneNumber");
	By postal = By.id("address-ui-widgets-enterAddressPostalCode");
	By address1 = By.id("address-ui-widgets-enterAddressLine1");
	By address2 = By.id("address-ui-widgets-enterAddressLine2");
	By addresstype = By.id("address-ui-widgets-addr-details-address-type-and-business-hours");
	By addTypeselect = By.xpath("//li/a[@data-value='RES']");
	
	By submit =  By.id("address-ui-widgets-form-submit-button");
	
	
	
	
	public WebElement clickaddCart()
	{
		return driver.findElement(cart);
	}

	public WebElement clickCheckout()
	{
		return driver.findElement(checkout);
	}

	public WebElement entername()
	{
		return driver.findElement(fullName);
	}

	public WebElement enterMobile()
	{
		return driver.findElement(mobile);
	}

	public WebElement enterPostal()
	{
		return driver.findElement(postal);
	}

	public WebElement enterAddress1()
	{
		return driver.findElement(address1);
	}

	public WebElement enterAddress2()
	{
		return driver.findElement(address2);
	}

	public WebElement enterAddressType()
	{
		return driver.findElement(addresstype);
		

	}
	
	public WebElement addressTypeselect()
	{
		return driver.findElement(addTypeselect);
		

	}
	public WebElement hitSubmit()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(4));
		w.until(ExpectedConditions.invisibilityOf(driver.findElement(addTypeselect)));
			return w.until(ExpectedConditions.elementToBeClickable(driver.findElement(submit)));
		
		 
	}

	
	
	
	
	
}
