package pages;

import org.openqa.selenium.remote.server.handler.SendKeys;

import locaters.DashBoardLocaters;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class LaunchURL extends PageObject {
	
	DashBoardLocaters dash;
	
	public void verifyingTheDashboard() {
		
		WebElementFacade brandlogo=$(dash.logoBrand);
		brandlogo.isDisplayed();
		Serenity.takeScreenshot();
	}
	
	
}
