package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver driver;

	@FindBy(xpath="//*[@id=\"user-name\"]")
	WebElement Username;
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement Password;
	@FindBy(xpath="//*[@id=\"login-button\"]")
	WebElement LoginButton;
	
	
	
	
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void setValues(String username,String pass)
	{
		Username.clear();
		Username.sendKeys(username);
		Password.clear();
		Password.sendKeys(pass);
		
		
	}
	
	public void loginClick()
	{
		LoginButton.click();
	}
     

}
