package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {

	WebDriver driver;

	@FindBy(xpath="//*[@id=\"first-name\"]")
	WebElement Firstname;
	@FindBy(xpath="//*[@id=\"last-name\"]")
	WebElement Lastname;
	@FindBy(xpath="//*[@id=\"postal-code\"]")
	WebElement Zip;
	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement Continue;
	
	
	public CheckOutPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void setCheckoutInfo()
	{
		Firstname.sendKeys("abcd");
		Lastname.sendKeys("efgh");
		Zip.sendKeys("6789");
		
	}
	
	public void clickContinue()
	{
		Continue.click();
	}
	
}
