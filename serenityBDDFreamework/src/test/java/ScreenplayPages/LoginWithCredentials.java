package ScreenplayPages;



import net.serenitybdd.core.annotations.findby.FindBy;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import Locators.LoginPage;
//6import ScreenplayActions.LoginActionWithCredentials;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;

public class LoginWithCredentials implements Interaction {
	
    private final String username;
    private final String password;

    public LoginWithCredentials(String username, String password) {
        this.username = username;
        this.password = password;
        
    }
        public static Performable Page1(String username, String password) {
            return new LoginWithCredentials(username, password);
        }
    
    
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Enter.theValue(username).into(LoginPage.finlinkUsername),
            Enter.theValue(password).into(LoginPage.finlinkPassword),
            Click.on(LoginPage.loginButton)
        );
        
        
   /* @FindBy(id = "username")
    public static Target USERNAME_FIELD;

    @FindBy(id = "password")
    public static Target PASSWORD_FIELD;

    @FindBy(id = "login-button")
    public static Target LOGIN_BUTTON; */
	// private static Target usernameField=Target.the("usernameField").located(By.cssSelector("[tabindex='1']"));
	 //private static Target passwordField=Target.the("passwordField").located(By.cssSelector("[type='password']"));
	 //private static Target loginButton=Target.the("submitButton").located(By.cssSelector("[class*='btn-lg btn']"));
}
    
    public <T extends Actor> void verifyHomePage(T actor) {
    	actor.attemptsTo(
    			
    			
    			
    			  //  Ensure.that(name).isEqualToIgnoringCase("BILL").into()
    			
    			);
    }
    }
