package pages;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

	public class ScreenLoc {
	    /*public static final Target USERNAME_INPUT = Target.the("Username input").locatedBy("#username");
	    public static final Target PASSWORD_INPUT = Target.the("Password input").locatedBy("#password");
	    public static final Target LOGIN_BUTTON = Target.the("Login button").locatedBy("#login-button");
	    public static final Target DASHBOARD = Target.the("Dashboard").locatedBy(".dashboard"); */
	    
	    private static Target usernameField=Target.the("usernameField").located(By.cssSelector("[id='email']"));
	    private static Target proceedButton=Target.the("proceedButton").located(By.cssSelector("[type='button']"));
	    private static Target passwordField=Target.the("passwordField").located(By.cssSelector("[id='password']"));
	    private static Target submitButton=Target.the("sub,itButton").located(By.cssSelector("[type='button']"));
	}

