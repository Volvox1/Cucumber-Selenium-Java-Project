package utils;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.PageObjectManager;




public class TextContextSetup {
	
	
public WebDriver driver;
	public JavascriptExecutor js;
	public WebDriverWait wait;
	public PageObjectManager pageobjectmanager;
	public TestBase testBase;
	public GenericUtils utils;
	
	public TextContextSetup() throws IOException {
		testBase=new TestBase();
		pageobjectmanager=new PageObjectManager(testBase.WebDriverManager());
		utils=new GenericUtils(testBase.WebDriverManager());
	}
	
	
	
	
}
