package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.loginPage;
import resources.base;

public class Login extends base {
	
	
	public WebDriver driver;
@BeforeTest	
	public void initDriver()
	{
	 driver = driverInit();
	}
	
	
	
	@Test public void loginFlow(WebDriver driver)
	{
		
		
		
		loginPage lp = new loginPage(driver);
		driver.get("https://www.amazon.in/");
		lp.clickLogin().click();
		lp.getUsername().sendKeys("jaweed.thahir@outlook.com");
		lp.clickContinue().click();
		lp.getPassword().sendKeys("Tester@2353");
		lp.hitSubmit().click();
		
		
	}
	

	
	

}
