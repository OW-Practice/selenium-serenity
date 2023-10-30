package CuraHealthScreenplayProject;

import org.mockito.stubbing.Answer;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
public class HistoryTest implements Task{
	
	public static HistoryTest History() {
		return Instrumented.instanceOf(HistoryTest.class).withProperties();
	}
	
	@Step
	public <T extends Actor>void performAs(T curahealth){
		curahealth.attemptsTo(
				WaitUntil.the(LocatorsTest.MENU_BUTTON_ON_LAUNCH_PAGE, WebElementStateMatchers.isVisible()),
				Click.on(LocatorsTest.GO_TO_HOMEPAGE_BUTTON),
				Ensure.that(LocatorsTest.MENU_BUTTON_ON_LAUNCH_PAGE).isDisplayed(),
				Click.on(LocatorsTest.MENU_BUTTON_ON_LAUNCH_PAGE),
				Ensure.that(LocatorsTest.HISTORY_IN_MENU_SECTION).isDisplayed(),
				Click.on(LocatorsTest.HISTORY_IN_MENU_SECTION),
				Ensure.that(LocatorsTest.SELECTED_FACILITY_DROPDOWNVALUE_DISPLAYED_IN_HISTORY).text().contains("Seoul CURA Healthcare Center"),
				Ensure.that(LocatorsTest.SELECTED_APPLYFORHOSPITALADMISSION_DISPLAYED_IN_HISTORY).text().contains("Yes"),
				Ensure.that(LocatorsTest.HEALTHCARE_PROGRAM_RADIO_BUTTON_IN_MAKE_APPOINTMENT).text().contains("Medicare"),
				Ensure.that(LocatorsTest.COMMENTS_DISPLAYED_IN_HISTORY).text().contains("Booking appointment for doctor consultation"));
				
		System.out.println("History page asertions passed");		
				
				
		
		
//		Answer<String> q=curahealth.asksFor((Question<Answer>) Text.of(LocatorsTest.SELECTED_FACILITY_DROPDOWNVALUE_DISPLAYED_IN_HISTORY));
//		System.out.println(q);
		
		
		
		
	}

}
