package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {
	
	
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
	}

	   public WebDriver driver;  
	By cart = By.id("nav-cart");
	By checkout = By.name("proceedToRetailCheckout");
	By fullName = By.id("address-ui-widgets-enterAddressFullName");
	By mobile = By.id("address-ui-widgets-enterAddressPhoneNumber");
	By postal = By.id("address-ui-widgets-enterAddressPostalCode");
	By address1 = By.id("address-ui-widgets-enterAddressLine1");
	By address2 = By.id("address-ui-widgets-enterAddressLine2");
	By addresstype = By.name("address-ui-widgets-addr-details-address-type-and-business-hours");
	WebElement addressdrop = driver.findElement(addresstype);
	Select addressDropdown = new Select(addressdrop);
	By submit =  By.cssSelector("span[id='address-ui-widgets-form-submit-button-announce']");
	
	
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
		return driver.findElement(address1);
	}

	//public Select enterAddressType()
	//{
	//	return addressDropdown;

	//}
	public WebElement hitSubmit()
	{
		
		return driver.findElement(submit);
	}

	
	
	
	
	
}
