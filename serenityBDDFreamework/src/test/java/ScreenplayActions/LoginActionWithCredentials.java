package ScreenplayActions;

import Locators.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
//import pages.LoginPage;

/*public class LoginActionWithCredentials implements Interaction {
    private final String username;
    private final String password;

    public LoginActionWithCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Performable withCredentials(String username, String password) {
        return new LoginActionWithCredentials(username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Enter.theValue(username).into(LoginPage.finlinkUsername),
            Enter.theValue(password).into(LoginPage.finlinkPassword),
            Click.on(LoginPage.loginButton)
        );
    }
} */
