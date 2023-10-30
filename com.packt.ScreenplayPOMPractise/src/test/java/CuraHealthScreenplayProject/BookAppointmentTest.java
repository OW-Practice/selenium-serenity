package CuraHealthScreenplayProject;

import org.junit.runner.RunWith;
import static java.time.temporal.ChronoUnit.SECONDS;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.PerformOn;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.events.ActorAsksQuestion;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.SelectedStatus;
import net.serenitybdd.screenplay.questions.SelectedVisibleTextValue;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.webelements.Checkbox;

@RunWith(SerenityRunner.class)
public class BookAppointmentTest implements Task {
	LocalDate currentDate = LocalDate.now();

	public static BookAppointmentTest patientBook() {
//		return Tasks.instrumented(BookAppCHTest.class);
		return Instrumented.instanceOf(BookAppointmentTest.class).withProperties();
	}

	@Step("Patient appointment booking")
	public <T extends Actor> void performAs(T curahealth) {
		boolean checkboxstatus;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd");
		String formattedDate = currentDate.format(formatter);

		System.out.println("Current Date: " + formattedDate);

		WaitUntil.the(LocatorsTest.FACILITY_DROPDOWN_FIELD_IN_MAKE_APPOINTMENT, WebElementStateMatchers.isVisible());
		curahealth.attemptsTo(
				SelectFromOptions.byVisibleText("Seoul CURA Healthcare Center").from(LocatorsTest.FACILITY_DROPDOWN_FIELD_IN_MAKE_APPOINTMENT),
//				Ensure.that(LocatorsCHTest.FACILITY_DROPDOWN_FIELD_IN_MAKE_APPOINTMENT).selectedVisibleText().isEqualTo("Seoul CURA Healthcare Center"),
				WaitUntil.the(LocatorsTest.CHECKBOX_IN_MAKE_APPOINTMENT, WebElementStateMatchers.isVisible()),
				
//				SetCheckbox.of(LocatorsCHTest.CHECKBOX_IN_MAKE_APPOINTMENT).toTrue(), - Not working
//				Click.on(LocatorsCHTest.CHECKBOX_IN_MAKE_APPOINTMENT).afterWaitingUntilPresent(),
				
//				PerformOn.eachMatching(LocatorsCHTest.CHECKBOX_IN_MAKE_APPOINTMENT, Checkbox-> curahealth.attemptsTo(SetCheckbox.of(checkbox).toTrue())),
//				asksFor(SelectedStatus.of(LocatorsCHTest.CHECKBOX_IN_MAKE_APPOINTMENT)),
				
				Click.on(LocatorsTest.CHECKBOX_IN_MAKE_APPOINTMENT),
				Click.on(LocatorsTest.HEALTHCARE_PROGRAM_RADIO_BUTTON_IN_MAKE_APPOINTMENT),
				Click.on(LocatorsTest.VISIT_DATE_FIELD_IN_MAKE_APPOINTMENT),
				Click.on("//*[@class='datepicker-days']//td[text()='" + formattedDate + "']"),
				Enter.theValue("Booking appointment for doctor consultation").into(LocatorsTest.COMMENTS_FIELD_IN_MAKE_APPOINTMENT),
				
				//Assertion-Ensure
//				Ensure.that(LocatorsCHTest.COMMENTS_FIELD_IN_MAKE_APPOINTMENT).text().isEqualToIgnoringCase("Booking appointment for doctor consultation"),
				Ensure.that("Booking appointment for doctor consultation").contains("consultation"),
				Click.on(LocatorsTest.SUBMIT_BOOKAPPOINTMENT_IN_MAKE_APPOINTMENT)


		);

	}

}


//WebElementFacade selectCurrentDate = $("//*[@class='datepicker-days']//td[text()='" + formattedDate + "']");
//selectCurrentDate.waitUntilClickable().click();
		
