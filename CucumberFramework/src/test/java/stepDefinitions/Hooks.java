package stepDefinitions;

import io.cucumber.java.After;
import utils.TextContextSetup;

public class Hooks {
	TextContextSetup textContextSetup;
	
	public Hooks(TextContextSetup textContextSetup) {
		this.textContextSetup=textContextSetup;
	}

	@After
	public void AfterScenario() {
		textContextSetup.testBase.driver.quit();

	}
}
