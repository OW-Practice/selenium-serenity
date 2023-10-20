package screenplaypages;

import commonlocaters.CommonLocaters;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

public class VerifyHistoryPage implements Interaction{
	
	public static Performable  history() {
		return new VerifyHistoryPage();
		
		
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(CommonLocaters.lftHamberg),
				Click.on(CommonLocaters.tabHistory),
				Ensure.that(CommonLocaters.headerHistory).isDisplayed()
				
				
				);
		
	}

}
