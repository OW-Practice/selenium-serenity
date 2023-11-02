package Questions;

import Locators.LoginPage;
import ScreenplayPages.LoginWithCredentials;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class LoginQuestions implements Question<Boolean> {
	
    private final Target target;
    private final String expectedText;

    public LoginQuestions(Target target, String expectedText) {
        this.target = target;
        this.expectedText = expectedText;
    }

    public static LoginQuestions of(Target target, String expectedText) {
        return new LoginQuestions(target, expectedText);
    }
    
	@Override
	public Boolean answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		String actualText= Text.of(target).viewedBy(actor).asString();
		return actualText.equals(expectedText);
	}
}
