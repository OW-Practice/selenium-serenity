package testcases;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.TestData;
import net.thucydides.junit.annotations.UseTestDataFrom;
import steps.CustomerLogin;
import steps.SlotBooking;


@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value="src\\test\\resources\\testdata\\data.csv")
public class BookAppointment extends PageObject{
	
	private String username;
	private String password;
	private String comment;
	private String facilityOption;
	String commentRandom;
	
	@Managed()
	WebDriver driver;
	
	@Steps
	SlotBooking book;
	CustomerLogin log;
	
	@TestData(columnNames ="Username,Password ,FacilityOption,Comment")
	@Qualifier
    public String qualifier() {
		return " - " + " Username = " + username + " and " + " Password = " + password + " FacilityOption = " + facilityOption + " and " + " Comment = " + comment + " should display ";
		
	
	}
	@Before
	@Title("Patient Login into application")
	public void patientLogin() {
		open();
		log.customerNavigation();
		log.verifyLoginScreen();
		log.enterCredentials(username, password);
		log.clickOnLogin();
	}

	@Title("Patient appointment Booking ")
	@Test
	public void patientSlotBooking() {
		Random object = new Random();
		int randomdigit = object.nextInt(1000);
		 commentRandom =comment+randomdigit;
		book.verifyMakeAppointmentScreen();
		book.fillPatientData(commentRandom);
		book.clickOnBook();
	}
	
	@After
	@Title("Patient verifyingt the confirmation screen")
	public void verifyConfirmedSlot() {
		book.verifyConfirmationpage();
	}
	
}
