package CuraHealthScreenplayProject;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.MoveMouseToWebElement;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

public class LogoutTest implements Task{
	
	public static LogoutTest lgout() {
//		return Tasks.instrumented(CHLogoutTest.class);
	return Instrumented.instanceOf(LogoutTest.class).withProperties();
	}
	
	
	@Step
	public <T extends Actor>void performAs(T curahealth){
		curahealth.attemptsTo(
				WaitUntil.the(LocatorsTest.MENU_BUTTON_ON_LAUNCH_PAGE, WebElementStateMatchers.isVisible()),
				
				//Assertions				
				MoveMouse.to(LocatorsTest.MENU_BUTTON_ON_LAUNCH_PAGE).andThen(actions->actions.click()),
				MoveMouse.to(LocatorsTest.MENU_BUTTON_ON_LOGOUT_LINK).andThen(actions->actions.click())
//				Click.on(LocatorsCHTest.MENU_BUTTON_ON_LOGOUT_LINK)
				);
	}

}
