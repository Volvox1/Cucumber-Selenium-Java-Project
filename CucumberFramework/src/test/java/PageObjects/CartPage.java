package PageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	
	WebDriver driver;
	
public CartPage(WebDriver driver) {
	this.driver=driver;
	}




By cartIcon=By.xpath("//i[@class='iconsBasketWhite']");
By acceptGuestCustomer=By.xpath("//span[@class='btn btnBlack']");
By firstProductPrice=By.cssSelector(
		"body > div:nth-child(4) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > section:nth-child(3) > table:nth-child(6) > tbody:nth-child(4) > tr:nth-child(1) > td:nth-child(3) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1)");
By secondProductPrice=By.cssSelector(
		"body > div:nth-child(4) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > section:nth-child(3) > table:nth-child(7) > tbody:nth-child(4) > tr:nth-child(1) > td:nth-child(3) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1)");
String firstProductAmountIncrease="//body[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/section[1]/table[3]/tbody[1]/tr[1]/td[1]/div[3]/div[2]/div[1]/span[1]";
String secondProductAmountIncrease="//body[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/section[1]/table[2]/tbody[1]/tr[1]/td[1]/div[3]/div[2]/div[1]/span[1]";
By buyButton=By.id("js-buyBtn");



public void GoingToCartandAcceptGuest() {
	
	driver.findElement(cartIcon).click();
	driver.findElement(acceptGuestCustomer).click();
}

public List<String> FindThePricesOftheProducts() {
	WebElement productOne =driver.findElement(firstProductPrice);
	WebElement productTwo =driver.findElement(secondProductPrice);
	List<String> productPrices = new ArrayList<>();
	productPrices.add(productOne.getText());
	productPrices.add(productTwo.getText());
	return productPrices;
}


public int[] SplitandDealingWithCommasandPeriods() {
	List<String> productPrices = new ArrayList<>();
	productPrices=FindThePricesOftheProducts();
	String[] parts = productPrices.get(0).split(" ");
	String[] parts2 = productPrices.get(1).split(" ");
	String[] parts3= {parts[0],parts2[0]};
	
	String amountString = parts3[0].contains(",") 
		    ? parts3[0].replace(",", ".") 
		    : parts3[0].replace(".", "");
		double sayiDouble = Double.parseDouble(amountString);

		String amountString2 = parts3[1].contains(",") 
		    ? parts3[1].replace(",", ".") 
		    : parts3[1].replace(".", "");
		double sayiDouble2 = Double.parseDouble(amountString2);
		int amount = (int) sayiDouble;
		int amount2 = (int) sayiDouble2;
		int[] intArray= {amount,amount2};
		return intArray;
}

public void IncreaseTheCheapOne(int[] intArray) {
	String xpath = (intArray[0] >= intArray[1]) 
		    ? firstProductAmountIncrease 
		    : secondProductAmountIncrease;

	driver.findElement(By.xpath(xpath)).click();
	
}
	public void ClickToBuyButton(){
		
		driver.findElement(buyButton).click();
		
	}
	
	


}
