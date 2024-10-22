package utils;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericUtils {

	public WebDriver driver;
	public WebDriverWait wait;
	public JavascriptExecutor js;
	public GenericUtils(WebDriver driver) {
		this.driver=driver;
	}
	
	public void GenericWait() {
		
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		js=((JavascriptExecutor)driver);
	}
	
	

}
