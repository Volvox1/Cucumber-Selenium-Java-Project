package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public LandingPage landingPage;
	public CartPage cartPage;
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}

	public LandingPage GetLandingPage() {
		
		landingPage=new LandingPage(driver);
		return landingPage;
	}
	
public CartPage GetCartPage() {
		
		cartPage=new CartPage(driver);
		return cartPage;
	}
	
	
	
}
