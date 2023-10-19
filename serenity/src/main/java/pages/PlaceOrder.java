
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

	DemoBlazeLocaters locaters;

	public void purchaseOrder() { WebElementFacade device =$(locaters.mobile);
  getDriver().navigate().refresh(); setImplicitTimeout(30, SECONDS);
  device.waitUntilVisible().click(); $(locaters.btnAddToCart).click();
  WebDriverWait wait = new WebDriverWait(getDriver(), 50); // Adjust the
  //timeout as needed wait.until(ExpectedConditions.alertIsPresent());
  Alert alert = getAlert(); System.out.println(alert.getText()); alert.accept(); 
  //Serenity.takeScreenshot();
  
  }

	public void completeOrder() {
		getDriver().navigate().refresh();
		WebElementFacade cart = $(locaters.lninkAddToCart);
		cart.waitUntilClickable().click();
		WebElementFacade price = $(locaters.mobileprise);
		WebElementFacade buyPrice = $(locaters.bfrBuyPrice);
		price.equals(buyPrice);
		WebElementFacade place = $(locaters.btnPlaceOrder);
		place.isPresent();
		place.click();
		// Serenity.takeScreenshot();

	}

}
