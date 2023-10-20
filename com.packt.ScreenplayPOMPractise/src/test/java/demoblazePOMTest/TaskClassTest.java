package demoblazePOMTest;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class TaskClassTest implements Task {
	private static Target CLICK_ON_HOMEPAGE_LOGIN_BUTTON 				=	Target.the("homepageLoginButton").locatedBy("//a[@id='login2']");
	private static Target serviceLink									=	Target.the("service link").locatedBy("//*[text()='Services']");
	private static Target USER_NAME_INPUT_FIELD 						=	Target.the("userNameInputField").locatedBy("//input[@id='loginusername']");
	private static Target PASSWORD_INPUT_FIELD  						=	Target.the("passwordInputField").locatedBy("//input[@id='loginpassword']");
	private static Target LOGIN_BUTTON_AFTER_ENTERING_CREDENTIALS 		=	Target.the("loginButtonAfterEnteringCredentials").locatedBy("#logInModal button.btn-primary");
	
    
    
	private final String Message;

    public TaskClassTest(String Message) {
        this.Message = Message;
    }

    public <T extends Actor> void performAs(T actor) {
    	actor.attemptsTo(Click.on(CLICK_ON_HOMEPAGE_LOGIN_BUTTON));

		actor.wasAbleTo(Enter.theValue("harika3090@gmail.com").into(USER_NAME_INPUT_FIELD));
		actor.wasAbleTo(Enter.theValue("harika3010").into(PASSWORD_INPUT_FIELD));
		actor.attemptsTo(Click.on(LOGIN_BUTTON_AFTER_ENTERING_CREDENTIALS));
    }

    public static Performable printingmessage(String message) {
        return Instrumented.instanceOf(TaskClassTest.class).withProperties(message);
    }
}
