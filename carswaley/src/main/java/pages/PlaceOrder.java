package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.remote.server.handler.RefreshPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Pending;

import static java.time.temporal.ChronoUnit.SECONDS;

import locaters.DemoBlazeLocaters;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PlaceOrder extends PageObject {
	
	DemoBlazeLocaters dblocaters;
	
	public void purchaseOrder() {
		WebElementFacade device =$(dblocaters.mobile);
	    getDriver().navigate().refresh();
	    setImplicitTimeout(30, SECONDS);
		device.waitUntilVisible().click();
		$(dblocaters.btnAddToCart).click();
		WebDriverWait wait = new WebDriverWait(getDriver(), 50); // Adjust the timeout as needed
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = getAlert();
		System.out.println(alert.getText());
		alert.accept();
	//	Serenity.takeScreenshot();
			
	}
	
	public void completeOrder() {
		getDriver().navigate().refresh();
		WebElementFacade cart=$(dblocaters.lninkAddToCart);
		cart.waitUntilClickable().click();
		WebElementFacade price = $(dblocaters.mobileprise);
		WebElementFacade byuyPrice =$(dblocaters.bfrBuyPrice);
		price.equals(byuyPrice);
		WebElementFacade place=$(dblocaters.btnPlaceOrder);
		place.isPresent();
		place.click();
		//Serenity.takeScreenshot();
		
		
	}

}
