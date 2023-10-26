package CuraHealthScreenplayProject;

import org.junit.runner.RunWith;
import static java.time.temporal.ChronoUnit.SECONDS;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.SelectedVisibleTextValue;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

@RunWith(SerenityRunner.class)
public class BookAppCHTest implements Task {
	LocalDate currentDate = LocalDate.now();

	public static BookAppCHTest patientBook() {
		return Tasks.instrumented(BookAppCHTest.class);
	}

	@Step("Patient appointment booking")
	public <T extends Actor> void performAs(T curahealth) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd");
		String formattedDate = currentDate.format(formatter);

		System.out.println("Current Date: " + formattedDate);

		WaitUntil.the(LocatorsCHTest.FACILITY_DROPDOWN_FIELD_IN_MAKE_APPOINTMENT, WebElementStateMatchers.isVisible());
		curahealth.attemptsTo(
				SelectFromOptions.byVisibleText("Seoul CURA Healthcare Center").from(LocatorsCHTest.FACILITY_DROPDOWN_FIELD_IN_MAKE_APPOINTMENT),
				WaitUntil.the(LocatorsCHTest.CHECKBOX_IN_MAKE_APPOINTMENT, WebElementStateMatchers.isVisible()),
//				SetCheckbox.of(LocatorsCHTest.CHECKBOX_IN_MAKE_APPOINTMENT).toTrue(),
//				Click.on(LocatorsCHTest.CHECKBOX_IN_MAKE_APPOINTMENT).afterWaitingUntilPresent(),
				Click.on(LocatorsCHTest.CHECKBOX_IN_MAKE_APPOINTMENT),
				Click.on(LocatorsCHTest.HEALTHCARE_PROGRAM_RADIO_BUTTON_IN_MAKE_APPOINTMENT),
				Click.on(LocatorsCHTest.VISIT_DATE_FIELD_IN_MAKE_APPOINTMENT),
				Click.on("//*[@class='datepicker-days']//td[text()='" + formattedDate + "']"),
				Enter.theValue("Booking appointment for doctor consultation").into(LocatorsCHTest.COMMENTS_FIELD_IN_MAKE_APPOINTMENT),
				Click.on(LocatorsCHTest.SUBMIT_BOOKAPPOINTMENT_IN_MAKE_APPOINTMENT)


		);

	}

}


//WebElementFacade selectCurrentDate = $("//*[@class='datepicker-days']//td[text()='" + formattedDate + "']");
//selectCurrentDate.waitUntilClickable().click();
		
