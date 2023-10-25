package CuraHealthSerenity;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;



public class StepCHTest extends PageObject {

	@Managed
	WebDriver driver;
	LocCHTest locatorsCuraHealth;
	UtilitiesTest utilitiesClass;
	Login1Test PatientLogin;
	BookAppointment2Test PatientTreatmentBook;
	Logout3Test PatientStepoutfromCH;
	
	
	@Step
	public void CuraHealthCareLoginOperation()
	{
		PatientLogin.CHPatientLogin();
	}
	
	
	@Step
	public void CuraHealthCareBookApptOperations()
	{
		PatientTreatmentBook.PatientAppointmentBook();
	}
	
	
	@Step
	public void CuraHealthCareLogoutOperation()
	{
		PatientStepoutfromCH.PatientLogout();
	}
	
	
}
