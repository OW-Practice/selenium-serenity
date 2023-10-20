package screenplayactions;

import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import screenplaypages.VerifyHistoryPage;

public class VerifyHistoryPageActions {
	
	public static Interaction historypage () {
		return Tasks.instrumented(VerifyHistoryPage.class);
		
	}

}
