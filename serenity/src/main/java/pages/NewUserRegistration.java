package pages;

import org.joda.time.Seconds;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.openhtmltopdf.css.style.Length;

import static java.time.temporal.ChronoUnit.SECONDS;

import java.sql.Driver;
import java.util.Random;

import locaters.DemoBlazeLocaters;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WithLocator;


public class NewUserRegistration extends PageObject {
DemoBlazeLocaters boardloc;
	
	
	public void addNewUser(String Username,String Password) {
		
		
		setImplicitTimeout(10, SECONDS);
		$(boardloc.signupButton).click();
		WebElementFacade registerPopup=$(boardloc.singupPopup);
		registerPopup.isVisible();
		//String alphabet = Random.randomAlphabetic(Length).toLowerCase();
		$(boardloc.fieldUsername).type(Username);
		$(boardloc.fieldPassword).type(Password);
		$(boardloc.buttonSignUp).click();
	    WebDriverWait wait = new WebDriverWait(getDriver(), 50); // Adjust the timeout as needed
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = getAlert();
		System.out.println(alert.getText());
		alert.accept();
		//Serenity.takeScreenshot();
	  
	  }
	 
	/*
	 * public <T extends Actor> Performable[] clickOnSignUpButton() {
	 * Click.on(DemoBlazeLocaters.clickOnSignUp); // return
	 * Enter.theValue(username).into(DemoBlazeLocaters.fieldUsername); return null;
	 * }
	 * 
	 * public <T extends Actor> Performable[] enterUsername(String username) { //
	 * return Click.on(DemoBlazeLocaters.clickOnSignUp);
	 * Enter.theValue(username).into(DemoBlazeLocaters.fieldUsername); return null;
	 * }
	 * 
	 * public <T extends Actor> Performable[] enterPassword(String password) { //
	 * return Click.on(DemoBlazeLocaters.clickOnSignUp);
	 * Enter.theValue(password).into(DemoBlazeLocaters.fieldPassword); return null;
	 * }
	 * 
	 * public <T extends Actor> Performable[] clickOnbuttonSignUp() {
	 * Click.on(DemoBlazeLocaters.buttonSignUp); // return
	 * Enter.theValue(username).into(DemoBlazeLocaters.fieldUsername); return null;
	 * }
	 */
}
