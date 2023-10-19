package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import targetlocators.SeleniumEasyPageLocators;

public class ClickOnSingleInputForm implements Task {

	private final String message;
	SeleniumEasyPageLocators sp = new SeleniumEasyPageLocators();

	public ClickOnSingleInputForm(String message) {
		this.message = message;
	}

	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(sp.INPUT_FORMS_LINK), Click.on(sp.SIMPLE_FORM_DEMO_LINK),
				Enter.theValue(message).into(sp.ENTER_MESSAGE), Click.on(sp.SHOW_MESSAGE));
	}

	public static Performable inputMessage(String message) {
		return Instrumented.instanceOf(ClickOnSingleInputForm.class).withProperties(message);
	}
}
