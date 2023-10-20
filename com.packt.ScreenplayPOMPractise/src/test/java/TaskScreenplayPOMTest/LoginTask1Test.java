package TaskScreenplayPOMTest;

import org.junit.Test;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class LoginTask1Test implements Task{
	private final String username;
	private final String password;
	
	
	public LoginTask1Test(String username,String password)
	{
		this.username=username;
		this.password=password;
	}

	public static LoginTask1Test withCredentials(String username,String password)
	{
		return Tasks.instrumented(LoginTask1Test.class,username,password);
	}
	
	
	@Override
	public <T extends Actor>void performAs(T actor)
	{
		actor.attemptsTo
		(
				Open.url("https://www.demoblaze.com/"),
				Click.on(LocatorsTest.CLICK_ON_HOMEPAGE_LOGIN_BUTTON),
				Enter.theValue(username).into(LocatorsTest.USER_NAME_INPUT_FIELD),
				Enter.theValue(password).into(LocatorsTest.PASSWORD_INPUT_FIELD),
				Click.on(LocatorsTest.LOGIN_BUTTON_AFTER_ENTERING_CREDENTIALS)
		);
		
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
		
	}
	

}	
