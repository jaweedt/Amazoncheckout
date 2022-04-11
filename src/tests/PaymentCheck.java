package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.PaymentPage;
import resources.base;

public class PaymentCheck extends base{

	public WebDriver driver;
	
	
	public PaymentCheck(WebDriver driver)
	{
	this.driver=driver;	// TODO Auto-generated constructor stub
	}




	@BeforeTest	
	public void initDriver()
	{
	 driver = driverInit();
	}
	
	
	
	
	@Test public void addCardDetails () throws InterruptedException
	{
		
//		driver.get("https://www.amazon.in/");
//		LoginPage lp = new LoginPage(driver);
//		lp.clickLogin().click();
//		lp.getUsername().sendKeys("jaweed.thahir@outlook.com");
//		lp.clickContinue().click();
//		lp.getPassword().sendKeys("Tester@2353");
//		lp.hitSubmit().click();
//		driver.findElement(By.id("nav-cart")).click();
//		driver.findElement(By.name("proceedToRetailCheckout")).click(); 
//		driver.findElement(By.xpath("(//span[@class='a-button-inner'])[1]")).click();
//		Thread.sleep(3000);
		PaymentPage pp = new PaymentPage(driver);
		pp.selectCardOption().click();
		pp.addCardDetails().click();
		driver.switchTo().frame(driver.findElement(By.name("ApxSecureIframe")));
		pp.enterCardNumber().clear();
		pp.enterCardNumber().sendKeys("5497778051848604");  
		pp.enterCardName().sendKeys("Jaweed Thahir");
			pp.selectCardExpMonth().selectByValue("2");
			pp.selectCardExpYear().selectByValue("2024");
			pp.submitCard().click();
			
		
		
		
		
		
	}
	
	
	
	
}
