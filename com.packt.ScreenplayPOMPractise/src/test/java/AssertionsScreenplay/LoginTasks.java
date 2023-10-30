package AssertionsScreenplay;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class LoginTasks {
	
	public static Performable openLoginPage() {
        return Task.where("{0} opens the login page",
            Open.url("https://www.demoblaze.com/")
           
        );
	}
	
	
	 public static Performable loginWithCredentials(String username, String password) {
	        return Task.where("{0} logs in with credentials",
	        	Click.on(LocAssertionsTest.CLICK_ON_HOMEPAGE_LOGIN_BUTTON),	
	            Enter.theValue(username).into(LocAssertionsTest.USER_NAME_INPUT_FIELD),
	            Enter.theValue(password).into(LocAssertionsTest.PASSWORD_INPUT_FIELD),
	            Click.on(LocAssertionsTest.LOGIN_BUTTON_AFTER_ENTERING_CREDENTIALS)
	        );
	    }
	 
	 
	 public static Performable logout() {
	        return Task.where("{0} logs out",
	            Click.on(LocAssertionsTest.CLICK_ON_LOGOUT)
	        );
	    }
}
