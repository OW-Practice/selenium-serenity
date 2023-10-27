package CuraHealthScreenplayProject;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

public class CHLogoutTest implements Task{
	
	public static CHLogoutTest lgout() {
		return Tasks.instrumented(CHLogoutTest.class);
	}
	
	
	@Step
	public <T extends Actor>void performAs(T curahealth){
		curahealth.attemptsTo(
				WaitUntil.the(LocatorsCHTest.MENU_BUTTON_ON_LAUNCH_PAGE, WebElementStateMatchers.isVisible()),
				Click.on(LocatorsCHTest.MENU_BUTTON_ON_LAUNCH_PAGE),
				Click.on(LocatorsCHTest.MENU_BUTTON_ON_LOGOUT_LINK)
				);
	}

}
