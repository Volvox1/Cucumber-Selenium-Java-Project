package stepDefinitions;



import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import PageObjects.CartPage;
import io.cucumber.java.en.Then;
import utils.TextContextSetup;




public class N11cartPage {
	 TextContextSetup textContextSetup;
	 
	
	public N11cartPage(TextContextSetup textContextSetup){
		
		this.textContextSetup = textContextSetup;
		
	}
	
	
	
	

	@Then("User goes to cart")
	public void user_goes_to_cart(){
		
		CartPage cartpage=textContextSetup.pageobjectmanager.GetCartPage();
		textContextSetup.utils.GenericWait();
		cartpage.GoingToCartandAcceptGuest();

		textContextSetup.utils.js.executeScript("window.scrollBy(0, 400);");

		textContextSetup.utils.wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
				"body > div:nth-child(4) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > section:nth-child(3) > table:nth-child(6) > tbody:nth-child(4) > tr:nth-child(1) > td:nth-child(3) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1)")));

		
        cartpage.IncreaseTheCheapOne(cartpage.SplitandDealingWithCommasandPeriods());
		
	
			
	}
	@Then("User goes to payment step")
	public void user_goes_to_payment_step() {
		
		CartPage cartpage=textContextSetup.pageobjectmanager.GetCartPage();
		textContextSetup.utils.js.executeScript("window.scrollBy(0, -400);");
		textContextSetup.utils.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js-buyBtn")));
		textContextSetup.utils.wait.until(ExpectedConditions.elementToBeClickable(By.id("js-buyBtn")));
	
		cartpage.ClickToBuyButton();
		
		

	}
}
