package screenplaypages;

import commonlocaters.CommonLocaters;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class BookAppointment implements Interaction {
	
        private final String comment;
	
	 public BookAppointment(String comment) {
		this.comment=comment;
		 
	}
	 
	 public static Performable book(String comment) {
		return new BookAppointment(comment);
		 
	 }
		
		
	
	CommonLocaters cl;

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				
				Click.on(cl.selectDateField),
				Click.on(cl.pickDate),
				Enter.theValue(comment).into(cl.textComment),
				Click.on(cl.btnBookAppointment)
				
				);
		
	}

}
