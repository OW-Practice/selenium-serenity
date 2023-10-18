package screenplaytasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import screenplayactions.LoginaActions;

public class UserLogin implements Task{
	
	private final String username;
	private final String password;
	
	public UserLogin(String username,String password) {
		this.username=username;
		this.password=password;
		
	}

	public static UserLogin log(String username,String password) {
		return new UserLogin(username, password);
		
	}
	LoginaActions action;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				action.patientlog(username, password)
				
				);
		
	}

}
