package screenplayactions;

import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import screenplaypages.PatientLogin;

public class LoginaActions {
	
	public static Interaction patientlog(String username,String password) {
		return Tasks.instrumented(PatientLogin.class, username,password);
		
	}

}
