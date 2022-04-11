package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import pageObjects.CheckoutPage;
import resources.base;

public class Checkout extends base {

	public WebDriver driver;
	
	
	
	public Checkout(WebDriver driver) {
	
		this.driver=driver;// TODO Auto-generated constructor stub
	}

	@BeforeTest	
	public void initDriver()
	{
	 driver = driverInit();
	}
	
	public void checkoutfromcart()
	{
		
		CheckoutPage cp = new CheckoutPage(driver);
		cp.clickaddCart().click();
		cp.clickCheckout().click();
		cp.entername().sendKeys("Jaweed Thahir");
		cp.enterMobile().sendKeys("9497375530");
		cp.enterPostal().clear();
		cp.enterPostal().sendKeys("673311");
		cp.enterAddress1().sendKeys("202, BTM STAGE 2");
		cp.enterAddress2().sendKeys("Bangalore");
		cp.enterAddressType().click();
		cp.addressTypeselect().click();
		cp.hitSubmit().click();
		
		
		
		
	}
	
	
}
