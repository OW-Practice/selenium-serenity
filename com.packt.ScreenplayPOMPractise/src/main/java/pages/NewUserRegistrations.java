package pages;

import org.joda.time.Seconds;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.openhtmltopdf.css.style.Length;

import static java.time.temporal.ChronoUnit.SECONDS;

import java.sql.Driver;
import java.util.Random;

import locaters.DashBoardLocaters;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class NewUserRegistrations extends PageObject{
	
	DashBoardLocaters boardloc;
	
	
	public void addNewUser(String username ,String password) {
		
		setImplicitTimeout(10, SECONDS);
		$(boardloc.txtSignup).click();
		WebElementFacade registerPopup=$(boardloc.singUpPopup);
		registerPopup.isVisible();
		//String alphabet = Random.randomAlphabetic(Length).toLowerCase();
		$(boardloc.fieldUsername).type(username);
		$(boardloc.fieldPassword).type(password);
		$(boardloc.btnSignUp).click();
	    WebDriverWait wait = new WebDriverWait(getDriver(), 50); // Adjust the timeout as needed
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = getAlert();
		System.out.println(alert.getText());
		alert.accept();
		Serenity.takeScreenshot();
			
	}
	

}
