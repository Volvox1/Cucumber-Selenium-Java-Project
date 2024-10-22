package stepDefinitions;



import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import PageObjects.LandingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utils.TextContextSetup;




public class N11landingPage {
	
	
TextContextSetup textContextSetup;
	
	public N11landingPage(TextContextSetup textContextSetup){
		
		this.textContextSetup = textContextSetup;
		
	}
	
	
	
	@Given("User is on n11 landing page")
	public void user_is_on_n11_landing_page() {
		
		
		LandingPage landingpage=textContextSetup.pageobjectmanager.GetLandingPage();
		landingpage.MaximizePage();
		textContextSetup.utils.GenericWait();
		
		
		
		
	}

	@When("{string} word is searhed")
	public void word_is_searhed(String productName) {
		LandingPage landingpage=textContextSetup.pageobjectmanager.GetLandingPage();
		landingpage.ClickForSearhData();
		landingpage.SendData(productName);
		landingpage.SearhData();
		
		
		

	}

	@When("Results are sorted by the number of comments")
	public void results_are_sorted_by_the_number_of_comments() {
		LandingPage landingpage=textContextSetup.pageobjectmanager.GetLandingPage();
		landingpage.DeclineTheCookies();
        landingpage.SortByReviews();
		
	}

	@When("Free shipping option is applied.")
	public void free_shipping_option_is_applied(){
		LandingPage landingpage=textContextSetup.pageobjectmanager.GetLandingPage();
		landingpage.SelectTheFilteredArea();
		landingpage.ScrollDown();
		landingpage.SortByFreeShipping();

	}

	@When("Products are added to the cart")
	public void products_are_added_to_the_cart() throws InterruptedException {
		LandingPage landingpage=textContextSetup.pageobjectmanager.GetLandingPage();
		
		landingpage.ClickingAddToCartButtonForFirstProduct();
	  
		textContextSetup.utils.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[normalize-space()='Ürün Özelliklerini Seç']")));
		landingpage.ChooseTheProductFeaturesifExists();
		Thread.sleep(500);
		landingpage.ClickingAddToCartButtonForSecondProduct();
		textContextSetup.utils.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[normalize-space()='Ürün Özelliklerini Seç']")));
		landingpage.ChooseTheProductFeaturesifExists2();

	}

	
}
