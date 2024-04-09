package testpkg;

import java.time.Duration;

import org.testng.annotations.Test;

import basepkg.BaseClass;
import pagepkg.Cartpage;
import pagepkg.CheckOutPage;
import pagepkg.Loginpage;
import pagepkg.LogoutPage;
import utilities.Excelutils;

public class Logintest  extends BaseClass{
	@Test
	public void verifiyLoginWithValidCred()
	{
		Loginpage p1=new Loginpage(driver);
		String x1="E:\\LUMINAR\\Selenium\\TESTlogin.xlsx";
		String Sheet="Sheet1";
		int rowCount=Excelutils.getRowCount(x1, Sheet);
		for(int i=1;i<=rowCount;i++)
		{
			String username = Excelutils.getCellValues(x1, Sheet, i, 0);
			String password = Excelutils.getCellValues(x1, Sheet, i, 1);
			p1.setValues(username, password);
			p1.loginClick();
			String expectedURL = "https://www.saucedemo.com/inventory.html";
		    String actualURL = driver.getCurrentUrl();
			//Assert.assertEquals(expectedURL, actualURL);
		    
		    if(expectedURL.equalsIgnoreCase(actualURL))
		    {
		    	System.out.println("Login successful");
		    }
		    else
		    {
		    	System.out.println("Login failed");
		    	
		    }
		    
		}
		Cartpage cart = new Cartpage(driver);
		cart.addToCart();
		cart.clickCartButton();
		cart.clickCheckOut();
		CheckOutPage checkout = new CheckOutPage(driver);
		checkout.setCheckoutInfo();
		checkout.clickContinue();
		LogoutPage logout = new LogoutPage(driver);
		logout.clickHamBurgerMenu();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		logout.clickLogout();

	}
		
	}


