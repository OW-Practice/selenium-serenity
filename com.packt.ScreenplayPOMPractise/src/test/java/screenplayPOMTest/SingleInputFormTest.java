package screenplayPOMTest;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class SingleInputFormTest implements Task{

	private static final Target INPUT_FORMS_LINK = Target.the("Input forms link")
            .locatedBy("//*[text()='Input Forms']");
    private static final Target SIMPLE_FORM_DEMO_LINK = Target.the("Single form demo link")
            .locatedBy("//ul[not(@class)]//li//a[contains(@href, 'basic-first-form')]");
    private static final Target ENTER_MESSAGE = Target.the("Enter message field").locatedBy("[aria-label='message']");
    private static final Target SHOW_MESSAGE = Target.the("Show message button")
            .locatedBy("//button[@onclick='showInput();']");
    private static final Target MESSAGE = Target.the("Show message button").locatedBy("[title='text message']");
    
    private final String message;

    public SingleInputFormTest(String message) {
        this.message = message;
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(INPUT_FORMS_LINK), Click.on(SIMPLE_FORM_DEMO_LINK),
                Enter.theValue(message).into(ENTER_MESSAGE), Click.on(SHOW_MESSAGE));
    }

    public static Performable inputMessage(String message) {
        return Instrumented.instanceOf(SingleInputFormTest.class).withProperties(message);
    }
}

