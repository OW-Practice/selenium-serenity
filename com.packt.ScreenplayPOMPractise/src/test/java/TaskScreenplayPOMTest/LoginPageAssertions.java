//package TaskScreenplayPOMTest;
//
//import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Question;
//import net.serenitybdd.screenplay.targets.Target;
//import net.serenitybdd.screenplay.waits.WaitUntil;
//
//public class LoginPageAssertions {
//	public static final String SUCCESS_MESSAGE = "Login is success";
//	public static final String ERROR_MESSAGE = "Login is UNsuccess";
//	private final String username;
//	private final String password;
//	  public static Question<Boolean> errorMessageIsDisplayed() {
//	        return actor -> {
//	        	Target errorMessage = LoginTask1Test.ERROR_MESSAGE ; // Replace with the actual target for the error message
//	            Actor webActor = (Actor) actor;
//	            webActor.attemptsTo(WaitUntil.the(errorMessage, isVisible()));
//	            return errorMessage.resolveFor(webActor).isVisible();
//	        };
//	    }
//
//	    public static Question<String> theErrorMessage() {
//	        return actor -> {
//	            Target errorMessage = LoginTask1Test.SUCCESS_MESSAGE; // Replace with the actual target for the error message
//	            return errorMessage.resolveFor(actor).getText();
//	        };
//	    }
//}
