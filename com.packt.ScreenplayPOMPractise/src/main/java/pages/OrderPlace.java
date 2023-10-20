package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.remote.server.handler.RefreshPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.time.temporal.ChronoUnit.SECONDS;

import locaters.DashBoardLocaters;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class OrderPlace extends PageObject {
	
	DashBoardLocaters dab;
	
	public void purchaseOrder() {
		WebElementFacade device =$(dab.mblName);
	    getDriver().navigate().refresh();
	    setImplicitTimeout(30, SECONDS);
		device.waitUntilVisible().click();
		$(dab.btnAddToCart).click();
		WebDriverWait wait = new WebDriverWait(getDriver(), 50); // Adjust the timeout as needed
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = getAlert();
		System.out.println(alert.getText());
		alert.accept();
		Serenity.takeScreenshot();
			
	}
	public void completeOrder() {
		getDriver().navigate().refresh();
		WebElementFacade cart=$(dab.lninkAddToCart);
		cart.waitUntilClickable().click();
		WebElementFacade price = $(dab.mblpice);
		WebElementFacade byuyPrice =$(dab.bfrBuyPrice);
		price.equals(byuyPrice);
		WebElementFacade place=$(dab.btnPlaceOrder);
		place.isPresent();
		place.click();
		Serenity.takeScreenshot();
		
		
	}

}
