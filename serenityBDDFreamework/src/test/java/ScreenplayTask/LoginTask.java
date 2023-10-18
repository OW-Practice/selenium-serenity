package ScreenplayTask;


import ScreenplayActions.LoginAction;
//import ScreenplayAction.LoginAction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

/*public class LoginTask implements Task {
    private final String username;
    private final String password;

    public LoginTask(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static LoginTask withCredentials(String username, String password) {
        return new LoginTask(username, password);
    }
 LoginAction logaction;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            //Open.browserOn().the(LoginPage.class),
            logaction.withCredentials(username, password)
        );
    }
}*/
