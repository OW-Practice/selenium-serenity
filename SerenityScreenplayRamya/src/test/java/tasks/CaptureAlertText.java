package tasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import targetlocators.SeleniumEasyPageLocators;

public class CaptureAlertText implements Task {

	private String alertText;
	SeleniumEasyPageLocators sp;

	@Override
	public <T extends Actor> void performAs(T actor) {
		WebDriver driver = BrowseTheWeb.as(actor).getDriver();

		// Click on elements to trigger the alert
		actor.attemptsTo(Click.on(sp.ALERTS_AND_MODALS_LINK), Click.on(sp.JAVASCRIPT_ALERT_LINK),
				Click.on(sp.ClickMe_Button));

		WebDriverWait wait = new WebDriverWait(driver, 2); // Shorter initial wait time

		wait.until(ExpectedConditions.alertIsPresent());

		Alert alert = driver.switchTo().alert();

		// Capture the alert text
		alertText = alert.getText();

		// Accept (dismiss) the alert
		try {
			Thread.sleep(10000);
			//alert.accept();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static CaptureAlertText capture() {
		return new CaptureAlertText();
	}
}
