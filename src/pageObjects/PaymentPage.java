package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentPage {

	public WebDriver driver;
	
	public PaymentPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	By addCardRadioBtn = By.xpath("(//input[@name='ppw-instrumentRowSelection'])[1]");
	By continueButton = By.id("pp-KuPwnU-117"); 
	By addCardDetails = By.xpath("//span/div/a[@class='a-link-emphasis pmts-add-cc-default-trigger-link']"); 
	By cardNumber = By.name("addCreditCardNumber");
	By cardName = By.name("ppw-accountHolderName");
	By cardExpMonth = By.name("ppw-expirationDate_month");
	By cardExpYear = By.name("ppw-expirationDate_year");
	
	By frame = By.id("pp-9MiHBB-86");
	By submitCard = By.name("ppw-widgetEvent:AddCreditCardEvent");
	
	
	public WebElement selectCardOption()
	{
		WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(10));
		return w.until(ExpectedConditions.visibilityOfElementLocated(addCardRadioBtn));
	}

	public WebElement addCardDetails()
	{
		return driver.findElement(addCardDetails);
	}

	public WebElement enterCardNumber()
	{
		return driver.findElement(cardNumber);
	}

	public WebElement enterCardName()
	{
		return driver.findElement(cardName);
	}

	public Select selectCardExpMonth()
	{
		 Select monthDropdown = new Select(driver.findElement(cardExpMonth));
		 return monthDropdown;
		
	}

	public Select selectCardExpYear()
	{
		 Select yearDropdown = new Select(driver.findElement(cardExpYear));
		return yearDropdown;
	}

	public WebElement submitCard()
	{
		return driver.findElement(submitCard);
	}

	/*public WebElement enterAddressType()
	{
		return driver.findElement(addresstype);
		

	}
	
	public WebElement addressTypeselect()
	{
		return driver.findElement(addTypeselect);
		

	}*/
	
	
}
