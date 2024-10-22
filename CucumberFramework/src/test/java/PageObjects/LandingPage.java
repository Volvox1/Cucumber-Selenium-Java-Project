package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LandingPage {
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By SearchData=By.id("searchData");
	By GetShadowElement=By.tagName("efilli-layout-dynamic");
	By GetRootOfShadowElement=By.cssSelector("div[data-id=\"44c51ce2-0419-4c11-b136-eef0e33e8d40\"][data-name=\"Root\"]");
	By GetBannerOfShadowElement=By.cssSelector("div[data-id=\"4eba3a1a-2804-4d0b-bcb0-1d7b38f7b8c9\"][data-name=\"Banner\"]");
	By DeclineButton=By.cssSelector("div[data-id=\"2a7d83f8-effc-496f-ab9f-ed6840f0a847\"][data-name=\"Reject Button\"]");
	By SortButton=By.xpath("//div[@class='selected-item']");
	By SortByReviewButton=By.xpath("//div[@class='item i4' and @data-value='REVIEWS']");
	By FilteredArea=By.xpath("//div[@class='filterArea']");
	By CargoOptions=By.xpath("//h2[normalize-space()='Kargo Seçenekleri']");
	By FreeCargoOption=By.xpath("//span[normalize-space()='Ücretsiz Kargo']");
	By AddingFirstProduct=By.xpath("(//span[@class='btnBasket'][normalize-space()='+'])[1]");
	By AddingSecondProduct=By.xpath("(//span[@class='btnBasket'][normalize-space()='+'])[24]");
	By GetTextForComparison=By.xpath("//h2[normalize-space()='Ürün Özelliklerini Seç']");
	String Text="Ürün Özelliklerini Seç";
	By RandomFeature=By.cssSelector("div[class='lightBox baseLightBox skuSelectionLightBox'] label:nth-child(1)");
	By Adding=By.xpath("//span[@id='js-addBasketSku']");
	

public void MaximizePage() {
	driver.manage().window().maximize();
	
	
}
public void ClickForSearhData() {
	
	driver.findElement(SearchData).click();
	
	
	
}
public void SendData(String productName) {
	
	
	driver.findElement(SearchData).sendKeys(productName);
	
	
}
public void SearhData()  {
	
	WebElement inputField = driver.findElement(SearchData);
	inputField.sendKeys(Keys.ENTER);
	
	
	
}
public void DeclineTheCookies() {
	
	SearchContext shadowElement = driver.findElement(GetShadowElement).getShadowRoot();
	shadowElement.findElement(GetRootOfShadowElement).findElement(GetBannerOfShadowElement).findElement(DeclineButton).click();
}
public void SortByReviews() {
	driver.findElement(SortButton).click();
	driver.findElement(SortByReviewButton).click();
}
public WebElement SelectTheFilteredArea() {
	WebElement selectedElement =driver.findElement(FilteredArea);
	return selectedElement;
}

public void ScrollDown() {
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop += 1800;", SelectTheFilteredArea());
	
}
public void SortByFreeShipping() {
	
	driver.findElement(CargoOptions).click();
	driver.findElement(FreeCargoOption).click();
}
public void ClickingAddToCartButtonForFirstProduct() {
	driver.findElement(AddingFirstProduct).click();
}
public void ChooseTheProductFeaturesifExists() throws InterruptedException{
	
	String productText =driver.findElement(GetTextForComparison).getText();
	if (productText.equals(Text)) {
		driver.findElement(RandomFeature).click();
		Thread.sleep(500);
		driver.findElement(Adding).click();
		
	}
	
	
	
}
public void ClickingAddToCartButtonForSecondProduct() {
	driver.findElement(AddingSecondProduct).click();
}
public void ChooseTheProductFeaturesifExists2() throws InterruptedException{
	String productText =driver.findElement(GetTextForComparison).getText();
	if (productText.equals(Text)) {
		driver.findElement(RandomFeature).click();
		Thread.sleep(500);
		driver.findElement(Adding).click();
		

	}
	
	
}
}
