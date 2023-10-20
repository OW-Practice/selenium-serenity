package Questions;

import Locators.LoginPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LoginQuestions {
	
	public static Question<String>title(String error){
		return actor -> Text.of(LoginPage.errorMessage).viewedBy(actor).asString();
	}

}
