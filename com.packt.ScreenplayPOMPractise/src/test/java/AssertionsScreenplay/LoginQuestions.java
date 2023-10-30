package AssertionsScreenplay;

import net.serenitybdd.screenplay.Question;

public class LoginQuestions 
{
	public static Question<Boolean> loginSuccessful() 
	{
        return actor -> LocAssertionsTest.CLICK_ON_HOMEPAGE_LOGIN_BUTTON.resolveFor(actor).isVisible();
	}
	
	 public static Question<Boolean> logoutButtonPresent() 
	 {
	        return actor -> LocAssertionsTest.CLICK_ON_LOGOUT.resolveFor(actor).isVisible();
	 }
}