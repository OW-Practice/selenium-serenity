package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import targetlocators.SeleniumEasyPageLocators;

public class CalculateTwoInts implements Task {
	private final String number1, number2;
	SeleniumEasyPageLocators sp = new SeleniumEasyPageLocators();

	public CalculateTwoInts(String number1, String number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				WaitUntil.the(sp.INPUT_FORMS_LINK, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),Click.on(sp.INPUT_FORMS_LINK), Click.on(sp.SIMPLE_FORM_DEMO_LINK),
				Enter.theValue(number1).into(sp.EnterValueA), Enter.theValue(number2).into(sp.EnterValueB),
				Click.on(sp.GetTotalButton));
	}

	public static Performable inputValues(String number1, String number2) {
		return Instrumented.instanceOf(CalculateTwoInts.class).withProperties(number1, number2);
	}
}
