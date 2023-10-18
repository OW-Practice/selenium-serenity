package ScreenplayActions;

import ScreenplayPages.LoginWithCredentials;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
//import pages.LoginPage;

public class LoginAction {
    public static Interaction withCredentials(String username, String password) {
       // return Tasks.instrumented(LoginActionWithCredentials.class, username, password);
    	return Tasks.instrumented(LoginWithCredentials.class, username, password);
    }
}
