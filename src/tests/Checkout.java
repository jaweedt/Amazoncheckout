package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import pageObjects.CheckoutPage;
import resources.base;

public class Checkout extends base {

	public WebDriver driver;
	
	
	
	@BeforeTest	
	public void initDriver()
	{
	 driver = driverInit();
	}
	
	public void checkoutfromcart(WebDriver driver)
	{
		
		CheckoutPage cp = new CheckoutPage(driver);
		cp.clickaddCart().click();
		cp.clickCheckout().click();
		cp.entername().sendKeys("Jaweed Thahir");
		cp.enterMobile().sendKeys("9497375530");
		cp.enterPostal().sendKeys("560068");
		cp.enterAddress1().sendKeys("202, BTM STAGE 2");
		cp.enterAddress2().sendKeys("Bangalore");
	//	cp.enterAddressType().selectByValue("RES");
	//	cp.hitSubmit().click();
		
		
		
		
	}
	
	
}
