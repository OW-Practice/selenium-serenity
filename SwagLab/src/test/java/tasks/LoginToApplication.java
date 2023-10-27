package tasks;

import locaters.swagLocaters;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;

public class LoginToApplication implements Task{
	
	private final String username;
	private final String password;
	
	public LoginToApplication(String username,String password) {
		this.username = username;
		this.password = password;
		
	}
	
	swagLocaters sw;
	

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Ensure.that(sw.swagHeader).isDisplayed(),
				Enter.theValue(username).into(sw.userNameField),
				Enter.theValue(password).into(sw.passwordField),
				Click.on(sw.buttonLogin));
		
	}
	public static Performable login(String username,String password) {
		return Instrumented.instanceOf(LoginToApplication.class).withProperties(username,password);
		
	}

	
}
