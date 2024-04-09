package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage {
	WebDriver driver;

	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
	WebElement Addcart;
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
	WebElement Cartbutton;
	@FindBy(xpath="//*[@id=\"checkout\"]")
	WebElement Checkout;
	
	
	
	public Cartpage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addToCart()
	{
		Addcart.click();
	}
	
	public void clickCartButton()
	{
		Cartbutton.click();
		
	}
	
	public void clickCheckOut()
	{
		Checkout.click();
	}
}
