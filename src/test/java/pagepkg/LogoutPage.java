package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	
	
	WebDriver driver;

	@FindBy(xpath="//*[@id=\"react-burger-menu-btn\"]")
	WebElement  HamBurgerMenu;
	
	@FindBy(xpath="//*[@id=\"logout_sidebar_link\"]")
	WebElement Logout;
	
	
	public LogoutPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickHamBurgerMenu()
	{
		HamBurgerMenu.click();
	}
    public void clickLogout()
    {
    	Logout.click();
    }
	
	

}
