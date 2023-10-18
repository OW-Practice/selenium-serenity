package screenplaypages;

import commonlocaters.CommonLocaters;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class PatientLogin  implements Interaction{
	
	  private final String username;
	  private final String password;

	  public PatientLogin(String username,String password){
		this.username = username;
		this.password = password;
		  
	  }
	  public static Performable login(String username,String password) {
		return new PatientLogin(username, password);
		  
	  }
	@Override
	public <T extends Actor> void performAs(T actor) {
		
	actor.attemptsTo(
			
			Enter.theValue(username).into(CommonLocaters.fldUsername),
			Enter.theValue(password).into(CommonLocaters.fldPassword),
			Click.on(CommonLocaters.btnLogin) 
			
			);
		
	}
	

}
