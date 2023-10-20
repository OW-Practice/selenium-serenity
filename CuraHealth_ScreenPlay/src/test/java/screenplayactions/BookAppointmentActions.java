package screenplayactions;

import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import screenplaypages.BookAppointment;

public class BookAppointmentActions {
	
	public static Interaction appointment(String comment) {
		return Tasks.instrumented(BookAppointment.class, comment);
		
	}

}
