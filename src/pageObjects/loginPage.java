package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage {

	
	WebDriver driver;
	
	public loginPage(WebDriver driver){
		
		this.driver = driver;
	}
	
	
	By loginin = By.cssSelector("a[id*='nav-link-accountList']");
	By username = By.id("ap_email");
	By continueBtn= By.id("continue");
	By passwrd = By.id("ap_password");
	By submit = By.id("signInSubmit");
	
	
	public WebElement clickLogin()
	{
		return driver.findElement(loginin);
		}
	
	public WebElement getUsername()
	{
		return driver.findElement(username);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(passwrd);
	}
	
	public WebElement clickContinue()
	{
		return driver.findElement(continueBtn);
	}
	
	public WebElement hitSubmit()
	{
		return driver.findElement(submit);
	}
	
	
	
	

}
