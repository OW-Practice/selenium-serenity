package CuraHealthScreenplayProject;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Step;

//@RunWith(SerenityRunner.class)
public class CHloginTest implements Task {
	

	
	public static CHloginTest predefinedcredentials() {
		return Tasks.instrumented(CHloginTest.class);
	}
	
	@Step("Cura Health Login")
	public <T extends Actor>void performAs(T curahealth)
	{
//		curahealth.attemptsTo(
//				Open.url("https://katalon-demo-cura.herokuapp.com/"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		curahealth.attemptsTo(
				Ensure.that(LocatorsCHTest.MAKE_APPOINTMENT_ON_LAUNCH_PAGE).isDisplayed());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		curahealth.attemptsTo(
				
				Click.on(LocatorsCHTest.MAKE_APPOINTMENT_ON_LAUNCH_PAGE),
				Clear.field(LocatorsCHTest.USER_NAME_FIELD),
				Enter.theValue("John Doe").into(LocatorsCHTest.USER_NAME_FIELD),
				Clear.field(LocatorsCHTest.PASSWORD_FIELD),
				Enter.theValue("ThisIsNotAPassword").into(LocatorsCHTest.PASSWORD_FIELD),
				Click.on(LocatorsCHTest.LOGIN_BUTTON));
		
	}

}
