package tasks;
import locaters.swagLocaters;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;

public class CustomerLogin implements Task {
	
	private final String username;
	private final String password;
	
	public CustomerLogin(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	swagLocaters swagLocators; 

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
			Ensure.that(swagLocaters.swagHeader).isDisplayed(),
			Ensure.that(swagLocaters.userNameField).isDisplayed(),
			Ensure.that(swagLocaters.passwordField).isDisplayed(),
			Enter.theValue(username).into(swagLocaters.userNameField),
			Enter.theValue(password).into(swagLocaters.passwordField),
			Click.on(swagLocaters.buttonLogin)
		);
	}

	public static Performable login(String username, String password) {
		return Instrumented.instanceOf(CustomerLogin.class).withProperties(username, password);
	}
}